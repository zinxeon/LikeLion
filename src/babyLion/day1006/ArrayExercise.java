package babyLion.day1006;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayExercise {
    public static void main(String[] args) {
        // 1.번
        // 배열의 랜덤한 값 7개 채우기
        // 배열, 랜덤, 루프를 알아야 작성 가능

        int arr[] = new int[7]; // 길이 7의 배열 생성
        // 반복문 통해 배열에 숫자 하나씩 넣어주기
        for(int i = 0; i <arr.length; i++) {
            // 랜덤 함수 사용해 value에 값 넣어주기
            int value = (int)(Math.random() * 6);
            // i에 값 넣어주기
            arr[i] = value;
        }
        // Arrays 클래스 사용하여 배열 출력하기
        System.out.println(Arrays.toString(arr));

//        ----------------------------------------------------

        // 2번.
        // 배열의 동일하지 않는 랜덤한 값 7개 채우기
        int arr2[] = new int[7]; // 길이 7의 배열 생성
        // 반복문 통해 배열의 index에 값 넣어주기
        for(int i = 0; i < arr2.length; i++) {
            // 랜덤 함수 사용해 value에 값 넣어주기
            int value = (int)(Math.random() * 6);
            // 이중 for문 사용
            // 다음 j인덱스의 번호가 i인덱스 번호보다 작을 때 반복
            for(int j = 0; j < i; j++) {
                // j의 값과 value의 값 일치 비교
                if(arr2[j] == value) {
                    // 일치 할 경우 다시 for문 반복
                }
            }
            // i에 값 넣어주기
            arr2[i] = value;
        }
        // Arrays 클래스 사용하여 배열 출력하기
        System.out.println(Arrays.toString(arr2));

//        ----------------------------------------------------

        // 3.번
        // set<String> 사용 해보기
        // 2번 중복제거 문제 set사용해보기
        HashSet<Integer> set1 = new HashSet<>();
        // set1의 길이 7으로 제한
        while (set1.size() < 7) {
            set1.add((int)(Math.random() * 10));
        }
        System.out.println(set1);
        Integer[] arr3 = set1.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr3));

    }
}
