package likeLion.week3.day1007;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    // constructor 추가 fromSido, toSido 받아서 멤버변수에 넣는 기능
    // alt + insert 에서 construct 추가
    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }
    // getter 추가 (alt + insert)
    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }

    //Method 설계
    //Method 설계란?
    //void readByChar(String filename) -> 이렇게 적어보는 것.

    // populationStatistics의 한줄을 사용하여 만든다.
    public static void main(String[] args) {

    }

}
