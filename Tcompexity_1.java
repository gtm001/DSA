// TIME COMPLEXCITY AND SPACE COMPLEXITY

/** here, time of execution is directly depend upton the size of 'n' i.e taken by the user.
 * for ex- for loop.
 * 
 * time-complexity is directly propositional the n, that means it's linear!.
 * 
 * three-type of time complexit are there:-
 * BEST CASE -- Omega(1)
 * AVERAGE CASE -- theta(n+1/2)
 * WROST CASE -- O(n)  (big O of n)
 * 
 * SO, THERE WILL BE MORE FOCUS ON THE O(n).
 * 
 * Examples of Time-Complexity:-
 *  let say there is a nested loop, if the codition of both outer and inner loop is n,
 * then the time complexity will be O(nxn), also in case if size of outer and inner loop 
 * is n and m then the time-complexity is O(nxm).
 * 
 * but in case if there is two seperate loop of size n and m instead of nested loop then
 * the time complexity of Big O willbe m+n i.e O(m+n).
 * Also if n=3 amd m=10^3 then we'll gonna ignore n and hence time complexity becomes O(10^3).
 * 
 * Also, if there is a loop with increament i=i*2 and let condition be 'K',
 *  then the time-complexity when 2^K>n is 'O(log n to the base 2)'.
 * 
 * and also in case if increment is i=i*c, then time-complexity is 'O(long n to the base c)'.
 * 
 * We always neglet the lesser value in time-complexity.
 * 
 * --Types of time-complexity are:-
 * 1. Constant Time Complexity - O(1).
 * 2. Logarithmic time Compllexity - O(log n).
 * 3. Linear Time Complexity - O(n).
 * 4. O(n log n) time complexity.
 * 5. Quadratic time complexity - O(n2).
 * 6. Exponential Time - n^2.
 * 7. Factorila Time - n!  .
 * 
 * ---Order of Growth of Time-complexity-------------
 * O(1) < O(logn) < O(n) < O(nlogn) < O(n^2) < O(n^3) < O(2^n) < O(n!)
 * 
 * SPACE-COMPLEXITY
 * it's depend upon the variable of the code store in the form of memory.
 * 
 * for ex- in case of for-loop if we increase the n, then there will be no effect on
 * the space of the code, therefore space will be constant doesn't depend on
 * the input size.
 * But in Case of Array it does!
 * 
 * LESSER WILL BE THE TIME OR SPACE BETTER WILL BE THE CODE!
 * 
 * 
 */

 
 
