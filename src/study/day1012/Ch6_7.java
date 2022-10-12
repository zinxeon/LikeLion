package study.day1012;

class MyPoint {
    int x;
    int y;
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 답
    double getDistance(int x, int y) {
        int width = this.x-x;
        int height = this.y-y;
        return Math.sqrt(width*width + height*height);
    }

}

public class Ch6_7 {
    public static void main(String args[]) {
        MyPoint p = new MyPoint(1,1);
        // p (2,2) . 와 의 거리를 구한다
        System.out.println(p.getDistance(2,2));
    }

}
