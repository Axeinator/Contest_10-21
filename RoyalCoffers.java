import java.io.*;
import java.util.*;

public class RoyalCoffers {
    static int coinsAtTime(int time, int startTime, int takesTime, int carries) {
        return ((time - startTime) / takesTime) * carries;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        int m = in.nextInt();
        long c = in.nextLong();

        int[] startTimes = new int[m];
        int[] carries = new int[m];
        int[] takesTime = new int[m];

        for(int i = 0; i < m; i++) {
            startTimes[i] = in.nextInt();
            carries[i] = in.nextInt();
            takesTime[i] = in.nextInt();
        }

        int time = 1;
        long sum = 0;
        while (sum < c) {
            sum = 0;
            for(int i = 0; i < m; i++) {
                sum += coinsAtTime(time, startTimes[i], takesTime[i], carries[i]);
            }
            time++;
        }
        out.println(time-1);

        
        out.close();
        in.close();
    }
}
