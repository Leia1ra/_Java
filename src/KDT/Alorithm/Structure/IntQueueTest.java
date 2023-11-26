package KDT.Alorithm.Structure;

import java.util.Scanner;

public class IntQueueTest {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Queue q = new IntQueue();

        while(true){
            System.out.println("[데이터의 수 : " + ((IntQueue)q).count + " | 큐의 크기 : " + ((IntQueue)q).max + "] ===========================");
            System.out.print("(1)EnQueue (2)DeQueue (3)Peek (4)Dump (5)Datas (6)Search (7)Delete (0)EXIT \n -> ");
            byte menu = scan.nextByte();

            switch (menu){
                case 0:
                    System.out.println("프로그램이 종료되었습니다.");
                    System.exit(0);
                    break;
                case 1: // EnQueue
                    System.out.print("[EnQueue]데이터 값 -> ");
                    int data = scan.nextInt();
                    try{
                        q.enQueue(data);
                    }catch (Queue.QueueOverflowException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2: // DeQueue
                    try{
                        int queueData = q.deQueue();
                        System.out.println("[DeQueue] -> " + queueData);
                    } catch (Queue.QueueEmptyException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 3: // Peek
                    try{
                        int peekData = q.peek();
                        System.out.println("[Peek] -> " + peekData);
                    } catch (Queue.QueueEmptyException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4: // Dump
                    System.out.println("[Dump] ->");
                    q.dump();
                    break;
                case 5: // Datas
                    System.out.println("[Datas] -> " + q.datas());
                    break;
                case 6: // Search
                    System.out.print("[Search] -> ");
                    int result = q.search(scan.nextInt());
                    if(result == -1){
                        System.out.println("없는 데이터 입니다.");
                    }else {
                        System.out.println("[index :" + result + "]번에 있습니다");
                    }
                    break;
                case 7: // Delete
                    System.out.print("[Delete] -> ");
                    int delData = scan.nextInt();
                    int delresult = q.Delete(delData);
                    System.out.println(delData + "를 삭제" + ((delresult == -1)?"하지 못했습니다.":"하였습니다."));
                    System.out.println("[Datas] -> " + q.datas());
                    break;
                default:
                    System.out.println("메뉴를 잘못 선택하셨습니다.");

            }
            System.out.println();
        }
    }
}

class IntQueue implements Queue {
    static int[] queue;
    int max;
    int count;
    int front = 0;
    int rear = 0;

    public IntQueue() { this(NON_OPTION); }

    public IntQueue(int capacity) {
        try {
            queue = new int[capacity];
            max = capacity;
        } catch (OutOfMemoryError e) {
            System.out.println("메모리가 부족합니다");
        }
    }

    @Override
    public int enQueue(int data) {
        //Queue가 가득찼을때
        if(max == count) throw new QueueOverflowException();
        else { // Queue에 여유가 있을때
            // 현재 rear의 위치에 값을 추가하고 rear는 1 증가 시킴;
            queue[rear++] = data;
            // 데이터의 수 증가
            count++;

            // rear가 배열의 끝까지 이동했을때 0으로 index를 변경
            if(max == rear) rear = 0;
            return data;

        }
    }

    @Override
    public int deQueue() {
        //Queue가 비어있는지 확인
        if(count == 0) throw new QueueEmptyException();
        else{ // front위치의 값을 돌려주고, front는 1증가
            int frontData = queue[front++];
            count--; // 데이터수를 감소
            if(max == front){ // front와 최대용량과 같으면 처음 index로 변경
                front = 0;
            }
            return frontData;
        }
    }

    @Override
    public int peek() {
        //Queue가 비어있는지 확인
        if(count == 0) throw new QueueEmptyException();
        else{
            return queue[front];
        }
    }

    private int capacity(){
        return max;
    }
    private int size(){
        return count;
    }
    private boolean isEmpty(){
        if(count == 0) return true;
        else return false;
    }
    private boolean isFull(){
        if(count == max) return true;
        else return false;
    }
    private int peekLast(){
        int index = rear -1;
        if(isEmpty()) return -1;
        else if(index == -1) {
            index = max - 1;
            return queue[index];
        } else{
            return -1;
        }
    }
    @Override
    public void dump() {
        System.out.println("Capacity : " + capacity());
        System.out.println("Size     : " + size());
        System.out.println("Empty    : " + isEmpty());
        System.out.println("Full     : " + isFull());
        System.out.println("Front    : " + peek());
        System.out.println("Last     : " + peekLast());
    }

    @Override
    public String datas() {
        String str = "[";
        if(count > 0) {
            int temp;
            if(rear == 0) {
                temp = max -1;
            } else{
                temp = rear-1;
            }
            for(int i = front; ; i++){
                if(i == max) i = 0;
                str += queue[i];
                if(temp != i) str +=", ";
                if(temp == i) break;
            }
        }
        return str + "]";
    }

    @Override
    public int search(int data) {
        if(count > 0){
            int temp;
            if(rear == 0) {
                temp = max -1;
            } else{
                temp = rear-1;
            }
            for(int i = front; ; i++){
                if(i == max) i = 0;
                if(queue[i] == data) return i;
                if(temp == i) break;
            }
        }
        return -1;
    }

    @Override
    public int Delete(int data) {
        if(!isEmpty()){
            int idx = search(data);
            if(idx >= 0){ // 데이터가 있을때
                // 총 데이터수 - (값이 있는 index - front)
                // int cycle = size() - Math.abs(idx - front);
                for(int i = idx; i<(size() - Math.abs(idx - front)); ++i){
                    queue[(i+max)%max] = queue[(i+max+1)%max];
                }
            }
            if(rear == 0) rear = max-1;
            else rear--;
            count--;
            return data;
        }
        return -1;
    }
}


interface Queue{
    public static final int NON_OPTION = 5;

    public abstract int enQueue(int data);
    public abstract int deQueue();
    public abstract int peek();
    public abstract void dump();
    public abstract String datas();
    public abstract int search(int data);
    public abstract int Delete(int data);
    // 넘칠때
    class QueueOverflowException extends RuntimeException{
        public QueueOverflowException() {
            super("!!!Overflow!!!");
        }
    }
    class QueueEmptyException extends RuntimeException{
        public QueueEmptyException(){
            super("!!!Queue Empty!!!");
        }
    }

}