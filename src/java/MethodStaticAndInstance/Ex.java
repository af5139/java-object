package java.MethodStaticAndInstance;

public class Ex {
    int i;
    int j;
    int k=5;
    static int si;
    public int add(){
        si=3;
        System.out.println(si);//클래스 변수 사용할 수 있음
        System.out.println(k);//인스턴스 변수 사용할 수 있음
        return i+j;
    }

    public static int add(int i,int j){//static 에서는 static만 사용 가능
    //    System.out.println(k); 인스턴스 변수를 사용할 수 없음
        si=5;
        System.out.println(si);
        return i+j;
    }
}
