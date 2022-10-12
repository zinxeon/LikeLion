package study.day1012;

public class Ch6_5 {
    public static void main(String args[]) {
        Student1 s = new Student1("홍길동",1,1,100,60,76);
        System.out.println(s.info());
    }
}

class Student1 {

    // 답
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student1(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor+eng+math;
    }

    float getAverage() {
        float avg = getTotal()/(float)3;

        return Math.round(avg*10)/(float)10;
    }

    String info() {
        String info = "";
        info = name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + getTotal() + ", " + getAverage();
        return info;
    }

}

