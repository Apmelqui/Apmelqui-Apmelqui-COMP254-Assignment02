package com.adriano;

class Exercise2 {

  /** Returns an array a such that, for all j, a[j] equals 
   * the average of x[0], ..., x[j]. 
   * A[j] = (X[0] + X[1] + � + X[j])/(j+1)
   * 
   * ******************************************************/
  // inner loop size will be 1, 2, 3, ..., n  (based on j=0,1,2,...,n-1)
  // we know that 1+2+3+...+ n-1+n = n(n+1)/2
  // so, the running time os O(n^2)
  public static double[] prefixAverage1(double[] x) {
    int n = x.length;
    double[] a = new double[n];    // filled with zeros by default
    for (int j=0; j < n; j++) {
      double total = 0;            // begin computing x[0] + ... + x[j]
      for (int i=0; i <= j; i++)
        total += x[i];
      a[j] = total / (j+1);        // record the average
    }
    return a;
  }

  /** Returns an array a such that, for all j, a[j] equals the average of x[0], ..., x[j]. */
  // the running time is O(n)
  public static double[] prefixAverage2(double[] x) {
    int n = x.length;
    double[] a = new double[n];    // filled with zeros by default
    double total = 0;              // compute prefix sum as x[0] + x[1] + ...
    for (int j=0; j < n; j++) {
      total += x[j];               // update prefix sum to include x[j]
      a[j] = total / (j+1);        // compute average based on current sum
    }
    return a;
  }


  //Method to create a random array
  public static double[] create_random_array(int size) {
    double result[] = new double[size];
    for (int i = 0; i < size; i++) {
      result[i] = Math.random() * size;
    }
    return result;
  }

  //Method to compute time
  public static void compute_time(int size){
    System.out.println("Size: " + size);
    double data[] = create_random_array(size);

    //Getting the time in milliseconds for prefixAverage1
    long start1 = System.currentTimeMillis();
    prefixAverage1(data);
    long end1 = System.currentTimeMillis();
    System.out.println("Prefix1 time: " + (end1 - start1) + "milliseconds");

    //Getting the time in milliseconds for prefixAverage2
    long start2 = System.currentTimeMillis();
    prefixAverage2(data);
    long end2 = System.currentTimeMillis();
    System.out.println("Prefix2 time: " + (end2 - start2) + "milliseconds");
  }

  public static void main(String[] args) {
    compute_time(10);
    compute_time(100);
    compute_time(1000);
    compute_time(10000);
    compute_time(100000);
    //compute_time(1000000); takes a much longer time
    //compute_time(10000000); takes a much longer time
  }

}
