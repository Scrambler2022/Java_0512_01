import java.util.Scanner;

public class _00_Class_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 3행 4열의 2차원 배열 선언
        int[][] score = new int[3][4];

        // 배열의 각 요소에 값을 입력
        for (int i=0; i<score.length; i++) { // 각 행에 대해서
            for (int j=0; j<score[i].length; j++) { // 각 열에 대해서
                System.out.println("2차원 점수를 입력하세요");
                score[i][j] = scan.nextInt();
            }
        }

        // 배열의 각 요소를 출력
        for (int i=0; i<score.length; i++) { // 각 행에 대해서
            for (int j=0; j<score[i].length; j++) {
                System.out.print(score[i][j]+" ");
            }
            System.out.println();
        }
    }
}
