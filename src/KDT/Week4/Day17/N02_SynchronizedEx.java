package KDT.Week4.Day17;

public class N02_SynchronizedEx implements Runnable{
    private int depositeMoney = 10000;
    public N02_SynchronizedEx() {
    }
    @Override //메소드에 동기화
    public synchronized void run(){
        // Thread Synchronized : 스레드를 사용중일 때 따른 스레드 대기를 하고 현재 스레드 실행이 끝나면 다음스레드를 구현된다.
        // synchronized (this){
            // 1 : 1000원씩 7번 인출
            for(int i = 1; i <= 7; ++i){
                try{ // 스레드 지연 시키기
                    Thread.sleep(1000);
                }catch (Exception e){

                }
                withDraw(1000);
            }
        // }
    }
    private void withDraw(int howMuch){// 인출하는 메소드
        if(depositeMoney >= howMuch){ // 잔익이 있을때
            depositeMoney -= howMuch;
            System.out.printf("출금액 : %d -> 잔액 : %d, 인출인 : %s\n", howMuch, depositeMoney, Thread.currentThread().getName());
        }else { // 찬액이 없을때
            System.out.println("출금인" + Thread.currentThread().getName());
            System.out.println("잔액이 부족합니다.");
            try{ // 스레드 종료
                this.wait();
            }catch (Exception e){

            }
        }

    }
    public static void main(String[] args){
        N02_SynchronizedEx ATM = new N02_SynchronizedEx();

        Thread mother = new Thread(ATM, "mother");
        Thread son = new Thread(ATM, "son");

        mother.start();
        son.start();
    }
}
