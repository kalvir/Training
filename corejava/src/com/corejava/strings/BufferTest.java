package com.corejava.strings;

public class BufferTest{  
    public static void main(String[] args){  
        StringBuffer buffer=new StringBuffer("hello");  
        buffer.append("java");  
        System.out.println(buffer); 
        buffer.equals("java");
    }  
}  