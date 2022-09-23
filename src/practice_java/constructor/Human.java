package practice_java.constructor;

public class Human {
    String head;
    String leg;
    //매개변수가 있는 생성자 생성시 기본 생성자 없으면 컴파일에러
    Human(){
        System.out.println("생성자호출");
    }
    Human(String head,String leg){
        System.out.println(head+leg);

    }
}
