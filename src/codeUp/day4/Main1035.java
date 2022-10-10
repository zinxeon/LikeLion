package codeUp.day4;

import java.util.Scanner;

public class Main1035 {
    public static void main(String[] args) {
        // 16진수로 입력된 정수 1개를 8진수로 바꾸어 출력해보자.
        Scanner s = new Scanner(System.in);
        String num = s.next();
        int hex = Integer.parseInt(num, 16);

        String oct = Integer.toOctalString(hex);

        System.out.println(oct);
    }
}
