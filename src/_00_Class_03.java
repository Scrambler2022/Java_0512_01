import java.util.Scanner;

public class _00_Class_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 로또 프로그램
        //1.배열 생성
        int random = 0;
        int temp = 0;
        int count = 0;
        int[] myNum = new int[6];
        int[] lottoNum = new int[6];
        int[] lotto = new int[45];
        //2.로또번호 생성
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = i + 1;
        }
        //3. 번호섞기
        for (int i = 0; i < 1000; i++) {
            random = (int) (Math.random() * 45);
            temp = lotto[0];
            lotto[0] = lotto[random];
            lotto[random] = temp;
        }//for
        //4. 로또번호 입력
        for (int i=0;i<6; i++) {
            System.out.println((i+1)+"번째 로또번호를 입력하세요.");
            myNum[i] = scan.nextInt();
        }//for

        //5. 로또번호 확인
        for (int i = 0; i < 6; i++) { //lotto배열
            for (int j = 0; j < 6; j++) {
                if (lotto[i] == myNum[j]) {
                    //count 1 증가
                    lottoNum[count] = lotto[i]; //당첨번호 넣기
                    count++; //당첨개수 증가
                    continue;
                }//if
            }//이중 for 문
        }//for
        //6.로또번호 출력
        System.out.println("lotto Auto :");
        for (int i=0; i<6; i++) {
            System.out.print(lotto[i]+" ");
        }//for
        System.out.println();
        //7. 입력번호 출력
        System.out.println("로또 로또 6개의 룸룸룸! :");
        for (int i=0;i<6;i++) {
            System.out.print(myNum[i]+" ");
        }
        System.out.println();
        //8.당첨번호 출력
        System.out.print("당첨 번호 :");
        for (int i=0; i<count;i++) {
            System.out.println(lottoNum[i]+" ");
        }
        System.out.println();
        //9. 당첨개수 출력
        System.out.print("당첨번호 : "+ count);
    }//main
}//class
