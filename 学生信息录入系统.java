Feature_Collection.java

package com.aiit.thj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class Feature_Collection 
{

	public void Menu()
	{
		// TODO Auto-generated method stub
		System.out.println("操作数operation:");
		System.out.println("--------------------1.添加学生--------------------");
		System.out.println("--------------------2.删除学生--------------------");
		System.out.println("--------------------3.修改学生--------------------");
		System.out.println("--------------------4.查找学生--------------------");
		System.out.println("--------------------5.退出   --------------------");
	}
	 Scanner sc=new Scanner(System.in);

 
     String fileName="E:\\java_projects\\安徽信息工程学院学生信息录入系统.txt";
     
    //在E盘中创建一个文件
    public void newFile()throws IOException 
    {
	    File file=new File(fileName);
	    boolean exists = file.exists();//判断文件是否存在
	    if (exists)
	    {
	    	//存在的话，那就不创建
	    }
	    else 
	    {
	    	//不存在，那就创建
	        file.createNewFile();
	    }
    }
    
    
    public void add_Students()throws IOException 
	{
		// TODO Auto-generated method stub
    	ArrayList<Students>array=new ArrayList<Students>();
		redFile(fileName,array);
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);		
		Students s=new Students();
		while(true)
		{ 
			 System.out.println("请输入学生学号:");
	          s.setID(sc.next());
	         if(s.getID()==null||s.getID().length()==0) 
	         {
	         	System.out.println("警告----当前输入的为空串，请重新输入!");
	         	break;
	         }
	     
	         System.out.println("请输入学生姓名:");
	         s.setname(sc.next());
			if(s.getname()==null||s.getname().length()==0) 
	         {
	         	System.out.println("警告----当前输入的为空串，请重新输入!");
	         	break;
	         }
	    
	         System.out.println("请输入学生出生年月:");
	         s.setbirth(sc.next());
	         if(s.getbirth()==null|| s.getbirth().length()==0) 
	         {
	         	System.out.println("警告----当前输入的为空串，请重新输入!");
	         	break;
	         }
	     
	         System.out.println("请输入学生所在的学院:");
	         s.setinstitute(sc.next());
	         if(s.getinstitute()==null|| s.getinstitute().length()==0) 
	         {
	         	System.out.println("警告----当前输入的为空串，请重新输入!");
	         	break;
	         }
	   
	         System.out.println("请输入学生所在的行政班级:");
	         s.setadministrative_class(sc.next());
	         if(s.getadministrative_class()==null|| s.getadministrative_class().length()==0) 
	         {
	         	System.out.println("警告----当前输入的为空串，请重新输入!");
	            break;
	         }	
		   
		   System.out.println("添加信息成功");		   
		   array.add(s);
		   writeFile(fileName,array);
		   break;
		}
	 
	}

    
    //按照学号删除学生的信息（删）
    public void delete_Students() throws IOException 
    {
        ArrayList<Students> array=new ArrayList<Students>();
        
        redFile(fileName,array);

        if (array.size() == 0) 
        {
            System.out.println("您还没有录入学生信息");
        } else 
        {
            int temp=0;
            System.out.println("请输入要删除学生的学号：");
            String id=sc.next();
            
            for (int i=0;i<array.size();i++) 
            {
                if (array.get(i).getID().equals(id))
                {
                    array.remove(i);//按下标删除
                   
                    writeFile(fileName,array);
                    System.out.println("删除成功！");
                    temp=1;
                    break;
                }
             }
            if (temp==0)
            {
                System.out.println("此学生的信息尚未录入！");
            }
        }
    }

    
    public void update_Students() throws IOException 
    {
        ArrayList<Students> array=new ArrayList<Students>();
       		
        redFile(fileName,array);

        if (array.size()==0)
        {
            System.out.println("您还没有录入学生信息");
        }
        else
        {
            System.out.println("请输入要修改学生的学号：");
            String id=sc.nextLine();
            int n=0;
           
			for (Students temp:array)
			{
                if (temp.getID().equals(id))
                {
                    set(temp);
                    System.out.println("修改完成！");
                    n=1;
                }
            }
            if (n==0)
            {
                System.out.println("此学生的信息尚未录入！");
            }
        }
       
        writeFile(fileName,array);
    }

    public void set(Students s)
   {
        System.out.println("请选择你要修改的信息！");
        System.out.println("1.姓名");
        System.out.println("2.出生年月");
        System.out.println("3.学院");
        System.out.println("4.行政班级");
        switch (sc.nextInt())
        {
            case 1:
                 System.out.println("请输入修改后的姓名：");
                 s.setname(sc.next());
                 break;
            case 2:
                 System.out.println("请输入修改后的出生年月：");
                 s.setbirth(sc.next());
                 break;
            case 3:
            	 System.out.println("请输入修改后的学院：");
            	 s.setinstitute(sc.next());	          
                 break;
            case 4:
            	 System.out.println("请输入修改后的行政班级：");
            	 s.setadministrative_class(sc.next());
                 break;
        }
        
    }

    
    //显示所有的学生信息（查）
    public void find_Students() throws IOException 
    {
       ArrayList<Students> array=new ArrayList<Students>();
       
        redFile(fileName,array);
        int flag=0;
        if (array.size()==0)
        {
            System.out.println("您还没有录入学生信息");
        }
        else
        {
            for (Students temp:array)
            {
                System.out.println(temp.toString());
            }
            
            @SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
	        	System.out.println("请输入待查学生的学号ID:");
	        	String id=sc.nextLine();
	        	int len=array.size(); 
	        	
	            for (int i = 0; i < len; i++) 
	            {
	               Students s = array.get(i);
	               if(id.equals(s.getID()))
	               { 
	            	   System.out.println("学号			姓名			出生年月				学院				行政班级");
	            	   System.out.println(
	            			   s.getID() +
	            			   "			" + 
	            			   s.getname() + 
	            			   "			" + 
	            			   s.getbirth() + 
	            			   "			" + 
	            			   s.getinstitute()+
	            			   "			"+
	            			   s.getadministrative_class());
	            	           flag=1;
	            	           break;	            	   	              
	               }	             	              
	             }	            
	         }	
        if(flag==0)
        {        	
	        System.out.println("查无此人!");
        
        }   
    }

    public static void redFile(String fileName,ArrayList<Students> arrayList) throws IOException 
    {
        
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
                               
        
        String temp="0";
        while ((temp=bufferedReader.readLine())!=null)
        {
            Students s=new Students();
            
            String[] arry = temp.split(",");       
            s.setID(arry[0]);
            s.setname(arry[1]);
            s.setbirth(arry[2]);
            s.setinstitute(arry[3]);
            s.setadministrative_class(arry[4]); 


            arrayList.add(s);
        }
        
        bufferedReader.close();
    }

   
    public void writeFile(String fileName,ArrayList<Students> arrayList) throws IOException
    {
        
        FileWriter fileWriter = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        Students s;
        for (int i = 0; i < arrayList.size(); i++) 
        {
            s=arrayList.get(i);
           
            StringBuilder sb = new StringBuilder();
          
            sb. append(s.getID());
            sb. append(",");
            sb. append(s.getname());
            sb. append(",");
            sb. append(s.getbirth());
            sb. append(",");
            sb.append(s.getinstitute());
            sb. append(",");
            sb. append(s.getadministrative_class());

       

            bufferedWriter.write(sb.toString());
            bufferedWriter.newLine();       
            bufferedWriter.flush();         
        }
       
        bufferedWriter.close();
    }

    private Writer append(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}



Students.java

package com.aiit.thj;

public class Students 
{
	private String ID;//学号
	private String name;//姓名
	private String birth;//出生年月
	private String institute;//学院
	private String  administrative_class;//行政班级
	
	public String getID() 
	{
		return ID;
	}
	public void setID(String ID)
	{
	    this.ID = ID;
	}

	public String getname()
	{
	    return name;
	}

	public void setname(String name) 
	{
	    this.name = name;
	}

	public String getbirth()
	{
	    return birth;
	}

	public void setbirth(String birth) 
	{
	    this.birth = birth;
	}

	public String getinstitute() 
	{
	    return institute;
	}

	public void setinstitute(String institute)
	{
	    this.institute= institute;
	}
	public String getadministrative_class() 
	{
	    return administrative_class;
	}

	public void setadministrative_class(String administrative_class)
	{
	    this.administrative_class= administrative_class;
	}
	 @Override
	    public String toString() 
	 {
	        return "Students{" +
	                "ID='" + ID + '\'' +	           
	                ", name=" + name +	                
	                ", birth='" + birth + '\'' +
                    ", administrative_class =" +  administrative_class+'\'' +
	                '}';
	 }		
}






Students_Entry_System.java

package com.aiit.thj;
import java.io.IOException;
import java.util.Scanner;
public class Students_Entry_System 
{
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		System.out.println("----------欢迎来到XXXXXX学院学生录入系统----------\n");
		User u=new User();
        boolean res=u.landing();
        while(!res)
        { 
        	res=u.landing();
        }
	     Feature_Collection fc = new Feature_Collection ();
	     fc.newFile();
	     fc.Menu();  
	     int operation=0;
		 Scanner sc = new Scanner(System.in); 
		 while (true)
	        {
	        	System.out.println("请选择相关操作数operation:");
	        	operation=sc.nextInt();
		        switch (operation)
	            {
	             case 1:
	            	    fc.add_Students();
	            	    choice_judgement();
	                    break;
	             case 2:
	            	     fc.delete_Students();
	            	     choice_judgement();
	                     break;
	             case 3:
	            	     fc.update_Students();
	            	     choice_judgement();
	                     break;
	             case 4:
	            	   fc.find_Students();
	            	   choice_judgement();
	                   break;
	             case 5:
	             	   System.out.println("感谢您使用安徽信息工程学院学生信息录入系统，成功退出，欢迎下次再次使用!");
	             	   return;
	             default:
	                   System.out.println("当前所输入的操作数有误,请重新输入!");
	                   break;
	            }
           }
	     
	}

	private static void choice_judgement() 
	{
		// TODO Auto-generated method stub
		 String choice="";
		 Scanner sc = new Scanner(System.in); 
		System.out.println("y->继续\tn->退出\n");
		 while(true)
		 { 
			 choice=sc.nextLine();
			 if("y".equals(choice))
			 { 			
				 return;
			 }
			 else if("n".equals(choice))
			 { 				 
				 return;
			 }
			 else
			 { 
				 System.out.println("您当前输入有误,请重新输入!");
			 }
	
		 }		 
		
	}	
}


User.java


package com.aiit.thj;

import java.util.Scanner;

public class User 
{
	 Scanner sc=new Scanner(System.in);
	  public String Username,username;
	  public String Password,password;
	  
	  public User()
	  { 
		 Username="admin";
		 Password="admin";
	  }
	  public boolean landing()
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("请输入用户名:");username = new String(sc.next());
		  System.out.println("请输入密码:");password =new String(sc.next());
		  if(username.equals(Username)&&password.equals(Password))
		  {
			System.out.println("登陆成功!\n");return true;
		  }
		  else
		  {
			System.out.println("账号有误，请重新登陆!\n");return false;
		  }  
	  }	 
}
