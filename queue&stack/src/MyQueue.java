import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 我的队列
 *
 * @author zzj
 * @since 2022/4/27 10:55
 */
public class MyQueue {
    /** store elements */
    private List<Integer> data;
    /** a pointer to indicate the start position */
    private int pStart;
    public MyQueue() {
        data = new ArrayList<Integer>();
        pStart = 0;
    }
    /** Insert an element into the queue. Return true if the operation is successful. */
    public boolean enQueue(int x) {
        data.add(x);
        return true;
    };
    /** Delete an element from the queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        pStart++;
        return true;
    }
    /** Get the front item from the queue. */
    public int front() {
        return data.get(pStart);
    }
    /** Checks whether the queue is empty or not. */
    /**
     * 理解为空 因为头指针始终指向第一个元素，就是当头指针指向的索引位置元素为空时其实就是队列为空
     * 一个队伍的队首索引>=队伍长度
     * @return
     */
    public boolean isEmpty() {
        return pStart >= data.size();
    }

    @Test
    public void test(){
        MyQueue q = new MyQueue();
        q.enQueue(5);
        q.enQueue(3);
        if (!q.isEmpty()) {
            System.out.println(q.front());
            System.out.println(q.data.get(0));
        }
        q.deQueue();
        if (!q.isEmpty()) {
            System.out.println(q.front());
        }
        q.deQueue();
        if (!q.isEmpty()) {
            System.out.println(q.front());
        }
    }

    @Test
    public void test1(){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.remove(0);
        System.out.println(integers.get(0));
    }

}
