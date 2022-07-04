//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
package array;

public class ArrayElement {
    public static void main(String[] args) {
        int a[] = {0,1,1,2,1,2,0,0,1,2};
        int zero = 0,one = 0,two = 0;

        for (int i = 0; i < a.length-1; i++) {
            if(a[i] == 0) {zero++;}
            else if(a[i] == 1) { one++;}
            else{
                two++;
            }
        }

        for(int i = 0; i<a.length; i++){
            if(zero!=0){
                a[i]=0;
                zero--;
            }
            else if(one!=0){
                a[i]=1;
                one--;
            }
            else{
                a[i]=2;
            }
        }

        ReverseArray.printArray(a);
    }
}
