package likeLion.week4.day1014;

import java.util.Arrays;

public class InsertionSort01 {
    // 메서드
    public int[] sort(int[] arr) { // 배열을 구분하다
        int i = 1;
        if(arr[i] < arr[i-1]) { // arr[1] vs arr[0]
            // indext의 값을 비교 후 자리를 바꾼다.
            // {8, 5, 6, 2, 4} -> {5, 8, 6, 2, 4}
            int temp = arr[i]; // int타입의 temp 변수 선언과 동시에 arr[i] 값 temp에 대입한다.
            arr[i] = arr[i-1]; // arr[i-1]의 값을 arr[i]에 대입한다.
            arr[i-1] = temp; // temp의 값을 arr[i-1]에 대입한다.

            System.out.println(Arrays.toString(arr));

        }

        return new int[]{};
    }
    public static void main(String[] args) {
        // 5에서 출발 합니다.
        int[] arr = {8, 5, 6, 2, 4}; // arr 배열 초기화

        int i = 1; // int i = 1 에서 출발

        InsertionSort01 is = new InsertionSort01();
        int[] result = is.sort(arr); // result에 sort 메서드 실행하여 return값 넣어줌

        System.out.println(Arrays.toString(result));

    }
}
