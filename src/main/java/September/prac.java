package September;

import java.util.Arrays;
import java.util.Scanner;

public class prac {
    public static void solution(int N, int K, int[] candle){
        // N no of boxes of candle
        // K no of candles Marry needs
        Arrays.sort(candle);
        int left = 0;
        int right = K-1;
        int minCandles = K;
        int min = Integer.MAX_VALUE;
        while(right < N){
            if(candle[right] - candle[left] + 1 == K){
                System.out.println(K);
                return;
            }
            minCandles = Math.min(minCandles, right-left+1);
            right++;
            if(right - left + 1 > K){
                left++;
            }
        }
        System.out.println(minCandles);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] candle = new int[N];
        for (int i = 0; i < N; i++) {
            candle[i] = sc.nextInt();
        }
        solution(N, K, candle);
    }
}
