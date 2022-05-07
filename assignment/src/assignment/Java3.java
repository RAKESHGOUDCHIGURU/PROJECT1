package assignment;

public class Java3 
{
	void meth1()
	{
		String s1="java";
		String s2=new String("java");
		char arr[]={'j','a','v','a'};
		String s3=new String(arr);
		String s4=new String(arr,2,2);
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);//java
		System.out.println("s3:"+s3);
		System.out.println("s4:"+s4);//java
		System.out.println("---------");
		System.out.println("s1 length:"+s1.length());
	}
	void meth2()
	{
		String s1="java";
		System.out.println("s1 before:"+s1);
		s1=s1.concat("is awesome");
        System.out.println("s1 after:"+s1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		Java3 aobj=new Java3();
				aobj.meth1();
		        aobj.meth2();
		        
		

	}

	}
}
