package codeUp.day4;

import java.util.Scanner;

public class Main1037 {
    public static void main(String[] args) {
        // 10진 정수 1개를 입력받아 아스키 문자로 출력해보자.
        // 단, 0 ~ 255 범위의 정수만 입력된다.
        Scanner s = new Scanner(System.in);
        int oct = s.nextInt();

        System.out.printf("%c", (char)oct);
    }
}
