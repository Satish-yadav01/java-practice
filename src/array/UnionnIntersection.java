//Find the Union and Intersection of the two sorted arrays.
package array;

import java.util.Arrays;

public class UnionnIntersection {

    public static int[] findUnion(int []a, int []b){
        int union[] = new int[a.length + b.length];
        System.arraycopy(a,0,union,0,a.length);
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(b[i] != a[j]){
                    union[a.length + i] = b[i];
                }
            }

        }
        return union;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int b[] = {4,5,6,7,8};

        int union[] = findUnion(a,b);
        System.out.println(Arrays.toString(union));
    }
}
