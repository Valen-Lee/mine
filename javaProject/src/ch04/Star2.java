package ch04;

public class Star2 {
	public static void main(String[] args) {
		for (int i=1; i<5; i++) {
			for(int j=4; j>0; j--) {
				if(i<j) {
					System.out.print(" ");
				}else {
					System.out.println("*");
				}//if - else
			}//inner for
			System.out.println("");
		}//outer for
	}
}
