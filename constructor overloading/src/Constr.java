
public class Constr {

	int x;
	
	Constr(){
		System.out.println("empty");
	}
	
	Constr(int i){
		System.out.println("int");
		x = i;
	}
	
	Constr(double d){
		System.out.println("double");
		x = (int) d;
	}
	
	Constr(int i, int j){
		System.out.println("two integers");
		x = i * j;
	}
}

class OverloadConstr{
	public static void main(String[] args){
		Constr con1 = new Constr();
		Constr con2 = new Constr(3);
		Constr con3 = new Constr(11.11);
		Constr con4 = new Constr(1, 2);

		System.out.println("constructor1: " + con1.x);
		System.out.println("constructor2: " + con2.x);
		System.out.println("constructor3: " + con3.x);
		System.out.println("constructor4: " + con4.x);
	}
	
}
