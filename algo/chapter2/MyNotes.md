### notes on DequeSort
naive thought:  
swap the top two if the first element is greater than the second  
and then cycle shift the array to left (which is equivalent to   
move the top card to the bottom)  
but for example  
```
Before sorting
1  5  2  3  10  6  33  23  12  18  11  
After cycle shift
5  2  3  10  6  33  23  12  18  11  1  
After cycle shift
5  3  10  6  33  23  12  18  11  1  2  
After cycle shift
5  10  6  33  23  12  18  11  1  2  3  
After cycle shift
10  6  33  23  12  18  11  1  2  3  5  
After cycle shift
10  33  23  12  18  11  1  2  3  5  6  
Before cycle shift
10  33  23  12  18  11  1  2  3  5  6  
After cycle shift
33  23  12  18  11  1  2  3  5  6  10  
Before cycle shift
23  33  12  18  11  1  2  3  5  6  10  
After cycle shift
33  12  18  11  1  2  3  5  6  10  23  
Before cycle shift
12  33  18  11  1  2  3  5  6  10  23  
After cycle shift
33  18  11  1  2  3  5  6  10  23  12  
Before cycle shift
18  33  11  1  2  3  5  6  10  23  12  
After cycle shift
33  11  1  2  3  5  6  10  23  12  18  
Before cycle shift
11  33  1  2  3  5  6  10  23  12  18  
After cycle shift
33  1  2  3  5  6  10  23  12  18  11  
Before cycle shift
1  33  2  3  5  6  10  23  12  18  11  
After cycle shift
33  2  3  5  6  10  23  12  18  11  1  
Before cycle shift
2  33  3  5  6  10  23  12  18  11  1  
After cycle shift
33  3  5  6  10  23  12  18  11  1  2  
Before cycle shift
3  33  5  6  10  23  12  18  11  1  2  
After cycle shift
33  5  6  10  23  12  18  11  1  2  3  
Before cycle shift
5  33  6  10  23  12  18  11  1  2  3  
After cycle shift
33  6  10  23  12  18  11  1  2  3  5  
Before cycle shift
6  33  10  23  12  18  11  1  2  3  5  
After cycle shift
33  10  23  12  18  11  1  2  3  5  6  
Before cycle shift
10  33  23  12  18  11  1  2  3  5  6  
After cycle shift
33  23  12  18  11  1  2  3  5  6  10  
Before cycle shift
23  33  12  18  11  1  2  3  5  6  10  
After cycle shift
33  12  18  11  1  2  3  5  6  10  23  
Before cycle shift
12  33  18  11  1  2  3  5  6  10  23  
After cycle shift
33  18  11  1  2  3  5  6  10  23  12  
Before cycle shift
18  33  11  1  2  3  5  6  10  23  12  
After cycle shift
33  11  1  2  3  5  6  10  23  12  18  
Before cycle shift
11  33  1  2  3  5  6  10  23  12  18  
After cycle shift
33  1  2  3  5  6  10  23  12  18  11  
Before cycle shift
1  33  2  3  5  6  10  23  12  18  11  
After cycle shift
33  2  3  5  6  10  23  12  18  11  1  
Before cycle shift
2  33  3  5  6  10  23  12  18  11  1  
After cycle shift
33  3  5  6  10  23  12  18  11  1  2  
Before cycle shift
3  33  5  6  10  23  12  18  11  1  2 
```  

we see that the largest element 33 will bubble down to the array  
and it will end up in a endless loop  


to do:  
 - [ ] how to use bash to delete the before cycle shift above?  


the method is kind of like the bubble sort.   
Define a variable `turns` to indicate in which stage of the sorting  
we are in. During the (n - turns)th turn, we make sure that the  
largest turns element is found.  So if we maintain a `count` variable  
to count how many elements we have considered sofar in a turn.  
if `count` reach that `turns` limit, which means the rest (n - turns) are  
already sorted,  we just cycle shift the array.  In this case, we avoid  
the largest element bubble down the array,  as the problem of the above   
example indicates.  


To speed up, we can maintain another variable `smallerCount`, if it is the `turns`,   meaning that the array is already sorted.( since the rest element is already sorted)  
we can break the while loop.  

### tips
each time using a while loop, dont forget to increase the varible, on which the condition  of while loop is dependent upon.  
While implementing the algo, I forgot to increase the varible of the segment  
```
    while(moveCount < n - turns) {
        cycleShift(arr);
        moveCount++;
    }
```   
so the result ends up running without an end. By seeing the trace.  I found 
that the array is keeping cycle shifting.  And by insert a debug sentence  
before the while loop, printing out some variables,  I saw that there is no such  
output comming after this loop if entering it,  meaning that the loop is endless and it will never breaks.  

**To Do: **
 - [ ] make the algo generic