//Move all the negative elements to one side of the array

package array;

import java.util.Arrays;

public class OneSideNegativeElement {
    //O(nlogn)
    public static void reArrange1(int a[]){
       Arrays.sort(a);
    }

//    O(n)
    public static int [] reArrange2(int a[]) {
        int j = 0, temp = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                if (i != j) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int a[] = {-1,0,1,2,4,-3,-2};
        System.out.println(Arrays.toString(a));

//        reArrange1(a);
        int []result = reArrange2(a);
        System.out.println(Arrays.toString(result));
    }
}
