import java.util.Scanner;

public class _00_Class_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] title = {"국어","영어","수학"}; // 과목명
        int[][] score = new int[5][3]; // 5명의 학생 3과목
        // 각 학생들 각 과목 점수 입력
        for (int i = 0; i < score.length; i++) {
            System.out.println((i+1) + "번째 학생:");
            for (int j = 0; j < score[i].length; j++) {
                System.out.println(title[j] + " 점수를 입력하세요.");
                score[i][j] = scan.nextInt();
            }
        }
        // 각 학생들의 과목 점수 출력
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + "\t");
            }
            System.out.println();
        }
    }//main
}//class
