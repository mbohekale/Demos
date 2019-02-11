import java.util.*;
import java.net.*;
import java.util.Scanner;
import java.io.*;
public class Server{
 public static void main(String[] args)throws Exception{
  
		int temp,number;
	 ServerSocket s1 = new ServerSocket(12345);
		Socket ss = s1.accept();
		System.out.println("Connected.......");
	 	Scanner sc = new Scanner(ss.getInputStream());
		number = sc.nextInt();
		temp = number * 2;
		
		PrintStream p = new PrintStream(ss.getOutputStream());
		p.println(temp); 
		
	
	
 
 }

}