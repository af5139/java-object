package practice_java.constructor;

public class Card {
    String str;
    int value;
    //생성자 오버로딩

    Card(){//기본생성자
        new Human(){
        };
        new Human("머리","다리"){
        };
    }

    Card(String kind, int number){
        this.str=kind;
        this.value=number;
        System.out.println(kind+number);
    }

    Card(int a){
        Main.a=a;
        //System.out.println(a);
    }
}
