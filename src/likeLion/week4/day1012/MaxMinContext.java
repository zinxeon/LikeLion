package likeLion.week4.day1012;

interface IsCompare {
    boolean isCompare(int a, int b);
}

public class MaxMinContext {

    boolean isBigger(int a, int b) {
        return a > b;
    }
    boolean isShorter(int a, int b) {
        return a < b;
    }

    public int[] getNum(int[] arr, IsCompare isCompare) {
        //loop 구성
        int maxIdx = 0;
        int maxValue = arr[0]; // arr이 모두 음수인 경우 0으로 하면 0이 max
        for (int i = 1; i < arr.length; i++) {
            if (isCompare.isCompare(arr[i], maxValue)) {
                maxValue = arr[i];
                maxIdx = i;
            }
        }
        return new int[]{maxValue, maxIdx};
    }

    public int[] max(int[] arr) {
        return getNum(arr, new IsCompare() {
            @Override
            public boolean isCompare(int a, int b) {
                return a > b;
            }
        });

    }
}
