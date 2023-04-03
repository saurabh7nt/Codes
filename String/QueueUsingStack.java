import java.util.*;

class MyQueue{
	
	Stack<Integer> st1 = new Stack<>();
	Stack<Integer> st2 = new Stack<>();

	public void enqueue(int element){
		st1.push(element);
	}

	public int dequeue(){
		while(!st1.isEmpty()){
			st2.push(st1.pop());
		}
		int ans = st2.pop();
		while(!st2.isEmpty()){
			st1.push(st2.pop());
		}
		return ans;
	}
}

public class QueueUsingStack {    
    public static void main(String[]args){
		MyQueue q = new MyQueue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());	
    }
}
