
public class Overload {

	void func(byte x){
		System.out.println("byte: " + x);
	}
	
	void func(int x){
		System.out.println("int: " + x);
	}
	
	void func(double x){
		System.out.println("double: " + x);
	}
}

class Convert{
	public static void main(String[] args){
		Overload obj = new Overload();
		
		int i = 5;
		double d = 5.5;
		byte b = 99;
		short s = 10;
		float f = 55.5F;
		
		obj.func(i);
		obj.func(d);
		obj.func(f);
		obj.func(s);
		obj.func(b);
		
	}
}
