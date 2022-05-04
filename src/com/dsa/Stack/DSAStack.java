package com.dsa.Stack;

public class DSAStack {
     public Node top;

     public boolean isEmpty(){
         return top == null;
     }

     public void peek(){
         System.out.println(top.data);
     }

     public void push(int val){
         Node node = new Node(val);
         node.next = top;
         top = node;
     }

     public int pop(){
         int val = top.data;
         if (top == null){
             System.out.println("Stack is empty!");
         }else {
             top = top.next;
         }
         return val;
     }
}
