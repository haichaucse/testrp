package just;

import java.util.Scanner;

public class Test {

	private static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String s3 = s1 + s1;
       return s3.contains(s2);
	}

    public static void main(String[] args) {
    	String s1 = "apple", s2 = "lpeap";
    	boolean res = isRotation(s1, s2);
    	System.out.println(res);
    }
}

