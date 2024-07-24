// --------------------Bubble sort---------------------------------------
// class Sorting_3{
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
 

// ---------------------------------------------------------------------------------
// ------------------------Selection sort ---------------------------------------------
// class Sorting_3{
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

// -----------------------------------------------------------------------------------
// -----------------------Insertion Sort------------------------------------------
// class Sorting_3{
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

// ------------------------------------------------------------------------------------
// -------------------------Merge sort ----------------------------------------
// Based on divide and conquer method!
// class Sorting_3{
//     public static void merge(int arr[],int l,int mid,int r){
//         int n = arr.length;
//         int a[] = new int[n]; // creating new array to copy the elements of the old array!
//         int i = l; // track indices of given array.
//         int j = mid+1;
//         int k = l; // it'll track the indices of the new array.
//         while(i<=mid && j<=r){
//             if(arr[i]<arr[j]){
//                 a[k] = arr[i]; // inserting element of old array to the new one!
//                 k++;
//                 i++;
//             }
//             else{
//                 a[k] = arr[j];
//                 k++;
//                 j++;
//             }
//         }
//         while(i<=mid){ // if above loop terminates then this loop helps to copy the remaining element.
//             a[k] = arr[i];
//             k++;
//             i++;
//         }
//                                     // only one while loop condition among these two loop will perform!
//         while(j<=r){
//             a[k] = arr[j];
//             k++;
//             j++;
//         }
//         for(int m=l;m<=r;m++){ // at last again copying the element's of new array to the older one!
//             arr[m] = a[m];
//         }
//     }
//     public static void mergeSort(int arr[],int l,int r){
//         if(l<r){
//         int mid = (l+r)/2;
//         mergeSort(arr,l,mid); // 1st half
//         mergeSort(arr,mid+1,r); // 2nd half
//         merge(arr,l,mid,r); // merging
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {4,9,2,6,7,1};
//         mergeSort(arr,0,arr.length-1);
//     for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+"  ");
//     }

//     }
// }

// Time-Complexity for Best/Average/worst case is O(nlogn) for all the cases!

// ---------------------------------------------------------------------------------------------
// ----------------------------------Quick sort ----------------------------------------------------------------
// class Sorting_3{
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
 
// ----------------------------------------------------------------------------------
