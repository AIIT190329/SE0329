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
