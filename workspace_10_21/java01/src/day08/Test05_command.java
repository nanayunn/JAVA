package day08;

import javax.swing.JOptionPane;

public class Test05_command {

	public static void main(String[] args) {
		Command cmd = null;
		
		String msg = JOptionPane.showInputDialog("명령어를 입력하세요..(삭제/업데이트/추가)");
		switch (msg) {
		case "삭제": 
			cmd = new DeleteCommand();
			break;
		case "업데이트":
			cmd = new UpdatedCommand();
			break;
		case "추가":
			cmd = new InsertCommand();
			break;

		default:
			break;
		}
		
		
		if (cmd != null) 
			cmd.exec();
			cmd.ppp();
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


class InsertCommand implements Command{

	@Override
	public void exec() {
		System.out.println("InsertCommand 작업 수행");
		
	}
	
}
class UpdatedCommand implements Command{
	
	@Override
	public void exec() {
		System.out.println("UpdatedCommand 작업 수행");
		
	}
	@Override
	public void ppp() {
		System.out.println("=================");
	}
	
}



