// -------------------------Merge sort ----------------------------------------
// Based on divide and conquer method!
// class MergeSort_3{
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

// --------------------------------End------------------------------------------------------