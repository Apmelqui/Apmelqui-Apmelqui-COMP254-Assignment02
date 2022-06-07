package com.adriano;
class Exercise1 {

	//running time is O(n)
  /** Returns the sum of the integers in given array. */
  public static int example1(int[] arr) {
    int n = arr.length, total = 0;  // O(1) - 3 operations - (assigning 2 variables and calculating the length of the array)
    for (int j=0; j < n; j++)       // O(n) - 1 + 2n - (assigning 1 variable, n times checking j < n and n times increasing j)
      total += arr[j];              // O(1) - (1 operation to assigning the variable)
    return total;                   // O(1) - (1 operation returning the value)
  }                                 // 2n + 6 - Final result: O(n)
  //PS. For all the following codes, we pick the biggest notation. Since O(n) is bigger than O(1), the notation is O(n);

  /** Returns the sum of the integers with even index in given array. */
  public static int example2(int[] arr) {
    int n = arr.length, total = 0;   // O(1)
    for (int j=0; j < n; j += 2)     // O(n)/2        ps.note the increment of 2
      total += arr[j];               // O(1)
    return total;                    // O(1)
  }                                  // Final result: O(n)

  /** Returns the sum of the prefix sums of given array. */
  public static int example3(int[] arr) {
    int n = arr.length, total = 0;  // O(1)
    for (int j=0; j < n; j++)       // O(n)              ps.loop from 0 to n-1
      for (int k=0; k <= j; k++)    // O(n)              ps. loop from 0 to j
        total += arr[j];            // O(1)
    return total;                   // O(1)
  }                                 // Final result: O(n^2)

  /** Returns the sum of the prefix sums of given array. */
  public static int example4(int[] arr) {
    int n = arr.length, prefix = 0, total = 0;     // O(1)
    for (int j=0; j < n; j++) {                    // O(n)              // loop from 0 to n-1
      prefix += arr[j];                            // O(1)
      total += prefix;                             // O(1)
    }
    return total;                                  // O(1)
  }                                                // Final result: O(n)

  /** Returns the number of times second array stores sum of prefix sums from first. */
  public static int example5(int[] first, int[] second) { // assume equal-length arrays
    int n = first.length, count = 0;       // O(1)
    for (int i=0; i < n; i++) {            // O(n)                           // loop from 0 to n-1
      int total = 0;                       // O(1)
      for (int j=0; j < n; j++)            // O(n)                           // loop from 0 to n-1
        for (int k=0; k <= j; k++)         // O(n)                           // loop from 0 to j
          total += first[k];               // O(1)
      if (second[i] == total) count++;     // O(1)
    }
    return count;                          // O(1)
  }                                        // Final result: O(n^3)

}
