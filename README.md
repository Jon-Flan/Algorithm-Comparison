# Compare Sorting Algorithms
Comparing the Bubble Sort and the Insertion Sort in terms of efficiency<br>
![Intro Pic](https://www.educative.io/v2api/editorpage/5993162860396544/image/6387039647825920)

### Table of Contents
1. Testing Method	
2. Report:	
3. Comparisons	
4. Swaps	
5. Complexity	
6. Bubble Sort	
7. Insertion Sort	
8. Efficiency	
9. Conclusion	
10. Further Tables

## Testing Method
For testing the two algorithms, 3 lists where chosen where the number of elements doubled for each subsequent test. <br>
The first list comprised of 10 elements, second 20 elements, third 40 elements. <br>
After testing at multiple sized lists, lists of these sizes where chosen for the report as graphing results to scale on <br>
larger data sets was not viable due to the variances growing greater with larger lists. (Displayed in chart boxes at the end of report, [Figure 6]) <br>
To make sure the efficiency was tested equally, an initial set of predetermined elements at random order (Human defined in code) was used as the <br>
basis for creating each list. Once each list was created it was tested against the bubble sort algorithm, its results recorded and then <br>
the same list used for the bubble sort was recreated and tested against the insertion sort algorithm. This was done to mitigate <br>
any variance in the lists and negate the possibility of any elements falling into the “correct” order when randomising with a shuffle.<br>
Three secondary tests where also carried out:
1. list of ten elements in reverse order and sorted order to get best and worst <br>
case scenarios, 
2. 4 lists in reverser order of size 10,20,30,40 to compare Insertion sort swaps and shifts to <br>
Bubble sort swaps. 
3. Ten lists of size 10 with each list ranging from zero items sorted to all items sorted and number of comparisons were recorded. <br>





## Report:
### Comparisons
In the tests with 10,20 and 40 pre-set random order elements the bubble sort always completed n(n-1)/2 comparisons on each list. [Figure 1]<br>
With a secondary test of two lists of 10 elements, one sorted and one in reverse order, the Bubble sort also always <br>
completed n(n-1)/2 comparisons. It can be concluded then that bubble sort best case and worst-case scenarios for comparisons <br>
is the same at n(n-1)/2. [Figure 2] <br>
While for insertion sort it depended on the order of the list for how many comparisons where done. For the tests with 10,20 and <br>
40 elements in the pre-set random order the number of comparisons completed by the Insertion sort was roughly close to n(n-1)/4. [Figure 1]<br>
With the secondary test for Insertion sort on sorted and reverse order lists of 10 elements, the number of comparisons <br>
completed was n-1 (for the already fully sorted list) and n(n-1)/2 for the list where every element is in reverse order. [Figure 2] <br>
With these results we can conclude for Insertion sort, best case scenario is n-1, worst case scenario is n(n-1)/2 and the average <br>
scenario is roughly n(n-1)/4 for comparisons. Therefore, the average amount of comparison completed by Insertion sort was <br>
roughly half of the comparisons completed by Bubble sort. <br>

**Figure 1**
![Figure 1](https://github.com/Jon-Flan/Algorithm-Comparison/blob/main/AlgorithmComparison/Graphs/Comparison_Graph.png)

**Figure 2**
<br>
![Figure 2](https://github.com/Jon-Flan/Algorithm-Comparison/blob/main/AlgorithmComparison/Graphs/Comparison_Table.PNG)

### Swaps
A swap as defined in Bubble sort is when two elements are swapped with each other. With Insertion sort a swap is defined as, <br>
when an element that was copied out of the list is inserted back into the list at its correct position.<br> 
For example, an array of integers [2,3,4,5,1]. To sort in ascending order, for insertion sort: [1] is copied from the list, <br>
compared against each element, and inserted in its correct position at index 0 while all other elements where shifted along the array. <br>
This is counted as 1 swap, as only 1 element was removed and placed back into the array. For Bubble Sort, [5] is swapped with [1], <br>
then [4] is swapped with [1] then [3] is swapped with [1] and then [2] is swapped with [1]. In this scenario, 4 swaps have been completed.<br>
Recording the swaps was done during the same tests as recording comparisons, with lists of size, 10, 20 and 40 with pre-set random order elements. <br>
For these tests, the number of swaps performed by the Bubble sort was always greater than then number of swaps performed by the Insertion sort. <br>
Judging by the trend in the graphs [Figure 3], it is a fair conclusion to extrapolate that this will always be the case with a widening gap, <br>
for lists of random elements “almost” sorted. It is worth noting that while the number of swaps carried out by Insertion sort was less then <br>
those performed by the Bubble Sort, the number of elements shifted in the Insertion sort was identical with the number of swaps in Bubble sort.<br>

**Figure 3**
![Figure 3](https://github.com/Jon-Flan/Algorithm-Comparison/blob/main/AlgorithmComparison/Graphs/Swaps_Graph.png)


In a test where each element in the list is unique, such a list of integers where no 2 elements are the same integer, <br>
and the list is in reverse order. The Bubble sort always completed n(n-1)/2 swaps whereas the Insertion sort always completed n-1 swaps. [Figure 4]  <br>
This should not be confused with “shifts” carried out by the Insertion sort. As in this scenario although only n-1 elements are copied <br>
from and re-inserted to the list, every possible comparison and shift of elements is carried out with results of n(n-1)/2. <br>
Therefore, in this case, theoretically, Insertion sort runs no faster than Bubble sort. <br>

**Figure 4**
<br>
![Figure 4](https://github.com/Jon-Flan/Algorithm-Comparison/blob/main/AlgorithmComparison/Graphs/Swaps_Table_Worst_Case.PNG)

We can conclude from these tests that for a random set of data the in terms of swaps completed, Insertion sort is more efficient than Bubble sort. <br>

### Complexity
With the results above it is worth comparing their complexity. To calculate the complexity of the two algorithms we can look at their <br>
pseudo code and calculate the Big-O value.<br>
<br>
#### Bubble Sort
```
For i = 0 up to the number of elements => Complexity of n 
{
	For j = 0 up to the number of elements -1-i => Complexity of n 
	{
		If the element at j > the element at j+1 => Complexity of 1
		{
			Swap the element at j with the element at j+1 
		{
	{
{
```
O(n*n*1) = O(n^2) <br>
Therefore, Bubble sort has a worst-case complexity of O(n^2). <br>
<br>
#### Insertion Sort
```
For i = 1 up to i < the number of elements, i++ => Complexity of n
{
	keyElement = the Element at i => Complexity of 1
	pos = i => Complexity of 1
		while pos > 0 and the element at pos -1 > keyElement => Complexity of n
		{
			The element at pos = the element at pos -1 => Complexity of 1
			pos = pos-1 => Complexity of 1
		}
	The element at pos = keyElement => Complexity of 1
}
```
O(n * 1 * 1 * n * 1 * 1 ) = O(n^2) <br>
Therefore, Insertion sort has a worst-case complexity of O(n^2). With both algorithms having a worst case Big-O value of O(n^2), <br>
the difference is in the inner loops, as Bubble sort will always compare each element against the rest, Insertion sort will only <br>
enter its inner loop some of the time. <br>
<br>
### Efficiency
To further test the efficiency a test was carried out on ten separate lists each containing 10 elements, for each list there was a <br>
specific number of elements out of order from 0 to All Elements. The results can be seen below. [Figure 5] <br>
It can be seen in the graph below that when a list of elements is already at approx. 55% sorted then Insertion sort will compare at N(N-1)/4.<br>
Since Insertion sort assumes that elements to the left of the item being sorted are sorted already, Insertion sort will compare on <br>
average on each pass n(n-1)/4 elements before the correct position is found. That is inline with the previous examples where Insertion sort <br>
completed approximately half the amount of comparisons that Bubble sort completed.<br>
It can also be seen from the graph that when starting to sort a list, if more than 10% of the list is sorted already then the number <br>
of comparisons carried out by Insertion sort will be less than N(N-1)/2 whereas Bubble Sort compares at a consistent rate of N(N-1)/2 no <br>
matter what % of the list is already sorted. <br>
<br>
**Figure 5**
<br>
![Figure 5](https://github.com/Jon-Flan/Algorithm-Comparison/blob/main/AlgorithmComparison/Graphs/Efficiency.PNG)
<br>

### Conclusion
With tests done between the swaps/comparisons of each algorithm, when a list of random elements is to be sorted, <br>
or a list of “almost” sorted elements needs to be sorted. Insertion sort will be more efficient than Bubble sort. <br>
From the tests carried out, it can be reasonably concluded that the act of copying an element out of the list once, <br>
for reinsertion at its correct location, is less time consuming at execution time than the continuous swapping of two elements <br>
at their indices in Bubble sort [Figure 6]. Also when comparisons are completed by each algorithm the Bubble sort will always <br>
complete n(n-2)/2 comparisons while Insertion sort will vary between n-1 and n(n-1)/2 with an average comparison amount of n(n-1)/4. <br>
If the list is in reverse order to the order in which it needs to be sorted in, then there is no theoretical difference in the performance of each. <br>

Overall, three conclusions can be met:<br>
1.	In most real-world examples, where there is a list of random, almost sorted data, although both algorithms are a Big-O 
    complexity of O(n^2), Insertion sort will be more efficient than Bubble sort in terms of execution time/comparisons/swaps.
2.	When a list has approximately more than 10% of its items sorted already, Insertion Sort is more efficient that Bubble Sort in terms of comparisons.
3.	Insertion sort will always be more efficient in terms of swaps.
<br>
Figure 6
<br>

![Figure 6](https://github.com/Jon-Flan/Algorithm-Comparison/blob/main/AlgorithmComparison/Graphs/Overall.PNG)
