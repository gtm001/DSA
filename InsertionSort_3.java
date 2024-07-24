// -----------------------Insertion Sort------------------------------------------
// class InsertionSort_3{
//     public static void printInsertionSort(int arr[]){
//         for(int i = 0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {2,5,1,7,3,4};
//         for(int i=1;i<arr.length;i++){ // in this outer loop starts from index 1 (letting i-1 be a sorted part).
//             int temp = arr[i]; // unsorted elements begins from here!
//             int j = i-1; // sorted element begins from here!
//             while(j>=0 && temp<arr[j]){
//                 arr[j+1] = arr[j];
//                 j--;
//             }
//             arr[j+1] = temp;

//         }
//         printInsertionSort(arr);
//     }
// }

// Time-Complexity is O(n^2).
// Best Case: O(n) when the array is already sorted.
// Average Case: O(n^2).
// Worst Case: O(n^2).

// ---------------------------------End---------------------------------------------------