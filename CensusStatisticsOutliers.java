import java.io.*;
import java.util.*;

public class CensusStatisticsOutliers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        int c = in.nextInt();
        for(int j=0; j<c; j++) {
            int n = in.nextInt();
            int Q1 = in.nextInt();
            int Q3 = in.nextInt();
            int iqr = Q3-Q1;
            String p = "";
            for(int i=0; i<n;  i++){
                int n2 = in.nextInt();
                if(n2 < (Q1-1.5*iqr) || n2 > (Q3+1.5*iqr)){
                    p += n2 + " ";
                }
            }
            if (p.length() == 0) p = "-1";
            out.println(p);
        }
        out.close();
        in.close();
    }
}