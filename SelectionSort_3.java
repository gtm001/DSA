// ------------------------Selection sort ---------------------------------------------
// class SelectionSort_3{
//         public static void printSelectionSort(int arr[]){
//         for(int i = 0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {9,4,2,3,8,1};
//         for(int i=0;i<arr.length-1;i++){ // outer loop iterate upto n-1;
//             int smallest = i; // select the smallest element from the array!
//             for(int j=i+1;j<arr.length;j++){ // starts from one preceeding index of thr selected element!
//                 if(arr[smallest]>arr[j]){
//                     smallest = j;
//                 }
//                 // swap
//                 int temp = arr[smallest];
//                 arr[smallest] = arr[i];
//                 arr[i] = temp;
//             }
//         }

//         printSelectionSort(arr);
//     }
// }

// Time-Complexity is O(n^2).
// Best Case: O(n^2).
// Average Case: O(n^2).
// Worst Case: O(n^2).

// -----------------------------End------------------------------------------------------