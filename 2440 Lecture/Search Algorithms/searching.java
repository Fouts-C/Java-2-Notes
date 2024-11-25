package Search Algorithms;

public class searching {


    //Sequential search
    public static int search(Object[] arr, int first, int size, Object target)
    {

        for (int i = first; i < size + first; i++)
        {
            if (arr[i].equals(target)){
                return i;
            }
        }
        return -1;
    }

    //Binary search
    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Found the target
            } else if (arr[mid] < target) {
                return binarySearchRecursive(arr, target, mid + 1, right); // Search the right half
            } else {
                return binarySearchRecursive(arr, target, left, mid - 1); // Search the left half
            }
        }

        return -1; // Target not found
    }
    
}
