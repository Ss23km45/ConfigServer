package com.codingninja.practise.leetcode.solutions.stackqueue;

import java.util.Stack;

class MyQueue {

    private Stack<Integer> firstStack;
    private Stack<Integer> secondStack;

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(22);
        queue.push(34);
        queue.push(45);
        queue.push(23);
        queue.push(33);
        queue.push(55);
        queue.push(64);
        queue.push(86);
        queue.push(65);
        System.out.println("Peek element " + queue.peek());

        System.out.println(queue.pop());


        System.out.println("Peek element " + queue.peek());

    }

    private int peekElement,count = 0;

    public MyQueue() {
        firstStack = new Stack<>();
        secondStack = new Stack<>();
    }
    
    public void push(int x) {
        if(count == 0){
            peekElement = x;
        }
        firstStack.push(x);
        count++;
    }
    
    public int pop() {
        while(!firstStack.isEmpty()){
            secondStack.push(firstStack.pop());
        }

        int itemRemoved = secondStack.pop();
        peekElement = secondStack.peek();
        count--;

        while(!secondStack.isEmpty()){
            firstStack.push(secondStack.pop());
        }

        return itemRemoved;
    }
    
    public int peek() {
        return peekElement;
    }
    
    public boolean empty() {
        return firstStack.isEmpty();
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "firstStack=" + firstStack +
                '}';
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */