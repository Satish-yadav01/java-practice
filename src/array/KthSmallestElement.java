//O(nlogn)

package array;

import java.util.Arrays;

public class KthSmallestElement {
    public static int minimumElement(int a[],int k){
        Arrays.sort(a);  //O(nlogn)
        return a[k-1];
    }
    public static void main(String[] args) {
        int a[] = {10,11,12,14,16,40,32};
        int k =3;
        int min = minimumElement(a,k);
        System.out.println("Minimum element :"+ min);
    }
}
