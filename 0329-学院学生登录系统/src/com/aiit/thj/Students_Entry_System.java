package com.aiit.thj;
import java.io.IOException;
import java.util.Scanner;
public class Students_Entry_System 
{
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		System.out.println("----------欢迎来到安徽信息工程学院学生录入系统----------\n");
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
