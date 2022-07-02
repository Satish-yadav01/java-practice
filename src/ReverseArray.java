public class ReverseArray {
    public static void reverseArray(int a[]){
        int start = a[0];
        int end = a.length-1;
        for (int i = 0; i < (a.length-1)/2; i++) {
            int temp = a[i];
            a[i] = a[end];
            a[end] = temp;
            end--;

        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        reverseArray(a);
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
