package com.vinay.linkedlist;

public class LinkedListNode 
{
	private LinkedListNode next;
    private String data;

    public LinkedListNode(String data){
        this.data = data;
    }
    
    public LinkedListNode(String data, LinkedListNode next){
        this.data = data;
        this.next = next;
    }
  
    public String data() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public LinkedListNode next() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
  
    public String toString(){
        return this.data;
    }
}
