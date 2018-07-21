# Arrays

Arrays are collection of similar items. They are index based and consume unused spaces.
Size of the array is defined at the time of creation.

Big-O Notation

1. Get - O(1) as Index based
2. Add  - O(N) as adding elements might have to travese to end
3. Delete - O(N) as deleting will cause shifting of elements
4. Search - O(N) 

## Type of arrays
    - One Dimentional
    - Two Dimentional

## Dynamic Arrays

As the size of arrays is defined at the time of it's creation, we can not add more elements to it. We can create dynamic arrays, in which while adding, check if the arrays has minimum capacity to accomodate one more element, if not then create another array with double the size of first array and copy all the elements from first array to new arrray. 
