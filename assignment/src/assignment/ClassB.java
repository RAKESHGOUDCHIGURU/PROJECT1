package assignment;

public class ClassB 
{
	void meth1()
	{
		int i=10;
		Integer ival11=new Integer(i);
		int ival12=i;
		Integer ival13=Integer.valueOf (i);
		char c='A';
		Character obj=Character.valueOf (c);
		System.out.println("PDT value:"+i);
		System.out.println("WCO value"+ival11);
		System.out.println("WCO value"+ival12);
		System.out.println("WCO value"+ival13);
		System.out.println("character WCO:"+obj);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    new ClassB().meth1();

	}

}
