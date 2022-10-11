package codeUp.day5;

import java.util.Scanner;

public class Main1047 {
    public static void main(String[] args) {
        //정수 1개를 입력받아 2배 곱해 출력해보자.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        // a<<1 2배, a>>1 반으로 나눔, a<<2 4배, a>>2 반 나누고 다시 반 나눔
        System.out.printf("%d", a << 1);
    }
}
