Landing.java

package com.aiit.thj;

import java.util.Scanner;

public class Landing
{


public static void menu()
{ 
	
	  System.out.println("------------欢迎来到AIIT-Nullptr的直播间------------");
	  System.out.println("【请输入相关操作数：】");
	  System.out.println("【1.已有账号、密码，直接登录！】");
	  System.out.println("【2.无账号，需注册后登录！】");
	  System.out.println("【3.退出！】");		 	
	  
}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		User u=new User();
		
		menu();
		int operation=0;
		while(true)
		{ 
			System.out.println("请输入相关操作数operation:");
			Scanner sc=new Scanner(System.in);
			operation=sc.nextInt();
			switch(operation)
			{ 
			case 1:
				System.out.println("该用户已有账号、密码，直接登录！");
				//
				u.landing1();
				
				break;
			case 2:
				System.out.println("该用户未进行注册，注册后登录！");
				//
				u.landing2();
				break;
			case 3:
				System.out.println("成功退出!");
				return;
			default:
				System.out.println("当前操作数输入有误，请按照规定的操作数进行相关输入！");
				//
				break;
					
			}
		}

		

		
		
		
	}





}




user.java
package com.aiit.thj;

import java.util.Scanner;

public class User 
{
  Scanner sc=new Scanner(System.in);
  public String Username,username;
  public String Password,password;
  
  public User()
  { 
	  Username=null;
	  Password=null;
  }
 
  public boolean landing1()
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("请输入用户名账号:");username = new String(sc.next());
	  System.out.println("请输入密码:");password =new String(sc.next());
	  if(username.equals(Username)&&password.equals(Password))
	  {
		System.out.println("登陆成功!");return true;
	  }
	  else
	  {
		System.out.println("登录失败!");return false;
	  }  
  }
  
  public boolean landing2()
  { 
	  System.out.println("用户名规则：小写字母或数字组成，长度6-12位");
	  System.out.println("密码规则：首字符为大写字母；第2，3，4位字符为数字；后面为小写字母组成；总长度为：8-16位");
	  String Username_rule= "[a-z0-9]{6,12}", Password_rule="[A-Z]{1}[0-9]{3}[a-z]{4,12}";
	  
	  System.out.println("请输入待注册的用户名账号:");Username = new String(sc.next());
	  System.out.println("请输入待注册的密码:");Password =new String(sc.next());
	  
	  if(Username.matches(Username_rule)&&Password.matches( Password_rule))
	  {
			System.out.println("注册成功");landing1();
			return true;
	  }
	  else
	  {
			System.out.println("用户名和密码不满足规则,请重新注册");
			return false;
	  }
  }
  
  
}

