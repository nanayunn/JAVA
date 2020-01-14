package ex;

public class Prob6 {
	public static void main(String[] args) {
		//도서관리 프로그램
		
		BookMgr mgr = new BookMgr();
//		mgr.printBookList();
		mgr.addBook(new Book("JAVA", 900));
		mgr.addBook(new Book("JA", 9000));
		mgr.addBook(new Book("VA", 900000));
		mgr.addBook(new Book("VA", 900000));
		mgr.addBook(new Book("JAV", 900));
		mgr.printBookList();
		
		Book result = mgr.searchBook("jav");
		if (result!=null)result.print();
		else System.out.println("검색 데이터가 없습니다.");
	}
}


class Book{
	private String title;
	private int price;
	
	public Book() {
		
	}
	public Book(String title, int price) {

		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void print() {
		System.out.printf("Book[%s : %d]%n", title, price);
	}
	
	
}

class BookMgr{
	private int cnt = 0;
	
	private Book[] booklist;
	
	
	
	public BookMgr() {
		booklist = new Book[19];
		
	}

	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}

	public Book[] getBooklist() {
		return booklist;
	}

	public void setBooklist(Book[] booklist) {
		this.booklist = booklist;
	}


	public void printBookList(){
		System.out.println("*****booklist******");
		if(cnt ==0) {
			System.out.println("데이터 없음");
			return;
			}
		for(int i = 0; i<cnt;i++) {
			
			System.out.println(booklist[i].getTitle());
		}
		
//		for(Book data : booklist) {
//			System.out.println(data.getTitle());
//		}
				
		
			
		}
		
		public void addBook(Book book) {
			
		if (cnt == booklist.length) {
			Book[] temp = new Book[booklist.length*2];
			System.arraycopy(booklist, 0, temp, 0, booklist.length);
			booklist = temp;
		}
		booklist[cnt] = book;
		cnt++;
		
			
//				System.out.println(booklist);
	}
	//Book의 배열로 리턴 타입 가줘야함(ㅠㅐㅐ)
	public Book searchBook(String title) {
		Book data = null;
		for(int i = 0; i<cnt; i++) {
//			if(booklist[i].getTitle().contains(title)) {
				if(booklist[i].getTitle().toUpperCase().contains(title.toUpperCase())) {
				data = booklist[i];
			}
		}
		return data;
		
	}
		
		
		
}






