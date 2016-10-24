public class StringTest{
	public static void main(String[] args){
		StringStack stack =  new StringStack(5);
		stack.push("raprap");
		stack.push("me");
		stack.push("paul");
		System.out.println(stack);
		System.out.println(stack.size());
		stack.push("ASDEASDS");
		stack.push("SDA");
		stack.push("DQW");
		System.out.println(stack.size());
		System.out.println(stack);
		String a = stack.pop();
		System.out.println(a);
		System.out.println(stack.size());
		a = stack.pop(3);
		System.out.println(a);
		a = stack.peek();
		System.out.println(a);
	}
}