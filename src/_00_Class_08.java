import java.util.Scanner;
public class _00_Class_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] title = {"국어","영어","수학","합계"};
        int [][] score = new int[5][4];
        for (int i= 0; i<score.length; i++) {
            System.out.println((i+1)+"번째 학생:");
            for (int j=0; j<3; j++) {
                System.out.println(title[j]+" 점수를 입력하세요");
                score[i][j] = scan.nextInt();}
            score[i][3] = score[i][0]+score[i][1]+score[i][2];}
        for (int i= 0; i< title.length;i++) {
            System.out.print(title[i]+"\t");}
        System.out.println();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        for (int i=0; i<score.length; i++) {
            for (int j=0; j< score[i].length; j++) {
                System.out.print(score[i][j]+"\t");
            }//for2
            System.out.println();
        }//for
    }//main
}//class
