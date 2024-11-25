package Sorting Algorithms;

public class sorting {


    /*Selection sort 
    works by repeatedly finding
    the smallest item in the unsorted portion of
    the array and swapping it into its correct
    position. The unsorted portion then
    decreases by one element. The sorted
    portion builds up from data[0] through
    data[n-1], one element at a time. */

    //O(n^2)
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion sort
    // maintains a sorted portion of the array at the
    // beginning of the array
    // At each step, insertion sort examines the first element in the
    // unsorted portion of the array (call it current), and shifts
    // elements from the sorted portion to the right in order to
    // insert current into its proper place in the sorted portion.

    //O(n^2)
    //Works well if the data is already partially sorted
    
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
}


//Bubble sort
//Takes the larges num, bubbles it up and puts it at the end (if greater than all other vals)
//O(n^2)
static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                // Swap arr[j] and arr[j+1]
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

//Merge sort
//O(n log n)
private static void merge(int[] array, int[] helper, int low, int middle, int high) {
    // Copy both halves into the helper array
    for (int i = low; i <= high; i++) {
        helper[i] = array[i];
    }

    int i = low; // Pointer for left half
    int j = middle + 1; // Pointer for right half
    int k = low; // Pointer for merged array

    // Merge the two halves back into the original array
    while (i <= middle && j <= high) {
        if (helper[i] <= helper[j]) {
            array[k] = helper[i];
            i++;
        } else {
            array[k] = helper[j];
            j++;
        }
        k++;
    }

    // Copy the rest of the left side of the array into the target array
    while (i <= middle) {
        array[k] = helper[i];
        k++;
        i++;
    }
}


//Quicksort
    // This method implements the QuickSort algorithm recursively
    // It partitions the array around a pivot element and recursively sorts the sub-arrays
    // Time Complexity: O(n log n) on average case, O(n^2) worst-case
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the index of the pivot element
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the left and right sub-arrays
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Helper method to partition the array and return the index of the pivot element
    private static int partition(int[] arr, int low, int high) {
        // Choose the pivot element (in this case, the last element)
        int pivot = arr[high];
        int i = low - 1; // Index of the smaller element

        // Iterate through the array and move elements smaller than the pivot to the left
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at index (i+1)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the index of the pivot element
        return i + 1;
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

