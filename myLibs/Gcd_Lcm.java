package myLibs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gcd_Lcm {

	public static int myGcd(int m,int n){
		return n==0?m:myGcd(n,m%n);
	}
	public static int myLcm(int m,int n) {
		return m*n/myGcd(m, n);
	}
	
//	//for try run:
//	public static void main(String[] args) throws IOException {
//		InputStreamReader isr=new InputStreamReader(System.in);
//		BufferedReader buf=new BufferedReader(isr);
//		System.out.println("please choose which function?(1)GCD (2)LCM");
//		int function=Integer.parseInt(buf.readLine());
//		System.out.println("please enter first number:");
//		int M=Integer.parseInt(buf.readLine());
//		System.out.println("please enter second number:");
//		int N=Integer.parseInt(buf.readLine());
//		if(function==1)
//			System.out.println(myGcd(M, N));
//		else {
//			System.out.println(myLcm(M, N));
//		}
//		
//	}
	
}
