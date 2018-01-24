package assignment5adt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class A5Q2 {
    
    
    
    // creating an array 
    private int[]array; 
    // # of items
    private int numItems;
    
    public A5Q2(){
        // there are now 10 spaces with the array 
        array = new int[10];
        //sets # of items to 0 
        numItems = 0; 
    }
        public void add(int index, int num){
            // if the array has no more spaces
            if(numItems >= array.length){
             
            numItems++;
            // doubling the amount of spaces within the array 
            int arraySpaces = array.length * 2;
            
            int[] temp = new int[arraySpaces];
            // copyinng items before the actual index 
            for(int initial = 0; initial < index;initial++){
                temp[initial] = array[initial];
            }
            // including the number at its index
            temp[index] = num;
            // including the numbers to their index 
            for(int last = index + 1; last <= numItems - index + 2;last++){
                temp[last] = array[last - 1];
            }
            
            array = temp;
            
            }else{
                
                numItems++;
                
                int arraySpaces = array.length;
                
                int[]temp = new int[arraySpaces];
                // anything which is initially before the index is copied
                for(int initial = 0; initial < index;initial++){
                    temp[initial] = array[initial];
                }
                // numbers belong to their index
                temp[index] = num;
                // the remaining numbers appropriated to their index
                for(int last = index + 1; last <= numItems - index + 2; last++){
                    temp[last] = array[last - 1];
                }
                // the old array is now replaced from a copy of the new
                array = temp;
            }
        }       
                // returning the size
                public int size(){
                    return numItems;
                }
                // returning array
                public boolean isEmpty(){
                    return numItems == 0;
                }
                // returning number
                public int get(int index){
                    return this.array[index];
                }
                // removing the number
                public void remove(int index){
                    // array
                    int temp[] = new int [array.length];
                    // those that are initially beofre the index are removed
                    for(int initial = 0; initial < index;initial++){
                        temp[initial] = array[initial];
                    }
                    // everything which is lastly after the index is removed and copied
                    for(int last = index + 1;last < array.length - 1;last++){
                        temp[last - 1] = array[last];
                    }
                    // old array is replaced with new copy 
                    array = temp;
     
        }
                public static void main(String[]args){
                   // A5Q2
                    A5Q2 array = new A5Q2();
                    
                    array.add(2,3);
                    array.add(1,23);
                    array.add(7,19);
                    array.add(3,8);
                    array.add(6,4);
                    array.add(9,7);
                    array.add(4,10);
                    array.add(5,11);
                    array.add(8,15);

                    
                    
                    array.remove(3);
                    
                    for(int i = 0; i < array.size(); i++){
                        System.out.println("The number appropriated to index " + i + " is " + array.get(i));
                    }
                    
                    
                    
                    
                                            
                    
                }
        
    }
    
    
    

