# Lists

List are dynamic data structure which is used for fast and memory efficient operations.

### ArrayList

As the name suggest ArrayList is the list of Objects. It uses arrays internally to store all the Objects. It is re-sizable in nature and grows and shrinks according to load factor. Default loading factor is 75%. When ArrayList are 75% filled up, then on addition of extra elements will result in creation of new ArrayList with double the size of old ArrayList.

All the elements from old ArrayList are copied to new ArrayList. 

#### Time Complexity(Big-O Notation) of ArrayList
    - Get - O(1) as Index based
    - Add  - O(N) as adding elements might have to travese to end
    - Delete - O(N) as deleting will cause shifting of elements
    - Search - O(N) 

ArrayList empty spaces are wasted. When we want the fast retrieval, ArrayList are best. 



### LinkedList
As the name suggestions, LinkedList store the links to next elements in the list. It uses memory pointer to store the location of next elements in the list. Additional space is not wasted in LinkedList.

    - Singly LinkedList
    - Doubly LinkedList
    - Circular LinkedList


