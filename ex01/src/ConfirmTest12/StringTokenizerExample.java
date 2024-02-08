package ConfirmTest12;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String q = "아이디,이름,패스워드";
		
		StringTokenizer t = new StringTokenizer(q, ",");
		
		while(t.hasMoreTokens()) {
			String token = t.nextToken();
			System.out.println(token);
		}

	}

}
