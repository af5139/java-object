package practice_java.encapsulation;

public class Main {
    public static void main(String[] args) {
        Time time = new Time();
       // time.hour=1; private 접근불가
        time.setHour(10); //getter setter 메서드를 통해서만 접근 가능 : 은닉화
        System.out.println(time.getHour());
    }
}
