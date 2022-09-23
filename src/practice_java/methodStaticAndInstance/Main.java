package practice_java.methodStaticAndInstance;

public class Main {
    public static void main(String[] args) {
        //객체 생성
        Ex ex = new Ex();
        ex.i=3;
        ex.j=5;

        System.out.println(ex.add());

        System.out.println(Ex.add(3,5));
    }
}
/*
static 메서드는 static 메서드 호출가능
static 메서드는 인스턴스 변수 사용 불가(객체 생성하여 사용가능)
static 메서드는 인스턴스 메서드 호출 불가 (instance value 를 필요로하기때문)
static 메서드는 호출시 객체가 없을 수도 있어서 인스턴스 멤버 사용 불가
*/