package codeUp;

import java.util.Scanner;

public class Main1014 {
    public static void main(String[] args) {
//        2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.
        Scanner s = new Scanner(System.in);

        char a = s.next().charAt(0);
        char b = s.next().charAt(0);
        System.out.printf("%c %c", b, a);
    }
}
