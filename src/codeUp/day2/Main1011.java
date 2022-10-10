package codeUp.day2;

import java.util.Scanner;

public class Main1011 {
    public static void main(String[] args) {
//        문자형(char)으로 변수를 하나 선언하고, 변수에 문자를 저장한 후
//        변수에 저장되어 있는 문자를 그대로 출력해보자.
        Scanner s = new Scanner(System.in);

        char a = s.next().charAt(0);
        System.out.printf("%c", a);

    }
}
