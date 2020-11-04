
package algorithmtest;

/* @author Jonathan Flanagan (x18143890)
CA for Advanced Programming Semester 1, Year 3 at NCI
Testing Sorting Algorithms
There should be three arrayLists tested the first will be the initial size, and each subsequent ArrayList
Will be double the list before up to 3 tests. I chose to make sure to compare the Algorithms against identical lists for each test.*/

public class AlgorithmTest {
    //Declare array lists to be used
    static MyArrayList<Integer>myList = new MyArrayList<>();
    
    //Method to create the List to be used
     public static void addItems(int x){
        //add integers to the list 
        for(int j=0; j < x; j++){
            myList.add(4);
            myList.add(6);
            myList.add(7);
            myList.add(2);
            myList.add(9);
            myList.add(10);
            myList.add(1);
            myList.add(5);
            myList.add(3);
            myList.add(8);        
        }  
     }
     
     //Method to print the lists seperating to a new line every 25 items
     public static void printList(){
         //print the sorted list
        System.out.print("The sorted list is: ");
        //for loop to print the sorted lst
        for(int k = 0; k < myList.size() ; k++){
            //every 10 items go to a new line
            if(k % 10 == 0){
                System.out.println("");
            }
            //print each element of the sorted llist
            System.out.print(myList.get(k) + ", " );
        }
     }
     
    //Main Method
    public static void main(String[] args) {
        //declare List Size & number of tests to perform
         int listSize =1; //will be the number of items in the list * listSize
         int tests = 3;
         
         //set the list number
         int listNumber = 1;

        //for loop to go through the process three times
         for(int i = 0; i < tests; i++){
                //create the list
                addItems(listSize);
                System.out.print("\n\n******\nList number "+listNumber+" of "+myList.size()+" elements being created\n******\n");
                
                // Get Start time  and start the sort
                long startTimeBubble = System.currentTimeMillis();
                //Apply Bubble Sort and Print the results
                myList.Bubblesort();
                // Record the time of completion
                long endTimeBubble = System.currentTimeMillis();
                //Print the results
                System.out.println("The Bubble Sort took " + (endTimeBubble - startTimeBubble) + "ms");
                //print the sorted list
                printList();
                
                //clear the sorted list and recreate the exact same list
                myList.clear();
                System.out.print("\n\n******\nRecreating the original list to apply Insertion Sort\n******\n");
                addItems(listSize);
                
                // Get Start time and start the sort
                long startTimeInsertion = System.currentTimeMillis();
                //Apply Insertion Sort and Print the results
                myList.InsertionSort();
                //record the time of completion
                long endTimeInsertion = System.currentTimeMillis();
                //Print the results
                System.out.println("The Insertion Sort took " + (endTimeInsertion - startTimeInsertion) + "ms");
                //print the sorted list
                printList();
                
                //Clear the list, to be able to start again
                myList.clear();
                //incriment the list number and double the size of the list
                listNumber++;
                listSize = listSize + listSize;
                
        }System.exit(0);//exit the program cleanly
    }
}
