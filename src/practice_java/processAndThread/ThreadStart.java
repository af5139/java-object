package practice_java.processAndThread;

public class ThreadStart {

}
//두가지 방법으로 실행 가능 상속은 한번만 가능하기에 인터페이스로 사용하는것을 권장
class Thread1 extends Thread{

    public void run(){
        for(int i=0; i < 50001; i++){
            System.out.println(getName());
        }
    }
}

class Thread2 implements Runnable{

    @Override
    public void run() {
        for(int i=0; i < 50001; i++){
            //Thread.currentThread() = 현재 실행준인 Thread를 반환
            System.out.println(Thread.currentThread().getName());
        }
    }
}
