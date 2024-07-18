//---------------------------Recursion-----------------------------------------
//--- A function calls itself is called Recursion.--
// Time complexity is 2^n. 

// here, it's a print recursive functtion to print 1 to 5.
// class Recursion_2{
//     public static void print(int n){
//         if(n>5){
//             return;
//         }
//         else{
//             System.out.println(n);
//             print(n+1);
//         }
//     }
//     public static void main(String args[]){
//         print(1);
//     }
// }
//--------------------------------------------------------------------------
// -------------------------------------------------------------------------
// ----Recursive function to print upto the desired number!----

// class Recursion_2{
//     public static void print(int i,int n){
//         if(i>n){
//             return;
//         }
//         else{
//             System.out.println(i); // reference 1
//             print(i+1,n); // reference 2
//         }
//     }
//     public static void main(String args[]){
//         int n = 6;
//         print(1,n);
//     }
// }

// From above as you can see that if we interchange the position of 'ref 1' and 'ref 2'
// then the result will be print in Reverse order....i.e due to Recursive Stack.
// -------------------------------------------------------------------------------------
// --------------------Recursive Stack----------------------------------------------

// class Recursion_2{
//     public static void print(int i,int n){
//         if(i>n){
//             return;
//         }
//         else{
//             print(i+1,n);
//             System.out.print(i+" ");
//         }
//     }
//     public static void main(String args[]){
//         int n =7;
//         print(1,n);
//     }
// }

// Reason behind Recursive Stack:- When we have a recursion call before some operation
// that operation are left to be executed and store in a recursion stack and when
// all the recursion calls are done then it is back-track and returns every steps
// of the operation one-by-one in reverse order.

// --------------------------------------------------------------------------------------
// --- Factorial of a number using Recursion!----------------------------------------
// class Recursion_2{
//     public static int fact(int n){
//         if(n==1 || n==0){
//             return 1;
//         }
//         else{
//         return n*fact(n-1); // n*(n-1)!
//         }
//     }
//     public static void main(String args[]){
//         System.out.println(fact(3));
//     }
// }
// ------------------------------------------------------------------------------
//-------------------------------------------------------------------------------
//--------------------Sum of 1st n natural number----------------------------------
// class Recursion_2{
//     public static int sumTon(int n){
//         if(n==0){
//             return 0;
//         }
//         else{
//             return n+sumTon(n-1);
//         }
//     }
//     public static void main(String args[]){
//         int a = 4;
//         System.out.println("the sum is : "+sumTon(a));
//     }
// }
//--------------------------------------------------------------------------------------
// -----------------------------------------------------------------------------------
// ------To find the sum of digit as well the the total number of digits---------------
// class Recursion_2{
//     public static int sumOfdigits(int n){
//         if(n==0){
//             return 0;
//         }
//         else{
//             return n%10 + sumOfdigits(n/10);
//         }
        
//     }
//     public static int countOfdigits(int c){
//         if(c==0){
//             return 0;
//         }
//         else{
//             return 1+countOfdigits(c/10);
//         }
//     }
//     public static void main(String args[]){
//         int n = 543;
//         System.out.println("Sum of the digits are :-");
//         System.out.println(sumOfdigits(n));
//         System.out.println("Count of the digits is : -");
//         System.out.println(countOfdigits(n));
//     }
// }
// -------------------------------------------------------------------------------------
// -----------------Fibonacci series till nth term--------------------------------------
// class Recursion_2{
//     public static void calFibo(int a,int b,int n){
//         if(n==0){
//             return;
//         }
//         else{
//         int c = a+b;
//         System.out.print(c+" ");
//         calFibo(b,c,n-1);
//         }
//     }
//     public static void main(String args[]){
//         int a = 0;
//         System.out.print(0+" ");
//         int b = 1;
//         System.out.print(1+" ");
//         int n = 8;
//         calFibo(a,b,n-2);

//     }
// }
// ---------------------------------------------------------------------------------
// ---------------------------------------------------------------------------------
// To find Fibonacci of a number. 0 1 1 2 3 5 8 13 . . . . .
// class Qprac{
//     public static int findFibo(int n){
//         int a = 0;
//         int b = 1;
//         if(n==0){
//             return a;
//         }
//         else if(n==1){
//             return b;
//         }
//         else{
//             return findFibo(n-1)+findFibo(n-2);
//         }
//     }
//     public static void main(String args[]){
//         int n = 6;
//         System.out.println("Fibonacci series at nth index is : "+findFibo(n));
//     }
// }
// ------------------------------------------------------------------------------------
// ------------------------Climbing Stairs Problem--------------------------------------------------------------
// It same as the Fibonacci logic    i.e        f(n)=f(n-1)+f(n-2) becoz, 
// in this it's given that either you can climb a stair or two stair at a time.
// 1 2 3 5 8 13.........

// here, we need to give the total number of ways of climbing the given stairs.

// class Recursion_2{
//     public static int climbStair(int n){
//         int a = 1;
//         int b = 2;
//         if(n==1){
//             return a;
//         }
//         if(n==2){
//             return b;
//         }
//         else{
//             return climbStair(n-1)+climbStair(n-2);
//         }
//     }
//     public static void main(String args[]){
//         int n = 5;
//         System.out.println("The total num of ways of climbing stair is : "+climbStair(n));
//     }
// }

// The Time-complexity of above is 2^n..hence, it'll show time exceeds! so, we can use
// the below code, which having TIME-COMPLEXITY of O(n).

// class Recursion_2{
//     public static int climbStair(int n){
//         if(n==1){
//             return 1;
//         }
//         if(n==2){
//             return 2;
//         }
//         else{
//             int a = 1;
//             int b = 2;
//             int x = 0;
//             for(int i =3;i<=n;i++){
//                 x = a+b;
//                 a=b;
//                 b=x;
//             }
//             return x;
//         }
//     }
//     public static void main(String args[]){
//         int n = 5;
//         System.out.println("The total num of ways of climbing stair is : "+climbStair(n));
//     }
// }
// --------------------------------------------------------------------------------------
// ---------------------------TAIL RECURSION----------------------------------------------------------
// Recursion written at the end of the function i.e called Tail Recursion.
// ---example of tail recursion-------
// ----Recursive function to print upto the desired number!----

// class Recursion_2{
//     public static void print(int i,int n){
//         if(i>n){
//             return;
//         }
//         else{
//             System.out.println(i); // reference 1
//             print(i+1,n); // reference 2
//         }
//     }
//     public static void main(String args[]){
//         int n = 6;
//         print(1,n);
//     }
// }

// It's more Optimised and Efficient.

// Fibnacci and Factorial code are not Tail recursive becouse it's recursive stack...
// in this one function depends on others!.
// ------------------------------------------------------------------------------
// --------------------------------------------------------------------------------
// ----------To find the power(x,n) upto n stack height-------------------------
// class Recursion_2{
//     public static int calpow(int x,int n){
//         if(n==0){
//             return 1;
//         }
//         if(x==0){
//             return 0;
//         }
//         else{
//             int xpownm1 = calpow(x,n-1);
//             int pow = x*xpownm1;
//             return pow;
//         }
//     }
//     public static void main(String args[]){
//         int n = 3;
//         int x = 4;
//         System.out.println("the ans is : "+calpow(n,x));
//     }
// }
//----------------------------------------------------------------------------
//====To find the power(x,n)========================
// if wedo it with tradition method there is if X^n then it mean X*X*X*.....n times, but 
// it's hacing Time-Complexity of O(n).

// As we know that if x^n where if n is even then it can also be written as (x^2)^n/2...myPow(x*x,n/2) and
// in case of odd it'll be x*x^n-1.... X*myPow(x,n-1).
// Time-Complexity will be logbase2n. 

// import java.util.*;
// class Solution {
//     public static double calPow(double x, double n){
//         if(n==0){
//             return 1;
//         }
//         if(n==1){
//             return x;
//         }
//             if(n%2==0){
//                 return calPow(x*x,n/2);
//             }
//             else{
//                 return x*calPow(x,n-1);
//             }
        
//     }
//      public static double myPow(double x, double n) {
//         if(n>=0){
//             return calPow(x,n);
//         }
//         else{
//             x = 1.0/x;
//             // double nn = n;
//             n*=-1;
//             return calPow(x,n);
//         }
//     }
//         public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         double x = sc.nextDouble();
//         int n = sc.nextInt();
//         System.out.println(calPow(x,n)); 
 
//     }
// }
// ----------------------------------------------------------------------------------------

// ---------------------------Tower Of Hanoi---------------------------------------------
// Time-complexity is O(2^n).

// class Recursion_2{
//     public static void TowerOfHanoi(int n,String src,String helper,String dest){
//         if(n==1){
//             System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
//             return;
//         }
//         else{
//         TowerOfHanoi(n-1,src,dest,helper); // leaving 1 disk in src.
//         System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
//         TowerOfHanoi(n-1,helper,src,dest);
//         }
//     }
//     public static void main(String args[]){
//         int n = 4;
//         TowerOfHanoi(n,"S","H","D");
//     }
// }
// --------------------------------------------------------------------------
// -------------Code to Reverse a String-------------------------------------
// class Recursion_2{
//     public static void revStr(String str, int i){
//         if(i==0){
//             System.out.print(str.charAt(i));
//         }
//         else{
//             System.out.print(str.charAt(i));
//             revStr(str,i-1);
//         }
//     }
//     public static void main(String args[]){
//         String str = "gautam";
//         revStr(str,str.length()-1);
//     }

// }

// ---Time-Complexity is O(n).---

// ------------------------------------------------------------------------
// ------------To find First and last Occurance of an elemet of a String----------------
// class Recursion_2{
//     public static int first = -1;
//     public static int last = -1;
//     public static void occStr(String str,int i,char element){
//         if(i==str.length()){
//             System.out.println("First Ocuurence at "+first);
//             System.out.println("Last Ocuurence at "+last);
//             return;
//         }

//         if(str.charAt(i)==element){
//             if(first==-1){
//                 first = i;
//             }
//             else{
//                 last = i;
//             }
//         }
//         occStr(str,i+1,element);

//     }
//     public static void main(String args[]){
//         String str = "aerrdgohdsfdr";
//         occStr(str,0,'r');
//     }
// }
// ------------------------------------------------------------------------
// --------Checking if Array is sorted or not (Strictly increasing!)----------
// class Recursion_2{
//     public static boolean checkArr(int arr[],int i){
//         if(i==arr.length-1){
//             return true;
//         }
//         if(arr[i]<arr[i+1]){
//             return checkArr(arr,i+1);
//         }
//         else{
//             return false;
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {2,3,4,5};
//         System.out.println(checkArr(arr,0));
//     }
// }
// ---Time-Complexity is O(n).---
// ------------------------------------------------------------------------------
// ------------Put x at the end of the String ---------------------------
// class Recursion_2{
//     public static void xatEnd(String str,int i,int count,String newstr){
//         if(i==str.length()){
//             for(int j=0;j<count;j++){
//                 newstr+='x';
//             }
//             System.out.println(newstr);
//             return;
//         }
//         if(str.charAt(i)!='x'){
//             newstr+=str.charAt(i);
//             xatEnd(str,i+1,count,newstr);
//         }
//         else{
//             count++;
//             xatEnd(str,i+1,count,newstr);
//         }
//     }
//     public static void main(String args[]){
//         String str = "abxxxdxxefg";
//         xatEnd(str,0,0,"");
//     }
// }

// ---Time-Complexity is O(n).---
// ------------------------------------------------------------------------------
// -------------Remove Dublicate from the String------------------------------------------
// Time complexity is O(n).----

// class Recursion_2{
//     public static boolean arr[] = new boolean[26]; // initially let arr store with the 'F' values!
//     public static void removeDub(String str,int index,String newStr){

//         if(index == str.length()){
//             System.out.println(newStr);
//             return;
//         }

//         char current = str.charAt(index);
//         if(arr[current-'a']==true){
//             removeDub(str,index+1,newStr);
//         }
//         else{
//             newStr+=current;
//             arr[current-'a']=true;
//             removeDub(str,index+1,newStr);

//         }
//     }
//     public static void main(String args[]){
//         String str = "abbbcdddeff";
//         removeDub(str,0,"");
//     }
// }
// ---------------------------------------------------------------------------
// ----------------Print all the subsequence of a String-------------------------------
// class Recursion_2{
//     public static void subsequence(String str,int idx,String newStr){

//        if(idx == str.length()){
//         System.out.println(newStr);
//         return;
//        }

//         char current = str.charAt(idx);

//         // to be
//         subsequence(str,idx+1,newStr+current);
//         // or not to be..
//         subsequence(str,idx+1,newStr);
//     }
//     public static void main(String arsg[]){
//         String str = "abc";
//         subsequence(str,0,"");
//     }
// }

// ---- Time-Complexity is O(2^n)....where n is the total number of char of the str -----
//-------------------------------------------------------------------------------------
// ----------To print the unique Subsequence of a String---------------------------------
// import java.util.HashSet;
// class Recursion_2{
//     public static void subsequence(String str,int index,String newStr,HashSet<String> set){
        
//         if(index == str.length()){
//             if(set.contains(newStr)){
//                 return;
//             }
//             else{
//                 System.out.println(newStr);
//                 set.add(newStr);
//                 return;
//             }
//         }
//
//         char current = str.charAt(index);
//         // to be
//         subsequence(str,index+1,newStr+current,set);
//         // or not to be...
//         subsequence(str,index+1,newStr,set);
//     }
//     public static void main(String args[]){
//         String str = "aaa";
//         HashSet<String> set = new HashSet<>();
//         subsequence(str,0,"",set);
//     }
// }

// --------------------------------------------------------------------------------
// ----------------------Kepad Combination------------------------------------------
// class Recursion_2{
//     public static String keypad[] = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
//     public static void printComb(String str,int idx,String combination){

//         if(idx == str.length()){
//             System.out.print(combination+" ");
//             return;
//         }

//         char current = str.charAt(idx);
//         String mapping = keypad[current - '0'];
//         for(int i =0;i<mapping.length();i++){
//             char c = mapping.charAt(i);
//             printComb(str,idx+1,combination+c);
//         }

//     }
//     public static void main(String args[]){
//         String str = "71";
//         printComb(str,0,"");

//     }
// }
// --- Time-Complexity is O(4^n) -----------------------------------
// ------------------------------------------------------------------------------------

// ----------------------String Permutation---------------------------------------------
// class Recursion_2{
//     public static void stringPermut(String str,String permutation){

//         if(str.length()==0){
//             System.out.println(permutation);
//         }

//         for(int i = 0;i<str.length();i++){
//             char current = str.charAt(i);
//             String newStr = str.substring(0,i)+str.substring(i+1);
//             stringPermut(newStr,permutation+current);
//         }
//     }
//     public static void main(String args[]){
//         String str = "abc";
//         stringPermut(str,"");
//     }
// }
// -----------------Time-Complexity is O(n!)----------------------------------------
// -------------------------------------------------------------------------------------
// ---------------------------------------------------------------------------------------

// --------Count total path in a maze to move from (0,0) to (n,m).------------------

// class Recursion_2{
//     public static int path(int i,int j,int n,int m){
//         if(i==n||j==m){
//             return 0;
//         }
//         if(i==n-1 && j==m-1){
//             return 1;
//         }
//         // move right
//         int r = path(i,j+1,n,m);
//         // move down
//         int d = path(i+1,j,n,m);
//         return r+d;
//     }
//     public static void main(String args[]){
//         int n = 3;
//         int m = 3;
//         int total = path(0,0,n,m);
//         System.out.println(total);
//     }
// }
// --------------------------------------------------------------------------------
// -----------------------------------------------------------------------------------
// --------------Place tile of size 1xm in a floor of size nxm-------------------

// class Recursion_2{
//     public static int placeTile(int n,int m){
//         // important
//         if(n==m){
//             return 2;
//         }
//         if(n<m){
//             return 1;
//         }

//         // if placed horizontal
//         int horizontal = placeTile(n-1,m);

//         // if placed vertical
//         int vertical = placeTile(n-m,m);
//         return horizontal+vertical;
//     }
//     public static void main(String args[]){
//         int n = 4;
//         int m = 3;
//         int totalWays = placeTile(n,m);
//         System.out.println(totalWays);
//     }
// }
// ------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------
// ---Find no. of ways in which you can invite n num of people ,single or in pair-------

// class Recursion_2{
//     public static int nInvite(int n){
//     if(n<=0){
//         return 1;
//     }
//     // for single
//     int single = nInvite(n-1);
//     // for pair
//     int pair = (n-1)*nInvite(n-2);
//     int total = single + pair;
//     return total;
//     }
//     public static void main(String args[]){
//         int n = 4;
//         int totalWays = nInvite(n);
//         System.out.println(totalWays);
//     }
// }
// ------------------------------------------------------------------
// ----------------------------------------------------------
// ------------------Subset of a number ----------------------------------------
// import java.util.ArrayList;
// class Recursion_2{
//     public static void printSubset(ArrayList<Integer> subset){
//         for(int i =0;i<subset.size();i++){
//             System.out.print(subset.get(i)+" ");
//         }
//         System.out.println();
//     }
//     public static void findSubset(int n,ArrayList<Integer> subset){
//         if(n==0){
//             printSubset(subset);
//             return;
//         }
//         // if added
//         subset.add(n);
//         findSubset(n-1,subset);

//         // if not added
//         subset.remove(subset.size()-1);
//         findSubset(n-1,subset);
//     }
//     public static void main(String args[]){
//         int n = 5;
//         ArrayList<Integer> subset = new ArrayList<>();
//         findSubset(n,subset);

//     }
// }



