import java.util.Scanner;

public class _00_Class_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] title = {"이름","국어","영어","수학","합계","평균"}; // '이름'을 추가합니다.
        String[] name = new String[5];
        int[][] score = new int[5][4];
        double[] avg = new double[5]; // 배열 크기를 명시적으로 지정합니다.
        for (int i = 0; i < score.length; i++) {
            System.out.println((i + 1) + "번째 학생의 이름:");
            name[i] = scan.next();
            for (int j = 0; j < 3; j++) {
                System.out.println(name[i] + " 학생의 " + title[j+1] + " 점수를 입력하세요");
                score[i][j] = scan.nextInt();
            }
            score[i][3] = score[i][0] + score[i][1] + score[i][2];
            avg[i] = score[i][3] / 3.0;
        }
        System.out.println("----------------------------------");
        for (String t : title) {
            System.out.printf("%-5s", t); // 폭을 조정합니다.
        }
        System.out.println("\n----------------------------------");
        for (int i = 0; i < score.length; i++) {
            System.out.printf("%-10s", name[i]); // 이름을 먼저 출력합니다.
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("%-10d", score[i][j]); // 각 점수를 출력합니다.
            }
            System.out.println();
        }
        System.out.println("----------------------------------");
    }
}