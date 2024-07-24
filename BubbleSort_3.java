// --------------------Bubble sort---------------------------------------
// class BubbleSort_3{
//     public static void printBubbleSort(int arr[]){
//         for(int i = 0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {11,4,8,9,2};
//         for(int i = 0;i<arr.length-1;i++){ // traversing over full array!
//             for(int j = 0;j<arr.length-1-i;j++){ // traversing on unsorted element of array!,seperating sorted element of array!
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j+1];
//                     arr[j+1] = arr[j];
//                     arr[j] = temp;
//                 }
//             }
//         }
//         printBubbleSort(arr);
//     }
// }

// Time-Complexity is O(n^2).
// Best Case: O(n) when the array is already sorted.
// Average Case: O(n^2).
// Worst Case: O(n^2).
 

// -----------------------------End----------------------------------------------------