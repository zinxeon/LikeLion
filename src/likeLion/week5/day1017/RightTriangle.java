package likeLion.week5.day1017;

public class RightTriangle {
    public static void main(String[] args) {
        // 별 찍기 (직각 삼각형)
        /*
        *           1 = 0 별이 1개
        * *         1 = 0 별이 2개
        * * *       1 = 0 별이 3개
        * * * *     1 = 0 별이 4개
         */

        // for문을 통해 5보다 작을 때 까지 반복
        for (int i = 0; i < 5; i++) {
            // j는 i보다 작을 때까지 반복
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
