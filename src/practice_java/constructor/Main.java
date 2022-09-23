package practice_java.constructor;

 public class Main {
    //public static final int a;  다른곳에서 값을 변경할 수 없음
    public static int a;
    static{
        a=1;
    }
    public static void main(String[] args) {

       new Card("asd",1);
        System.out.println(a);
       new Card();
       new Card(5);
        System.out.println(a);
    }
}
