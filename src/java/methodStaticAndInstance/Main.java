package java.methodStaticAndInstance;

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
