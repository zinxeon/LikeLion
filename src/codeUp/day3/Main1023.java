package codeUp.day3;

import java.util.Scanner;

public class Main1023 {
    public static void main(String[] args) {
        // 실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.
        Scanner s = new Scanner(System.in);
        String[] num = s.next().split("[.]");

        System.out.println(num[0]);
        System.out.println(num[1]);
    }
}
