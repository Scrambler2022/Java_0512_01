import java.util.Scanner;

public class _00_Class_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int[][][][][] input = new int[0][1][2][3][4];
        int[] num = new int[4];
        //int num =0;
        //
        String[] data = {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001"};
        //1. 숫자입력
        for (int i = 0; i <5; i++) {
            System.out.println("10진수를 입력하세요");
            num[i] = scan.nextInt();
            //num[i] = scan.nextInt();
            //2진코드 출력
        }
        for (int i=0; i<5; i++) {
            System.out.println(data[num[i]]+" ");
        }
    }//main
}//class
