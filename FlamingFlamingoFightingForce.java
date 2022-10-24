import java.io.*;
import java.util.*;

public class FlamingFlamingoFightingForce {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        int c = in.nextInt();

        for(int i=0; i<c; i++){
            int M = in.nextInt();
            int L = in.nextInt();
            int K = in.nextInt();
            int wet = 0;
            for(int j=0; j<M; j++){
                int n = in.nextInt();
                if(n>L){
                    wet++;
                }
            }
            if(wet>K){
                out.println("No");
            } else {out.println("Yes");}
        }
        
        out.close();
        in.close();
    }
}