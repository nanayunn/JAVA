package util;

public class Stack<E>{

		E[] stack;
		int count = 0;
		
		
		public Stack(){
			stack = (E[])new Object[10];
		}
		Stack(int n){
			if(n<=0) stack= (E[])new Object[10];
			stack = (E[])new Object[n];
		}
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return count ==0? true:false;
		}
		public void push(E i) {
			if(isFull()) return;
			stack[count] = i;
			count++;
			
		}
		public boolean isFull() {
			
			return count == stack.length? true:false;
		}
		public E top() {
			if(isEmpty()) return null;
			return stack[count-1];
		}
		public E pop() {
			if(isEmpty()) return null;
			return stack[--count];
			}
		
}
