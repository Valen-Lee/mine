package ch03;

public class AssignEx {
	public static void main(String[] args) {
		int a=3, b=5, c=7;
		String s1="Hello", s2="World";
		
		a += 3; // a=a+3 오른항 왼쪽으로 이항
		System.out.println(a);
		
		s1 += s2; //s1=s1+s2
		System.out.println(s1);//연결 연산자 
		//중요** 문자열도 누적시킬 수 있음!
		
		b/= 5; // b=b/5
		System.out.println(b);
		
		c %=2; //c=c%2
		System.out.println(c);
	}
}
