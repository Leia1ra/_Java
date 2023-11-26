package KDT.Alorithm.Structure;

import java.util.Scanner;

public class IntStackTest{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Stack s = new IntStack();
        // Stack s2 = new IntStack(10);

        while(true){
            System.out.println("데이터의 수 : " + ((IntStack) s).size() + ", 스택의 크기 : " + ((IntStack)s).capacity() + " ==============================================");
            System.out.print("(1)PUSH (2)POP (3)PEEK (4)DUMP (5)SEARCH (6)CLEAR (7)INFO (8)REMOVE (0)EXIT \n -> ");
            byte menu = scan.nextByte();

            switch (menu){
                case 0: System.exit(0);
                    break;
                case 1: // Push
                    System.out.print("[PUSH]데이터 값 -> ");
                    int data = scan.nextInt();
                    try{
                        s.push(data);
                    }catch (Stack.OverflowStackException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2: // Pop
                    try{
                        int popData = s.pop();
                        System.out.println("[POP]스택의 최 상단 값  -> " + popData);
                    }catch (Stack.EmptyIntStackException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3: // Peek
                    try{
                        int topData = s.peek();
                        System.out.println("[PEEK]스택의 최 상단 값 -> " + topData);
                    } catch (Stack.EmptyIntStackException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4: // Dump
                    String dumpData = s.dumb();
                    System.out.println("[DUMP] -> " + dumpData);
                    break;
                case 5: // Search
                    System.out.print("[SEARCH]데이터 값 -> ");
                    int searchData = scan.nextInt();
                    int idx = s.search(searchData);
                    if(idx == -1){
                        System.out.println("없는 데이터 입니다.");
                    }else {
                        System.out.println(searchData + "는 [index :" + idx + "]번에 있습니다");
                    }
                    break;
                case 6: // CLEAR
                    s.clear();
                    System.out.println("[CLEAR]데이터의 수 : " + ((IntStack) s).size() + ", 스택의 크기 : " + ((IntStack)s).capacity());
                    break;
                case 7: // INFO
                    s.stackInformation();
                    break;
                case 8: // REMOVE
                    System.out.print("[REMOVE]데이터 값 -> ");
                    int delData = scan.nextInt();
                    boolean result = s.remove(delData);
                    System.out.println(delData + "는 삭제 " + ((result)?"되었습니다.":"되지 않았습니다."));
                    break;
                default:
                    System.out.println("메뉴를 잘못 선택하셨습니다.");

            }
            System.out.println();
        }
    }
}

class IntStack implements Stack{
    static int[] stack;
    int max;     // 스택의 크기
    int pointer; // 스택의 포인터

    public IntStack(){
        this(NON_OPTION);
    }
    public IntStack(int capacity) {
        try{
            stack = new int[capacity];
            this.max = capacity;
            pointer = 0;
        }catch (OutOfMemoryError e){
            max = 0;
        }
    }

    //데이터의 수
    public int size() {
        return pointer;
    }
    public int capacity(){
        return max;
    }

    @Override
    public int push(int data) {
        if(pointer == max){ // 이미 스택이 가득 찼는지 확인 후 예외를 발생시킴
            throw new OverflowStackException(); // 사용자 정의 예외
        }else {
            return stack[pointer++] = data;
        }
    }
    @Override
    public int pop() {
        if(pointer == 0){
            throw new EmptyIntStackException();
        }else{
            return stack[--pointer];
        }
    }
    @Override
    public int peek() {
        if(pointer == 0){
            throw new EmptyIntStackException();
        } else{
            return stack[pointer - 1];
        }
    }
    @Override
    public String dumb() {
        String stackData = "[";
        for(int i = pointer-1; i>=0; --i){
            stackData += stack[i];
            if(i > 0)
                stackData += ", ";
        }
        return stackData + "]";
    }
    @Override
    public int search(int data) {
        for(int i = pointer-1; i>=0; --i){
            if(stack[i] == data) return i;
        }
        return -1;
    }
    @Override
    public void clear() {
        pointer = 0;
    }

    @Override
    public void stackInformation() {
        int size = capacity();
        int dataCnt = size();
        boolean empty = isEmpty();
        boolean full = isFull();

        System.out.println("데이터의 수 : " + dataCnt + ", 스택의 크기 : " + size);
        System.out.println("비어" + ((empty)?"있습니다":"있지않습니다"));
        System.out.println("가득차" + ((full)?"있습니다":"있지않습니다"));
    }
    private boolean isEmpty(){
        if(pointer == 0) return true;
        else return false;
    }
    private boolean isFull(){
        if(pointer == max) return true;
        else return false;
    }

    @Override
    public boolean remove(int delData) {
        if(isEmpty()){
            System.out.println("스택이 비어있습니다.");
            return false;
        } else {
            int idx = search(delData);
            if(idx == -1) return false;
            else {
                pointer--;
                for(int i = idx; i<pointer; i++){
                    // if(i == max){
                    //     stack[i] = 0;
                    // }
                    stack[i] = stack[i+1];
                }
                return true;
            }
        }
    }
}
interface Stack{
    public static final int NON_OPTION = 5;

    public abstract int push(int data) throws OverflowStackException;
    public abstract int pop() throws EmptyIntStackException;

    public abstract int peek() throws EmptyIntStackException;
    public abstract String dumb();
    public abstract int search(int data);
    public abstract void clear();
    public abstract void stackInformation();
    public abstract boolean remove(int delData);

    // 넘칠때
    public class OverflowStackException extends RuntimeException{
        public OverflowStackException() {
            super("!!!Stack Overflow!!!");
        }
    }
    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException(){
            super("!!!Stack Empty!!!");
        }
    }

}