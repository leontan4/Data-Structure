package Heaps;

public class Main {
    public static void main(String[] args){
       Heap heap = new Heap(10);

        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(61);
        heap.insert(65);

        heap.sort();
        heap.printHeap();

    }
}
