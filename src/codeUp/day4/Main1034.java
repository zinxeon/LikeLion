package codeUp.day4;

import java.util.Scanner;

public class Main1034 {
    public static void main(String[] args) {
        // 8진수로 입력된 정수 1개를 10진수로 바꾸어 출력해보자.
        Scanner s = new Scanner(System.in);
        String oct = s.next();

        int dec = Integer.parseInt(oct,8);

        System.out.println(dec);
    }
}
