package day09;

import javax.swing.JOptionPane;

public class Test02 {

	public static void main(String[] args) {
		Command delete =
		() -> {System.out.println("데이터 등록");};
		Command update =
		() -> {System.out.println("데이터 등록");};
		Command insert =
			() -> {System.out.println("데이터 등록");};
		Command select =
			() -> {System.out.println("데이터 선택");};
		
	

			
			String msg = JOptionPane.showInputDialog("명령어를 입력하세요..(삭제/업데이트/추가)");
			
			switch (msg) {
			case "삭제" : 
				delete.exec();
				
				break;
				
			case "업데이트":
				
				update.exec();
				break;
				
			case "추가":
				
				insert.exec();
				break;
				
			default:
				break;
			}
};
}
