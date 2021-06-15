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
