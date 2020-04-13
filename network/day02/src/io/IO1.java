package io;

import java.awt.image.ImagingOpException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.IIOException;

public class IO1 {

	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fr = new FileReader("text.txt");
			fw = new FileWriter("copy.txt");
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw,5);
			
			
			int data = 0;
			int sum = 0;
			String str = "";
//			while ((data = fr.read()) != -1) {
			while ((str = br.readLine()) != null) {
				sum ++;
//				System.out.println((char)data);
				System.out.println(str);
				bw.write(str);
			}
			System.out.println("sum : " + sum);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) {
					br.close();
				}
			}catch(IOException e) {
				try {
					if(bw != null) {
						bw.close();
					}
				}catch(IOException e1){
					e1.printStackTrace();
				}e.printStackTrace();
			}
		}
//		} finally {
//			try {
//				if(fr != null)
//				{
////					fr.close();
//					br.close();
//				}			
//			} catch (IOException e) {
//				try {
//			
////					fr.close();
//					br.close();
//				} catch (IOException e1) {
//					
//					e1.printStackTrace();
//				}
//				e.printStackTrace();
//			}
//		}

	}

}
