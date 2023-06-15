/*
1. add(int index, E element) :-               	This method Inserts the specified element at the specified position in this list.

2. add(E e):-	                                This method Appends the specified element to the end of this list.

3. addAll(int index, Collection<E> c) :-	    This method Inserts all of the elements in the specified collection into this list, starting at the specified position.

4. addAll(Collection<E> c)	:-                  This method Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection’s iterator.

5. addFirst(E e) :-                             This method Inserts the specified element at the beginning of this list.

6. addLast(E e) :-                              This method Appends the specified element to the end of this list.

7. clear()	:-                                  This method removes all of the elements from this list.

8. clone()	:-                                  This method returns a shallow copy of this LinkedList.

9. contains(Object o) :-                        This method returns true if this list contains the specified element.

10. descendingIterator() :-                   	This method returns an iterator over the elements in this deque in reverse sequential order.

11. element() :-                                This method retrieves but does not remove, the head (first element) of this list.

12. get(int index) :-                           This method returns the element at the specified position in this list.

13. getFirst() :-                               This method returns the first element in this list.

14. getLast() :-                                This method returns the last element in this list.

15. indexOf(Object o) :-                        This method returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.

16. lastIndexOf(Object o) :-                    This method returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.

17. listIterator(int index) :-                  This method returns a list-iterator of the elements in this list (in proper sequence), starting at the specified position in the list.

18. offer(E e) :-                               This method Adds the specified element as the tail (last element) of this list.

19. offerFirst(E e) :-                         	This method Inserts the specified element at the front of this list.

20. offerLast(E e) :-                           This method Inserts the specified element at the end of this list.

21. peek() :-                                   This method retrieves but does not remove, the head (first element) of this list.

22. peekFirst() :-                              This method retrieves, but does not remove, the first element of this list, or returns null if this list is empty.

23. peekLast() :-                               This method retrieves, but does not remove, the last element of this list, or returns null if this list is empty.

24. poll() :-                                   This method retrieves and removes the head (first element) of this list.

25. pollFirst() :-                              This method retrieves and removes the first element of this list, or returns null if this list is empty.

26. pollLast() :-                               This method retrieves and removes the last element of this list, or returns null if this list is empty.

27. pop() :-                                    This method Pops an element from the stack represented by this list.

28. push(E e) :-                                This method pushes an element onto the stack represented by this list.

29. remove() :-                                 This method retrieves and removes the head (first element) of this list.

30. remove(int index) :-                       	This method removes the element at the specified position in this list.

31. remove(Object o) :-	                        This method removes the first occurrence of the specified element from this list if it is present.

32. removeFirst() :-                           	This method removes and returns the first element from this list.

33. removeFirstOccurrence(Object o) :-       	This method removes the first occurrence of the specified element in this list (when traversing the list from head to tail).

34. removeLast() :-                             This method removes and returns the last element from this list.

35. removeLastOccurrence(Object o) :-	        This method removes the last occurrence of the specified element in this list (when traversing the list from head to tail).

36. set(int index, E element) :-                This method replaces the element at the specified position in this list with the specified element.

37. size() :-	                                This method returns the number of elements in this list.

38. spliterator() :-                            This method creates a late-binding and fail-fast Spliterator over the elements in this list.

39. toArray() :-                                This method returns an array containing all of the elements in this list in proper sequence (from first to last element).

40. toArray(T[] a) :-                           This method returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.

41. toString() :-	                            This method returns a string containing all of the elements in this list in proper sequence (from first to the last element), each element is separated by commas and the String is enclosed in square brackets.

 */

package Sammu_2_Advanced_Java.Sammu_Collection_FrameWork;

import java.util.LinkedList;

public class _3_Linke_List {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(7);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);


        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(11);
        l2.add(22);
        l2.add(33);
        l2.add(44);
        l2.add(55);
        l2.add(66);
        l2.add(77);

        l1.addAll(l2);
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(+l1.get(i) + ", ");
        }

        System.out.println("\n************************************************************ ");

        l1.set(2, 8);
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(+l1.get(i) + ", ");
        }

        System.out.println("\n************************************************************ ");

        l1.remove(2);
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + ", ");
        }
        System.out.println("\n************************************************************ ");

        System.out.println("Index of 7 is : " +l1.indexOf(7));
        System.out.println("LastIndex of 7 is : "+l1.lastIndexOf(7));
        System.out.println("Element 2 is present : " + l1.contains(2));
    }

}
