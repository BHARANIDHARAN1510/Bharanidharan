package Class;

public class ClassVariableDemo3 {
	//local, instance,class  - scope
	//local variable-is declared with in a method
	//instance Variable - any variable declared outside a method is a instance variable
	//class variable - any variable declared with the keyword static is called class variable
	
	int s;
	static int ss;
	void met(int i) {
		System.out.println(i);
	}
	void met2(long ll) {
		System.out.println(ll);
	}
	
	public static void main(String[] args) {
		ClassVariableDemo3 obj=new ClassVariableDemo3();
		
		obj.s=10;
		//obj.ss=1000;
		ClassVariableDemo3.ss=1000;
		
		ClassVariableDemo3 obj2=new ClassVariableDemo3();
		
		System.out.println(obj.s+":"+obj2.s);
		System.out.println(obj.ss+":"+obj2.ss);
		
		obj2.s=20;
		//obj2.ss=2000;
		ClassVariableDemo3.ss=2000;
		
		System.out.println(obj.s+":"+obj2.s);
		//System.out.println(obj.ss+":"+obj2.ss);
		System.out.println(ClassVariableDemo3.ss+":"+ClassVariableDemo3.ss);
		
		//local variable
		
		obj.met(999);
		ClassVariableDemo3 objX=obj;
		objX.met(888);
		System.out.println(obj.s+":"+objX.s);
	}
}
