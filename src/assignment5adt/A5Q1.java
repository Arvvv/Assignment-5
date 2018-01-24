/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5adt;

/**
 *
 * @author Owner
 */
public class A5Q1 {
    
    private int numItems;
    private IntNode head;

    /**
     * @param args the command line arguments
     */
    public A5Q1(){
        numItems = 0;
        head = null;
        
    }

    
    public void add(int number){
        // setting counter
        int counter = 0;
        // start 
        IntNode node = head;
        // creating node

        // if there is not anything 
        if(node == null){
            // adding to the end once its larger 
            IntNode temp = new IntNode(number);
            head = temp;
        }
        else if(number > get(numItems - 1)){
            while(node.getNext() != null){
                node = node.getNext();
            }
         // creating another node    
        IntNode temp = new IntNode(number);
        // implementing node
        node.setNext(temp);
        }
        
        else if (number < node.getNum()){
            // new node created 
            IntNode temp = new IntNode(number);
            temp.setNext(head);
            head = temp;
        }
        
        else{
            // this will locate the number 
            while(number >= node.getNext().getNum()){
                // finding the latger number 
                node = node.getNext();
                
            }
            
            // locating within the node 
            for(int i = 0; i < counter - 1; i++){
                node = node.getNext();
            }
        }
        
        
        
    }
    // list size 
    public int size(){
        // returning the list size 
        return numItems;
        
    }
    
    public boolean isEmpty(){
        // return the list 
        return numItems == 0;
        
    }
    // number is returned to position 
    public int get(int position){
        IntNode node = head;
        // move the same amount of times
        for(int i = 0; i < position; i++){
        node = node.getNext();
    }
        return node.getNum();
        
    }
    public void remove(int number){
        if(numItems == 0){
            // linking node and head 
            IntNode node = head;
            
            if(numItems == node.getNum()){
                head = head.getNext();
            }
            // locating number 
            while(number == node.getNext().getNum()){
                // locating number 
                node = node.getNext();
            }
            // removed number
            IntNode remove = node.getNext();
            // next node
            node.setNext(node.getNext().getNext());
            //
            remove.setNext(node);
            // going down within the array
            numItems--;
            
        }
        
    }
    
    public static void main(String[] args){
        //A5Q1
        A5Q1 list = new A5Q1();
        list.add(-3);
        list.add(8);
        list.add(-7);
        list.add(4);
        list.add(9);
        list.add(1);
        
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        
        
    }
    
}
