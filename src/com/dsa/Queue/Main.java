package com.dsa.Queue;
//FIFO
public class Main {
    public static void main(String[] args) {
        DSAQueue q = new DSAQueue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.remove();
        q.peek();
    }
}
