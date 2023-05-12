import java.util.Arrays;
import java.util.Collections;

public class _00_Class_10 {
    public static void main(String[] args) {
        int[] arr = {1,11,23,45,2,3,9,5};
        //Arrays.sort(arr); //오름차순정렬
        Arrays.sort(arr);
        //단순for문
        int num =10;
        for (int i:arr) {
            System.out.println(i+" ");
        }//for
//        for (int i =0; i<arr.length;i++) {
//            System.out.println(arr[i]+" ");
//        }//d
    }//main
}//Class
