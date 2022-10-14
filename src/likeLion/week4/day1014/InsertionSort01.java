package likeLion.week4.day1014;

import java.util.Arrays;

public class InsertionSort01 {
    // 메서드
    public int[] sort(int[] arr) { // 배열을 구분하다
        int i = 1;

        return new int[]{};
    }
    public static void main(String[] args) {
        // 5에서 출발 합니다.
        int[] arr = {8, 5, 6, 2, 4};

        int i = 1; // int i = 1 에서 출발

        InsertionSort01 is = new InsertionSort01();
        int[] result = is.sort(arr);

        System.out.println(Arrays.toString(result));

    }
}
