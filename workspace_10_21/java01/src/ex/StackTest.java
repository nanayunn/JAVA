package ex;

import java.util.Arrays;

public class StackTest {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack(10);
		if(stack.isEmpty()){
			System.out.println("스택이 비어있습니다.");
		}
		
		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}
		
		if(stack.isFull()){
			System.out.println("스택이 가득 찼습니다.");
		}
		
		System.out.println("최상위 숫자 : " + stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if(num != -1)
				System.out.println(num);
		}

			
	}

}

class MyStack{
	int number;
	boolean Empty;
	boolean Full;
	
	
	
	public MyStack() {
		MyStack[] mystack = new MyStack[10];
	}
	public void push(int i) {
		
	}
	public int pop() {
		
		return 0;
	}
	public int top() {
		
		return 0;
	}
	public MyStack(int number) {
		super();
		this.number = number;
		
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isEmpty() {
		return Empty;
	}
	public void setEmpty(boolean empty) {
		Empty = empty;
	}
	public boolean isFull() {
		return Full;
	}
	public void setFull(boolean full) {
		Full = full;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (Empty ? 1231 : 1237);
		result = prime * result + (Full ? 1231 : 1237);
		result = prime * result + number;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyStack other = (MyStack) obj;
		if (Empty != other.Empty)
			return false;
		if (Full != other.Full)
			return false;
		if (number != other.number)
			return false;
		return true;
	}
	
	
	
	
}
