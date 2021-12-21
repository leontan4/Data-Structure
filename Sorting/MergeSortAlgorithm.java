// Time - O(nlogn), Space O(n)
public class MergeSortAlgorithm{
  public static int[] mergeSort(int[] arr){
    int n = arr.length;
        
    // Base Case
    // If the array length is less than 2, which is only 1 element left, then it will return
    if(n < 2){
      return arr;
    }

    // Declaring the variables to divide the arrays and spit them to different arrays
    int mid = n/2;
    int left[] = new int[mid];
    int right[] = new int[n-mid];

    // Divide into left and right
    // Populate the elements into left ad right array
    for(int i=0; i<mid; i++){
      left[i] = arr[i];
    }
    for(int i=mid; i<n; i++){
      right[i-mid] = arr[i];
    }

    // Will keep divide until the arrays only has 1 element and then merge it
    mergeSort(left);
    mergeSort(right);

    // Merging the arrays based on left and right
    // In this stage, we will compare left and right elements and reposition into the original array
    merge(arr, left, right, mid, n-mid);
    return arr;
}

  public static int[] merge(int[] arr, int[] left, int[] right, int leftLimit, int rightLimit){
    int leftIndex = 0;
    int rightIndex = 0;
    int arrIndex = 0;

    while(leftIndex < leftLimit && rightIndex < rightLimit){
      if(left[leftIndex] <= right[rightIndex]){
          arr[arrIndex] = left[leftIndex];
          leftIndex++;
      } else{
          arr[arrIndex] = right[rightIndex];
          rightIndex++;
      }
      arrIndex++;
    }

    // Populate the remaining elements in LEFT array into original array
    while(leftIndex < leftLimit){
      arr[arrIndex] = left[leftIndex];
      arrIndex++;
      leftIndex++;
    }

    // Populate the remaining elements in RIGHT array into original array
    while(rightIndex < rightLimit){
      arr[arrIndex] = right[rightIndex];
      arrIndex++;
      rightIndex++;
    }
    return arr;
  }
}
