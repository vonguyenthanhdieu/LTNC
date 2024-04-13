package Cau1;

public class Cau1 {
	private static int count(int x, int[] a) {
		int result = 0;
		for (int i = 0; i< a.length; i++) {
			if (a[i] == x) result ++;
		}
		return result;
	}
	public static void main(String[] args) {
		int[] a = {7, 7, 5, 12, 5, 12, 7, 3, 5, 7};
		int x = 7;
		int k = 7;
		System.out.println("số lần xuất hiện của " + x + " là : " + count(x, a));
	}
}
