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

		IntStack stack2 = new IntStack();
		stack2.push(1);
		stack2.push(-5);

		System.out.println(stack + " == " + stack2 + " -> " + stack.equals(stack2));

		stack.push(100);
		stack2.push(99);
		System.out.println(stack + " == " + stack2 + " -> " + stack.equals(stack2));

		stack2.pop();
		System.out.println(stack + " == " + stack2 + " -> " + stack.equals(stack2));

		stack.pop();
		stack.pop();
		System.out.println(stack + " == " + stack2 + " -> " + stack.equals(stack2));

		stack.pop();
		stack2.pop();
		stack2.pop();
		// beide leer
		System.out.println(stack + " == " + stack2 + " -> " + stack.equals(stack2));

		stack.push(1);
		stack2.push(2);
		System.out.println(stack + " == " + stack2 + " -> " + stack.equals(stack2));

		stack.push(2);
		System.out.println(stack + " == " + stack2 + " -> " + stack.equals(stack2));
	}
}
