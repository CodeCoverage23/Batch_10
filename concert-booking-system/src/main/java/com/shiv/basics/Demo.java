package com.shiv.basics;

import java.util.*;
public class Demo {
    static Node head;
    
    static class Node{
        int data;
        Node next;
        Node prev;
    };
    
    static void addNode(int value) {
        
        if (head == null) {
            Node new_node = new Node();
            new_node.data = value;
            new_node.next = new_node.prev = new_node;
            head = new_node;
            return;
        }

       
        Node last = (head).prev;    

        
        Node new_node = new Node();
        new_node.data = value;

  
        new_node.next = head;

       
        (head).prev = new_node;

        
        new_node.prev = last;

        
        last.next = new_node;
    }

    static Node deleteNode(Node start)
    {
      start.prev.next=start.next;
      start.next.prev=start.prev;
        return start.next;
    }

    static void printNodes()   {
        Node temp = head;
        
        while (temp.next != head)
        {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("%d ", temp.data);



    }

    public static void main(String[] args)
    {

        Node l_list = null;

        
        System.out.println("Enter Servents:");
        Scanner sc= new Scanner(System.in);
    
        int totalServents=sc.nextInt();

        
        for(int i=1;i<=totalServents;i++){
         addNode(i);
        }
        System.out.println("Enter total number of rhyme words :");
        
     /* String word;
      word=sc.nextLine();
      String [] word2=word.trim().split("\\s+");
      
      int rymWordsCount = word2.length;*/

      int rymWordsCount = sc.nextInt();
     // System.out.println("total words:in ryme is "+rymWordsCount);
        while(totalServents!=1){
            for(int j=1;j<rymWordsCount;j++){
                head=head.next;
            }
           head= deleteNode(head);
            totalServents--;

        }

        System.out.println("The Winner is : ");
        printNodes();
    }
}
