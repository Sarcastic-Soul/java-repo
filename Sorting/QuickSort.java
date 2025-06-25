public class QuickSort {                                              // Time Complexity: Worst=n^2 Avg=n(logn)
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i= low-1;

        for(int j=low; j<high; j++) {
            if (arr[j] < pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap with pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public static void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int pi = partition(arr,low,high);
            quickSort(arr, low, pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr= {6,3,9,5,2,8};   // Given Array
        int n = arr.length;
        

        quickSort(arr,0,n-1);
        //Print
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
