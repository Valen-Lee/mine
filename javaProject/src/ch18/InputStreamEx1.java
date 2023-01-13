package ch18;

import java.io.InputStream;

//stream객체들은 1byte단위로 스트림 처리하며, 영문 대소문자, 숫자, 특수문자만 처리할 수 있다(한글처리불가)
//inputstream,outputstream

public class InputStreamEx1 {
	public static void main(String[] args) {
		InputStream is = System.in;//대표적으로 system.in > inputstream
		System.out.println("문자를 입력하세요 : ");
		try {//입출력, 네트워크, DB 예외처리
			int code = is.read();
			//키보드로부터 1byte로 읽음, 따라서 한글(2byte)처리가 안됨
			//inputstreamreader 써야함
			System.out.println(code);
			char ch = (char) code;//모든 문자에는 고유한 숫자코드가 있다 따라서 int형 code
			System.out.println("char : "+ch);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
