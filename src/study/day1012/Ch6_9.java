package study.day1012;

public class Ch6_9 {
    // 질문
    // 이 클래스의 멤버중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
    // 단, 모든 병사의 공격력과 방어력은 같아야 한다.

    int x=0, y=0; // Marine (x,y) 의 위치좌표
    int hp = 60; // 현재 체력
    int weapon = 6; // 공격력
    int armor = 0; // 방어력
    void weaponUp() {
        weapon++;
    }
    void armorUp() {
        armor++;
    }
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 답
    // static 붙여야하는것 : weapon(공격력), armor(방어력)
    // 모든 인스턴스가 동일한 값을 가져야하기 때문에

}
