package ser;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ser {

	public static void main(String[] args) throws Exception {
		FileOutputStream fo = 
					new FileOutputStream("user.ser");
		
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		
		ObjectOutputStream oos = new ObjectOutputStream(bo);
		
		ArrayList list = null;
		list =  new ArrayList<User>();
		
		User user1 = new User("id01","�̸���", 30);
		User user2 = new User("id02","�踻��", 20);
		User user3 = new User("id03","�ڸ���", 40);
		User user4 = new User("id04","�ָ���", 10);
		
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);
		
		oos.writeObject(list);
		System.out.println(list);
		oos.close();
		
		//------------------------------------------------------------------------
		FileInputStream fi = 
				new FileInputStream("user.ser");
	
	BufferedInputStream bi = new BufferedInputStream(fi);
	
	ObjectInputStream ois = new ObjectInputStream(bi);
	
	ArrayList<User> list2 =(ArrayList<User>) ois.readObject();

	//User inUser = ois.readObject();
	System.out.println(list2.size());
	ois.close();
	}

}
