package day06;

public class BookMgr {
	
	Book[] booklist = new Book[5];
	int num = 0;
	
	
	public BookMgr() {
		for (int b = 0; b<booklist.length; b++) {
			booklist[b] = new Book();  
		}
	}
	
	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}
	
	public void addBook(Book book) {
		booklist[num] = book;
		num++;
//		for (int i = 0;i < booklist.length;i++) {
//		booklist[i] = book;
//		
//			if (i>booklist.length) {
//				break;
//			}
//		}
	}
	
	
	public void printBookList() {
		System.out.printf("==== 책 목록 ====%n");
		String[] B = {};
		
		for(int j = 0; j<booklist.length;j++) {
			System.out.printf("%s %n", booklist[j].getTitle());
//			System.arraycopy(booklist, 0, B, 0, 5);
//			System.out.println(B);
//			int j = 0
//			if (j<booklist.length) {
//				System.out.printf("%s %n", booklist[j].getTitle());
//				j++
//			}
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
