public class IntStackTest {
	public static void main(String[] args) {
		IntStack stack = new IntStack();

		System.out.println(stack);

		stack.push(1);
		System.out.println(stack);

		stack.push(2);
		System.out.println(stack);

		stack.push(3);
		System.out.println(stack);

		stack.plus();
		System.out.println(stack);

		stack.neg();
		System.out.println(stack);
	}
}
