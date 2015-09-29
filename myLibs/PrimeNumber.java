package myLibs;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {



	public static List<Integer> chkPrime(int from, int to) {
		List<Integer> list=new ArrayList<>();
		for (int i = from + 1; i < to; i++) {
			for (int j = 2; j <= i; j++) {
				if  (j == i){
					list.add(i);
				} else if ((i%j) == 0) {
					break;
				}
			}
		}
		return list;
	}
	public static List<Integer> chkPrime(int chkBe4This) {
		List<Integer> list=new ArrayList<>();
		for (int i = 2; i < chkBe4This; i++) {
			for (int j = 2; j <= i; j++) {
				if  (j == i){
					list.add(i);
				} else if ((i%j) == 0) {
					break;
				}
			}
		}
		return list;
	}
//	// for try run:
//	public static void main(String[] args) {
//
//		int a, b;
//		a = 10;
//		b = 99;
//		List<Integer> result=chkPrime(a, b);
//		if(result.equals("")){
//			System.out.println("沒有數符合");
//		}else
//		System.out.println(chkPrime(a, b) + "");
//	}
//	
//	
}
