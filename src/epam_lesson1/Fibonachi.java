package epam_lesson1;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonachi {
	private  static int size ;
	private  static int number;
	private static int countEvenNumber;
	private static BigInteger someNumber;

	public static BigInteger recursion(int n){
		if (n==0 || n==1){
			return BigInteger.ONE;
		}
		return recursion(n-1).add(recursion(n-2));		
	}
	
	
	public static void  fibonachi(int iter, BigInteger fnPrevious, BigInteger fnBeforePrevious){
		
		BigInteger fn = fnPrevious.add(fnBeforePrevious); ;
		if (iter==1){
			 fn = BigInteger.ONE;
		 }
		if (iter==number){
			 someNumber = fn;
		 }
		fnBeforePrevious = fnPrevious; 
		fnPrevious= fn;
		
		if (fn.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)){
			countEvenNumber++;
		}
		System.out.println(iter+"    "+   fn);
		iter++;
		 if(iter<size){
			 fibonachi(iter,fnPrevious,fnBeforePrevious); 
		 } 
	
	}
	

	

	public static void main(String[] args) {
		System.out.println("Enter the number of Fibonacci numbers:");
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		size= s;
		System.out.println("Enter the selected number ");
		s = scan.nextInt();
		number = s;
		
		BigInteger zero = BigInteger.ZERO; 
		fibonachi(0,zero,zero);
		int pro = (int) (countEvenNumber*100/size);
		System.out.println("Even Numbers -  " + pro+"%");
		System.out.println("Odd Numbers -  " + (100-pro)+"%");
		System.out.println(number + " is "+ someNumber);
		

//		BigInteger fib[] = new BigInteger[1100];
//		fib[0]=BigInteger.valueOf(0) ;
//		fib[1]=BigInteger.valueOf(1);
//		int count_parni = 0;
//		int count_neparni = 1;
//		for(int i = 2;i<fib.length;i++){
//			fib[i]=fib[i-1].add(fib[i-2]);
//			BigInteger two = BigInteger.valueOf(2);
//			fib[i].mod(two).equals(BigInteger.ZERO);
//			if (fib[i].mod(two).equals(BigInteger.ZERO)){
//				count_parni++;
//			}else{count_neparni++;}
//		}
//		double parni = count_parni*100 /fib.length;
//		double neparni = count_neparni*100 /fib.length;
//		for (int i = 0;i<fib.length; i++){
//			System.out.println(i+"   "+fib[i]);
//		}
//		System.out.println(parni +"%");
//		System.out.println(neparni +"%");
//		System.out.println(580+"   "+fib[580]);

	}
}




