import java.util.Scanner;

public class _00_Class_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        int count = 0;

        String[] name = new String[3];
        int [] kor = new int[3];
        int [] eng = new int[3];
        int [] math = new int[3];
        int [] total = new int[3];
        double [] avg = new double[3];

        while (true) {
            System.out.println("1.점수입력");
            System.out.println("2.점수출력");
            input = scan.nextInt();

            switch (input) {
                case 1: //성적입력
                    for (int i =count; i< name.length; i++) {
                        System.out.println("국어점수를 입력하세요");
                        kor[i] = scan.nextInt();
                        System.out.println("영어점수를 입력하세요");
                        eng[i] = scan.nextInt();
                        System.out.println("수학점수를 입력하세요");
                        math[i] = scan.nextInt();
                        //자동 계산
                        total[i] = kor[i] +eng[i] +math[i];
                        avg[i] = total[i] / 3.0;
                    }
                    break;//스위치에서 멈추고 와일문을 나와서 메인으로 돌아간다.

                case 2://성적출력
                for (int i=0; i <count; i++) {
                    System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f \n", name[i],kor[i],eng[i],math[i],total[i],avg[i]);
                    System.out.println();
                }
                    break;//스위치에서 멈추고 와일문을 나와서 메인으로 돌아간다.
            }
            System.out.println();
            System.out.println();
        }//while
    }//main
}//class
