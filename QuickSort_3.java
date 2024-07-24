// ----------------------------------Quick sort ----------------------------------------------------------------
// class QuickSort_3{
//     public static int partition(int arr[],int l,int h){ 
//         int pivot = arr[l]; // selecting first element as pivot.
//         int i = l; // low to high traversing index.
//         int j = h; // high to low traversing index.
//         while(i<j){
//             while(arr[i]<=pivot && i<h){ // while low to high!
//                 i++;
//             }
//             while(arr[j]>=pivot && j>l){ // while high to low!
//                 j--;
//             }
//             if(i<j){
//                 // swap(arr,i,j);
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//             }
//         }
//         // swap(arr,j,l)
//         int temp = arr[j];
//         arr[j] = arr[l];
//         arr[l] = temp;

//         return j; // returns index of pivot which at the partion index of the array!

//     }
//     public static void quickSort(int arr[],int l,int h){
        
//             if(l<h){
//                 int mid = partition(arr,l,h);
//                 quickSort(arr,l,mid-1); // Sorting from low to partition-1.
//                 quickSort(arr,mid+1,h); // Sorting from partion+1 to the last index of the array!
//             }
        
//     }
//     public static void main(String args[]){
//         int arr[] = {2,5,1,8,9,4,3};
//         quickSort(arr,0,arr.length-1);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }
// Time-Complexity for best-case/average-case is O(nlogn).
// Time-Complexity for wrost-case is O(n^2).

// Note:- two ways to convert worst-case to best case are:-
//        1. take pivot as a middle index of the array.
//        2. Or, take pivot as a random index instead of 0 index.
 
// -----------------------------End-----------------------------------------------------
