//Harvey Tseng
//CSC 229

public class CSC229Lab03_TimeComplexity {
    public static void main(String[] args) {
        
    }


    //What is the time complexity of this function?
    public static int getLargest(int arr[], int sz){
        int iterate1 = 0;
        int iterate2 = 0;
        int largest = 0;
        while (iterate < sz - 1){
            iterate2++;
            if (iterate2 == sz){
                iterate1++;
                iterate2 = iterate1;
                continue;
            }
            int product = arr[iterate1] * arr[iterate2];
            if (product > largest)
                largest = product;
        }
        return largest;
    }
}
