package day09;


public class Anonymous_class {

	public static void main(String[] args) {
		Command delete = new DeleteCommand();
		
		Command insert = new Command() {
			@Override
			public void exec() {
				System.out.println("데이터 등록");
				
			}
		};
		Command update = new Command() {
			
			@Override
			public void exec() {
				System.out.println("데이터 업데이트");
				
			}
		};
		
		
		Command select = new Command() {
			
			@Override
			public void exec() {
				System.out.println("데이터 추가 삽입");
				
			}
		};

		update.exec();
		delete.exec();
	}

}

interface Command{
	void exec();
	default public void ppp() {
		System.out.println("pppppppppp");
	};
	
}

class DeleteCommand implements Command{
	
	@Override
	public void exec() {
		System.out.println("DeleteCommand 작업 수행");
	}
}
