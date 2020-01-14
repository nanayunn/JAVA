package day10;

public class MyStack {

		int[] stack;
		int count = 0;
		
		
		MyStack(){
			stack = new int[10];
		}
		MyStack(int n){
			if(n<=0) stack= new int[10];
			stack = new int[n];
		}
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return count ==0? true:false;
		}
		public void push(int i) {
			if(isFull()) return;
			stack[count] = i;
			count++;
			
		}
		public boolean isFull() {
			
			return count == stack.length? true:false;
		}
		public int top() {
			if(isEmpty()) return -1;
			return stack[count-1];
		}
		public int pop() {
			if(isEmpty()) return -1;
			return stack[--count];
			}
		
}
