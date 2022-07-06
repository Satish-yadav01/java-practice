package revision.array;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverseArray1(int []a){
        int end = a.length-1;
        int temp=0;
        for (int i = 0; i < (a.length-1)/2; i++) {
            temp = a[i];
            a[i] = a[end];
            a[end] = temp;
            end--;
        }
        return a;
    }

    public static int [] reverseArray2(int []a,int start,int end){
        int temp;
        if(start >=end){
            return a;
        }
        temp = a[start];
        a[start] = a[end];
        a[end] = temp;
        return reverseArray2(a,start+1,end-1);
    }

    public static void main(String[] args) {
        int []a = {-2,-3,-4,0,1,2,3,4};
        System.out.println(Arrays.toString(a));

//        int result[] = reverseArray1(a);
        int result[] = reverseArray2(a,0,a.length-1);
        System.out.println(Arrays.toString(result));
    }
}
