import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client{
 public static void main(String[] args)throws IOException{
	int number,temp;
		 
    Scanner sc = new Scanner(System.in);		 
	
	Socket s = new Socket("127.0.0.1",12345);
	Scanner sc1 = new Scanner(s.getInputStream());
	
	PrintWriter pw = new PrintWriter(s.getOutputStream());
	
	System.out.println("Enter any number");
	number = sc.nextInt();
	// from the server
	pw.println(number);
	pw.flush();
	
	temp = sc1.nextInt();
	System.out.println(temp);
	
	
 
 }

}