import java.util.Scanner;

public class _00_Class_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int[] num = new int[3];
//        for (int i=0; i< num.length;i++) {
//            System.out.println("점수를 입력하세요");
//            num[i] = scan.nextInt();
//        }//for
        int[][] score = new int[3][4];
        //
        for (int i= 0; i<score.length;i++) {
            for (int j=0; j< score[i].length; j++) {
                System.out.println("2차원 점수를 입력하세요");
                score[i][j] = scan.nextInt();
            }
        }
        //출력
        for (int i=0;i< score.length;i++) {
            for (int j=0;i< score.length;j++)
            System.out.println(score[i][j]+" ");
        }
        System.out.println();
    }//main
}