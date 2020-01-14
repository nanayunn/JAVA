package day06;

public class BookMgr_2 {
	
	Book[] booklist = new Book[5];
	
	
	
	public BookMgr_2() {
		for (int b = 0; b<booklist.length; b++) {
			booklist[b] = new Book();
		}
	}
	
	public BookMgr_2(Book[] booklist) {
		this.booklist = booklist;
	}
	
	public void addBook(Book book) {
		for (int i = 0;i < booklist.length;i++) {
		booklist[i] = book;
			if (i>booklist.length) {
				break;
			}
		}
	}

	public void printBookList() {
		System.out.printf("==== 책 목록 ====%n");
		for(int j = 0; j<booklist.length;j++) {
			System.out.printf("%s %n", booklist[j].getTitle());
		}
				
		
		
	}
	public void printTotalPrice() {
		int sum = 0;
		for(int a =0; a<booklist.length;a++) {
			sum += booklist[a].getPrice();
		}
		System.out.printf("====책 가격의 총합=====%n");
		System.out.printf("전체 책 가격의 합 : %d", sum);
	}
	
	

}
