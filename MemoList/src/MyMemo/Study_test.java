package MyMemo;

import java.io.*;
import java.util.*;

public class Study_test {

    public static void main(String[] args) throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int a= br.read(); //Integer.parseInt();
    	System.out.println(a);
    	br.close();
    	String b="ABCD";
    	System.out.println(String.valueOf(b)+a);
    	//String.valueOf() -> 문자열로 수정
    	//toString -> Object의 메소드 이다.
    	
    	
    }
}
