//Harvey Tseng
//CSC 229

public class CSC229Lab03_TimeComplexity {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9};
        System.out.println(getLargest(arr, arr.length));
    }


    //What is the time complexity of this function?
    public static int getLargest(int arr[], int sz){
        int iterate1 = 0;       // 1 step
        int iterate2 = 0;       // 1 step
        int largest = 0;        // 1 step
        while (iterate1 < sz - 1){
            iterate2++;         //n steps
                                                     //System.out.println(iterate1);              trace iterate1
                                                     //System.out.println(iterate2);              trace iterate2
           
            if (iterate2 == sz){ //n steps
                iterate1++;                 
                iterate2 = iterate1;
                                                      //System.out.println("Hit");         trace if block
                continue;
            }
            int product = arr[iterate1] * arr[iterate2];    //n steps
            if (product > largest)  // n steps
                largest = product;
        }
        return largest;     // 1 step

        /*
         * Consider arr = {1, 3, 5, 8, 9} and sz = 5
         * The function works by matching each element to every other element
         * Essentially like two nested for loops
         * 
         * The while loop is n steps
         * The if block inside the while loop is n steps
         * 
         * As such: n * n + 1 + 1 + 1 + 1 =  O(n^2)     Quadratic time complexity
         * 
         */

    }
}
