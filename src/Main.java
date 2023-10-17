import  java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

     /* Linked List */
        LinkedList<String> animals = new LinkedList<>();

        LinkedListADT.addElement(animals);
        LinkedListADT.addElementWithIndex(animals, 0, "Tiger");
        LinkedListADT.getElementByIndex(animals, 2);
        LinkedListADT.setElementValueByIndex(animals, 1 , "Dog");
        LinkedListADT.scanElementLinkedList(animals);



        /*Stack*/
        Stack<Integer> numbers = new Stack<>();
        // 1 - push Stack
        StackADT.stackPush(numbers);
        // 2 - pop Stack
        StackADT.stackPop(numbers);
        // 3 - peek Stack
        StackADT.stackPeek(numbers);
        // 4 - stack Search
        StackADT.stackSearch(numbers, 3);
        // 5 - Empty Stack
        StackADT.checkEmptyStack(numbers);


        /*Queue implement LinkedList*/
        Queue<String> fruits = new LinkedList<>();
        QueueLinkedListADT.queueAdd(fruits);
        Queue<Integer> number = new LinkedList<>();
        QueueLinkedListADT.queueOffer(number);
        QueueLinkedListADT.queuePeek(number);
        QueueLinkedListADT.queueSearch(number, 3);
        QueueLinkedListADT.queuePoll(number);
        QueueLinkedListADT.forQueue(number);



        // Các thuật toán sắp xếp

        // 1 - Bubble Sort
        int[] randomNumbers = {100, 3, 1, 20, 5, 4};
        BubbleSortALU.bubbleSort(randomNumbers, randomNumbers.length);
        BubbleSortALU.printResult(randomNumbers);

        //2 - InsertionSort
        int[] randomNumbers2 = {100, 3, 1, 20, 5, 4};
        InsertionSortALU.InsertionSort(randomNumbers2);
        InsertionSortALU.printResult(randomNumbers2);

        //3- SelectionSort
        int[] randomNumbers3 = {100, 3, 1, 20, 5, 4};
        SelectionSortALU.selectionSort(randomNumbers3);
        SelectionSortALU.printResult(randomNumbers3);

        //4 - MergeSort
        int[] randomNumbers4 = {100, 3, 1, 20, 5, 4};
        MergeSortALU.sort(randomNumbers4, 0, randomNumbers4.length - 1);
        MergeSortALU.printResult(randomNumbers4);
    }
}