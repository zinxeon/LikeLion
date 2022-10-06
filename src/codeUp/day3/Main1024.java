package codeUp.day3;

import java.util.Scanner;

public class Main1024 {
    public static void main(String[] args) {
        // 단어를 1개 입력받는다.
        // 입력받은 단어(영어)의 각 문자를
        // 한줄에 한 문자씩 분리해 출력한다.
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        for(int i = 0; i <str.length(); i++) {
            System.out.println("'" + str.charAt(i) + "'");
        }
    }
}
