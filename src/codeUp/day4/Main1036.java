package codeUp.day4;

import java.util.Scanner;

public class Main1036 {
    public static void main(String[] args) {
        // 영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력해보자.
        Scanner s = new Scanner(System.in);
        String str = s.next();

        System.out.printf("%d", (int)str.charAt(0));
    }
}
