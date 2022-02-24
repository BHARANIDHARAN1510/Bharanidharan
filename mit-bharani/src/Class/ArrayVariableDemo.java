package Class;

public class ArrayVariableDemo {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		
		ArrayVariableDemo obj=new ArrayVariableDemo();
		
		//System.out.println("before passing...:"+arr[2]);
		//obj.pass(arr);//be default arrays are pass by reference
		
		//System.out.println("after passing...:"+arr[2]);
		
		//solution
		
		//anonymous array
		obj.pass(new int[] {54,78,89,67});
		
		//System.arrayCopy
		
		int arrcop[]=new int[4];
		
		System.arraycopy(arr, 0, arrcop, 0, 4);
		
		System.out.println("before passing...:"+arr[2]);
		obj.pass(arrcop);//be default arrays are pass by reference
		
		System.out.println("after passing...:"+arr[2]);
		System.out.println(arrcop[2]);
		
	}
	
	void pass(int a[]) {
		a[2]=999999;
	}
}