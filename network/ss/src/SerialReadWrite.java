

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;

public class SerialReadWrite implements SerialPortEventListener {

   CommPortIdentifier commPortIdentifier;
   CommPort commPort;
   InputStream in;
   OutputStream out;
   BufferedInputStream bin;
   SerialPort serialPort;

   public SerialReadWrite() {
   }

   public SerialReadWrite(String portName) throws Exception {
      commPortIdentifier = CommPortIdentifier.getPortIdentifier(portName);
      System.out.println("Identifier Com Port!");
      connect();
      System.out.println("Connect Com Port!");
      new Thread(new SerialWrite()).start();
      System.out.println("Start CAN Network.....");
      
   }

   public void connect() throws Exception {
      if(commPortIdentifier.isCurrentlyOwned()) {
         
      }else {
         commPort = commPortIdentifier.open(this.getClass().getName(), 5000); //5�ʵ��� ������ ����� ������ ����
         if(commPort instanceof SerialPort) {
             serialPort = (SerialPort) commPort;
              serialPort.addEventListener(this);
                serialPort.notifyOnDataAvailable(true);
                serialPort.setSerialPortParams(921600, // ��żӵ�
                  SerialPort.DATABITS_8, // ������ ��Ʈ
                  SerialPort.STOPBITS_1, // stop ��Ʈ
                  SerialPort.PARITY_NONE); // �и�Ƽ
                in = serialPort.getInputStream();
                bin = new BufferedInputStream(in);
                out = serialPort.getOutputStream();
            //java���� Ư�� port�� CAN�� ����ϰ� �ִ�. (�׷��� Input/OutputStream�� �ʿ�)
         }else {
            System.out.println("this is not a Serial Port");
         }
      }
   }

   
   public void send(String msg) {
      new Thread(new SerialWrite(msg)).start();
   }
   
   
   //CAN Network�� �����Ѵٰ� �����ϱ� ���� 
   class SerialWrite implements Runnable {
      String data; //�� data�� �����忡�� write�Ѵ�. 
      
      public SerialWrite() {
         this.data = ":G11A9\r"; //"G" : ���۹��� , "11" : ��� , "A9": checksum , "\r":������(16����)
      }
      
      public SerialWrite(String msg) {
         this.data = convertData(msg);
      }
      
      public String convertData(String msg) {
         msg = msg.toUpperCase(); 
         msg = "W28"+msg;
         //CAN������ ��ҹ��� ������ �� �ȵ�
         //W28 00000000 0000000000000000
         
         //checksum making
         char c[] = msg.toCharArray();
         int checkSum = 0;
         for (char ch:c) {
            //character array �迭 ������
            checkSum += ch;
             
         }
         
         checkSum = (checkSum & 0xFF);
         
         
         String result = ":";
         result += msg+Integer.toHexString(checkSum).toUpperCase()+"\r"; // Integer.toHexString(i) : 10������ 16������ ��ȯ
         System.out.println(result);
         return result;
      }
      @Override
      public void run() {
         byte[] outData = data.getBytes();
         try {
            //CAN Network Area�� ���.
            out.write(outData);
         } catch (IOException e) {
            e.printStackTrace();
         }  
      }
      
   }
   
   
   
   
   
   
   
   
   public static void main(String[] args) { 
      SerialReadWrite sc = null;
      String id = "00000000";
      String data = "000000000000000a";
      String msg = id+data;
      try {
         sc = new SerialReadWrite("COM9");
         sc.send(msg);
      } catch (Exception e) {
         System.out.println("Connect Fail");
         e.printStackTrace();
      }
   }

   @Override //�̺�Ʈ �߻��� �� �޼��尡 �޴´�. �� �̺�Ʈ�� java application���� ���޵ǰ�, �̰��� serialEvent�� �´�.
   public void serialEvent(SerialPortEvent event) {
      
       switch (event.getEventType()) {
        case SerialPortEvent.BI:
        case SerialPortEvent.OE:
        case SerialPortEvent.FE:
        case SerialPortEvent.PE:
        case SerialPortEvent.CD:
        case SerialPortEvent.CTS:
        case SerialPortEvent.DSR:
        case SerialPortEvent.RI:
        case SerialPortEvent.OUTPUT_BUFFER_EMPTY:
         break;
        case SerialPortEvent.DATA_AVAILABLE:
         byte[] readBuffer = new byte[128];

         try {

          while (bin.available() > 0) {
           int numBytes = bin.read(readBuffer);
          }

          String ss = new String(readBuffer);
          System.out.println("Receive Low Data:" + ss + "||");
          
         } catch (Exception e) {
          e.printStackTrace();
         }
         break;
        }
       }
   
      
   

}