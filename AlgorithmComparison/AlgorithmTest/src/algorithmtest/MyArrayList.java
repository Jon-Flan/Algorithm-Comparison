
package algorithmtest;

/*@author Jonathan Flanagan (x18143890)*/
import java.util.*;

public class MyArrayList<ElemType> extends ArrayList<ElemType> {
    
    //Bublblesort Sorting Algortithim implemntation
    public void Bubblesort() {
        //declare vairables for loops and counting comparisons/swaps
        int i,j,comparisons,swaps;
        
        //initialise comparisons and swaps to zero.
        comparisons = 0; 
        swaps = 0; 
        
        //using comparible to compare the objects in the arraylist returning 1,0 or -1
        //These will be element J (elemJ) and the next element in the  list element J plus (elemJ_Plus)
        Comparable  elemJ,elemJ_Plus;
        
            //outer for loop to transverse the array list
            for( i = 0; i < size(); i++ ){
                
               //inner for loop to iterate through the elements in the list
               for( j=0; j < size()-1 -i; j++ ){
                   
                   //get the element at position j
                   elemJ = (Comparable)get(j);
                   //get the element at position j +1
                   elemJ_Plus = (Comparable)get(j+1);
                   
                   //incriment the counter for comparisions by 1
                   comparisons ++;
                   
                        //if statement to check if the objects need to be swapped
                        if(elemJ.compareTo(elemJ_Plus) < 0){
                            //if the comparison returns greater than 0, swap
                            swap( j, j+1);
                            //increment swaps by 1;
                            swaps ++;
                        }
               }
            }
            //Print the number of swaps and comparisons
            System.out.println("\nThe Bubble Sort is complete,\nThere where "+ size() + " elements, with: " + comparisons + " comparisons");
            System.out.println("For " + comparisons + " comparisons, there where " + swaps + " swaps completed");
    }
    
    //swap method to swap the items for the BubbleSort passing in the index value of the items
    public void swap(int item1, int item2)
    {
        //get the  objects that need to be swapped by declaring  an object to store each of them
        ElemType obj1 = get(item1);
        ElemType obj2  = get(item2);
        
        //remove element from item1
        remove(item1);
        //insert element from obj2 into item1
        add(item1,obj2);
        //remove element from item2
        remove(item2);
        //insert the element from obj1 into item 2
        add(item2,obj1);
    }
    
     //InsertionSort Sorting Algortithim implemntation
     public void InsertionSort()
     {
       //Declare variables to count comparison and swaps
       int comparisons = 0;
       int shifts = 0;
       int swaps = 0;
       int i;
       
         //for loop to transverse the array
         for(i = 1; i<size(); i++)
         {
                //get the element at the key position, this is stored if needed to be moved along the array
                ElemType keyElement = get(i);
                //get the index position of the key element
                int pos = i;  
                //increase comparisons
                comparisons++;  
                        
                        //if this statement evaluates to true then there is guaranteed to be a swap so we count it
                        if(((Comparable)get(pos-1)).compareTo((Comparable)keyElement ) < 0){
                            swaps++;
                        }
                        
                        //while loop to compare the items in the array and move items as needed
                        while(pos >0 && ((Comparable)get(pos-1)).compareTo((Comparable)keyElement ) < 0)
                        {            
                                    //Set the item at pos to the item at pos-1 (essentially moving it down the array)
                                    set(pos,get(pos-1));

                                    //decrease pos by 1
                                     pos = pos-1;  
                                     
                                     //increase comparisons
                                     if(pos != 0){
                                         comparisons++;
                                     } 
                                     //Increase the number of items shifted
                                     shifts++;
                        }          
                //set the item at pos to the key element that was stored
                set(pos,keyElement);  
         }
         //Print the number of comparisons, swaps and the number of shifts that took place along the array 
        System.out.println("\nThe Insertion Sort is complete.\nThere where "+ size() + " elements, with: " + comparisons +" comparisons");
        System.out.println("For " + comparisons +" comparisons, there where " + shifts + " shifts and "+ swaps+" swaps completed");
    }  
}

