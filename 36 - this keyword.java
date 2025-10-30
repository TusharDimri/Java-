class Human
{	
	private int age;
	private String name;
	
	public int getAge()
	{
		return age;
	}
	public void SetAge(int age, Human obj)
	{
		//Human obj1=new Human();
		Human obj1=obj;
		obj1.age=age;
		//this.age=age;
	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	

}

 class Demo {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();

		obj.SetAge(30,obj);
		obj.setName("Reddy");
		
		System.out.println(obj.getName()+" : "+obj.getAge());
	
	}
}