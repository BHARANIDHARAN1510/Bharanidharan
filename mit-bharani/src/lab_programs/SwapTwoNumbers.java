package lab_programs;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		float first = 3.0f, second = 5.0f;
		System.out.println("---Before Swap---");
		System.out.println("First number= "+first);
		System.out.println("Second number= "+second);
		
		float temporary = first;
		first = second;
		second = temporary;
		System.out.println("---After Swap---");
		System.out.println("First number= "+first);
		System.out.println("Second number= "+second);
		}

}
