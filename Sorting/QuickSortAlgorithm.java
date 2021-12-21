public class QuickSortAlgorithm {
    public static void quickSort(int[]arr, int start, int end){
        // Base Case
        // To determine the start index does not exceed the end index
        if(start < end){
            int pIndex = partition(arr, start, end);
            quickSort(arr, start, pIndex-1);
            quickSort(arr, pIndex+1, end);
        }
    }
    
    // Partition is to look for the 'MIDDLE' position
    // Elements SMALLER than pivot will be on the LEFT side of array
    // Elements LARGER than PIVOT will be on the RIGHT side of array
    public static int partition(int[] arr, int start, int end){
        int pIndex = start;
        int pivot = arr[end];
        
        for(int i=start; i<end; i++){
            if(arr[i] <= pivot){
                swap(arr, i, pIndex);
                pIndex++;
            }
        }
        swap(arr, pIndex, end);
        return pIndex;
    }
    
    // Swap the positions of the elements, in comparison to the pivot
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
