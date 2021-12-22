public class DynamicArray {

    private int[] arr;
    private int index;

    public DynamicArray(){
        arr = new int[10];
        index=0;
    }

    public void add(int data){
        if(index == arr.length){
            increaseCapacity();
        }
        arr[index] = data;
        index++;
    }

    public int get(int index){
        if(index < 0 || index >= arr.length) {
            System.out.println("Index out of bound.");
            return -1;
        }
        return arr[index];
    }

    public int size(){
        return index;
    }

    public void remove(int index){
        if(index < 0 || index >= arr.length) {
            System.out.println("Index out of bound.");
            return;
        }
        arr[index] = 0;
        index--;
    }

    public void increaseCapacity(){
        int[] tempArr = new int[arr.length * 2];

        for(int i=0; i<arr.length; i++){
            tempArr[i] = arr[i];
        }
        arr = tempArr;
    }
}
