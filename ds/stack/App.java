package ds.stack;

public class App {

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>(10);
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        stack1.push(50);

        while (!stack1.isEmpty()) {
            Object value = stack1.pop();
            System.out.println(value);
        }

        String reverseMe = "Kenai";
        Stack<Character> stack2 = new Stack<Character>(20);
        for(int i = 0; i < reverseMe.length(); i++) stack2.push(reverseMe.charAt(i));

        while (!stack2.isEmpty()) {
            Object value = stack2.pop();
            System.out.println(value);
        }
    }
}
