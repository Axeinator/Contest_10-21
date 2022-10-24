import java.io.*;
import java.util.*;

public class QualificationQueries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        int cases = in.nextInt();

        for (int w = 0; w < cases; w++) {
            int r = in.nextInt();
            int c = in.nextInt();
            int s = in.nextInt();
            int[][] k = new int[r][c];
            int max = 0;

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    k[i][j] = in.nextInt();
                }
            }

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (k[i][j] < s) continue;
                    for (int x = 0; x < r - i; x++) {
                        for (int y = 0; y < c - j; y++) {
                            if (k[i+x][j+y] < s) {
                                int t = (x+1)*(y+1);
                                if (max < t) { max = t; out.println(i + " " + j + " " + x + " " +y);}
                                break;
                            }
                        }
                    }
                }
            }

            out.println(max);

        }
        
        out.close();
        in.close();
    }
}