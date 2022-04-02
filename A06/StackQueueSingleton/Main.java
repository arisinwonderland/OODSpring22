import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();

		StackQueue.getInstance().pushOnStack("One", list);
		StackQueue.getInstance().pushOnStack("Two", list);
		StackQueue.getInstance().pushOnStack("Three", list);
		StackQueue.getInstance().pushOnStack("Four", list);

		System.out.println(StackQueue.getInstance().popFromStack(list)); // Four
		System.out.println(StackQueue.getInstance().popFromStack(list)); // Three
		StackQueue.getInstance().pushOnStack("Five", list);
		System.out.println(StackQueue.getInstance().popFromStack(list)); // Five
		System.out.println(StackQueue.getInstance().popFromStack(list)); // Two

		list = new ArrayList<String>();

		StackQueue.getInstance().addToQueue("One", list);
		StackQueue.getInstance().addToQueue("Two", list);
		StackQueue.getInstance().addToQueue("Three", list);
		StackQueue.getInstance().addToQueue("Four", list);

		System.out.println(StackQueue.getInstance().removeFromQueue(list)); // One
		System.out.println(StackQueue.getInstance().removeFromQueue(list)); // Two
		StackQueue.getInstance().addToQueue("Five", list);
		System.out.println(StackQueue.getInstance().removeFromQueue(list)); // Three
		System.out.println(StackQueue.getInstance().removeFromQueue(list)); // Four
		System.out.println(StackQueue.getInstance().removeFromQueue(list)); // Five
	}
}
