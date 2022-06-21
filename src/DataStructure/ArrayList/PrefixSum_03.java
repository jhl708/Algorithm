package DataStructure.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//구간합 알고리즘
public class PrefixSum_03 {

    /*
    * 문제 : 수 N개가 주어졌울 때 i번째 수에서 j번째 수까지의 합을 구하는 프로그램을 작성하시오.
    * 입력 : 1번째 줄에 수의 개수 N (1<=N<=100,000), 합을 구해야 하는 횟수 M (1<=M<=100,000),
    *       2번째 줄에 N개의 수가 주어진다. 각 수는 1,000보다 작거나 같은 자연수이다.
    *       3번째 줄부터는 M개의 줄에 합을 구해야 하는 구간 i와 j가 주어진다.
    *
    * 합 배열 공식 : S[i] = S[i-1] + A[i]
    * S[i] = A[0] + A[1] + A[2] + A[i-1] + A[I] 이므로 A[0] + A[1] + A[2] + A[i-1] = S[i-1] 이다.
    * 따라서 S[i] = S[i-1] + A[i] 가 된다.
    *
    * 구간 합 공식 : S[j] - S[i-1] // i~j 까지의 구간합
    * 구하고자 하는 j 까지의 전체 합에서 i 이전까지의 합을 빼면 된다.
    * */

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        /*BufferedReader - 한줄씩 입력 받기위한 클래스
          System.in은 InputStream 타입이므로 BufferedReader의 생성자에 바로 들어갈 수 없으므로 InputStreamReader 클래스를 이용해야함.*/
        StringTokenizer stringTokenizer = new StringTokenizer((bufferedReader.readLine()));
        int suNo = Integer.parseInt(stringTokenizer.nextToken());   // 데이터의 개수 N
        int quizNo = Integer.parseInt(stringTokenizer.nextToken()); // 질의개수 M
        long[] S = new long[suNo + 1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i=1; i<=suNo; i++){    // 숫자 개수만큼 더하기
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());  // 합배열 공식 사용
        }
        for (int q=0; q<quizNo; q++){   // 질의 개수만큼 반복
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i-1]);  // 주어진 구간 i ~ j 를 사용하여 구간합 공식 사용
        }


    }

}
