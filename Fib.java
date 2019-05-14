/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.
 */
import java.lang.Math;

public class Fib {
    /** 
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
	if (n <= 2) return 1;
	else {
	    return fib_recurrence(n-1) + fib_recurrence(n-2);
	}
    }
     /* These are class methods because...

       They can be called by without creating an instance of the class
    */


    /** 
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
	int current = 1;
	int prev = 0;
	int count = 1;
	while (count < n) {
	    int tempPrev = prev;
	    int tempCurrent = current;
	    current += tempPrev;
	    prev = tempCurrent;
	    count++;
	}
        return current;
    }
    /* Time complexity: Linear
       Consider the size of the problem to be ... n
       
       As the proxy for the time required, count... the cost it takes
       to set prev and current to new values each iteration
       
       Then cost of the the recurrence algorithm
       grows linearly
       as the size of the problem increases,
       because the number of iterations increase linearly and each iteration
       costs some constant amount
     */


    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
	double phi = (1 + Math.sqrt(5)) / 2;
	double psi = (1 - Math.sqrt(5)) / 2;
	
        return Math.sqrt(0.2) * (Math.pow(phi,n) - Math.pow(psi,n));
    }
    /* Time complexity:
       Consider the size of the problem to be ... n
       
       As the proxy for the time required, count... an exponent
       
       Then cost of the the recurrence algorithm
       grows linearly
       as the size of the problem increases,
       because taking the exponent of a number takes linear time
}
