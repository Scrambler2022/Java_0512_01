import java.util.Scanner;

public class _00_Class_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] title = {" 이름","국어"," 영어"," 수학"," 합계","평균",};
        String [] name = new String[5];
        int[][] score = new int[5][4];
        double[] avg = new double[5];

        for (int i=0; i<score.length;i++) {
            System.out.println((i+1)+"번째 학생의 이름 : ");
            name[i] = scan.nextLine();
            for (int j = 0; j < 3; j++) {  // 조건 추가
                System.out.println(name[i] +"학생의 "+ title[j+1] +" 점수를 입력하세요");
                score[i][j] = scan.nextInt();
            }
            score[i][3] = score[i][0] + score[i][1] + score[i][2];
            avg[i] = score[i][3]/3.0;
            scan.nextLine();  // 버퍼 비우기
        }
        System.out.println("=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=");
        for (String t : title) {
            System.out.printf("%s\t", t);
        }
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        for (int i = 0; i< score.length; i++) {
            System.out.printf("%s\t", name[i]);
            for (int j = 0; j< score[i].length;j++) {
                System.out.printf("%d\t", score[i][j]);
            }
            System.out.printf("%.2f", avg[i]);  // 평균 출력
            System.out.println();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-");
    }
}
