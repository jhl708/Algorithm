package DataStructure.ArrayList;

import java.util.Scanner;

/*숫자의 합 구하기*/
public class SumNumber_01 {

    /* 문제 : N개의 숫자가 공백 없이 써있다. 이 숫자를 모두 합해 출력하는 프로그램을 작성하시오.
     * 입력 : 1번째 줄에 숫자의 개수 N(1<=N<=100), 2번째 줄에 숫자 N개가 공백 없이 주어진다.
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();

        char[] cNum = sNum.toCharArray();   //String 형으로 입력받은 값을 char[]형으로 형변환
        int sum = 0;
        for(int i=0; i<N; i++){
            sum += cNum[i] - '0';   // 중요! : sNum[i]를 정수형으로 변환하면서 sum에 더하여 누적하기
            System.out.println(cNum[i]);
        }
        System.out.println(sum);

    }
}
