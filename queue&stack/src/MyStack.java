import org.junit.Test;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Stack;

/**
 * 我的栈
 *
 * @author zzj
 * @since 2022/4/27 17:41
 */
public class MyStack {
    private List<Integer> data;               // store elements

    public MyStack() {
        data = new ArrayList<>();
    }

    /**
     * Insert an element into the stack.
     */
    public void push(int x) {
        data.add(x);
    }

    /**
     * Checks whether the queue is empty or not.
     */
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * Get the top item from the queue.
     */
    public int top() {
        return data.get(data.size() - 1);
    }

    /**
     * Delete an element from the queue. Return true if the operation is successful.
     */
    public boolean pop() {
        if (isEmpty()) {
            return false;
        }
        data.remove(data.size() - 1);
        return true;
    }

    @Test
    public void test(){
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            System.out.println(i++);
            System.out.println(i);
        }
        for (int i = 0; i < 3; ++i) {
            System.out.println(i);
            System.out.println(++i);
        }
    }




}
// "static void main" must be defined in a public class.
class Main {
    public static void main(String[] args) {
        // 1. Initialize a stack.
        Stack<Integer> s = new Stack<>();
        // 2. Push new element.
        s.push(5);
        s.push(13);
        s.push(8);
        s.push(6);
        // 3. Check if stack is empty.
        if (s.empty()) {
            System.out.println("Stack is empty!");
            return;
        }
        // 4. Pop an element.
        s.pop();
        // 5. Get the top element.
        System.out.println("The top element is: " + s.peek());
        // 6. Get the size of the stack.
        System.out.println("The size is: " + s.size());
    }
}
