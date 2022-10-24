import java.io.*;
import java.util.*;

public class KnightPhoto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        int n = in.nextInt();
        int knights[][] = new int[n][2];

        for(int i=0; i<n; i++){
            knights[i][0] = in.nextInt();
            knights[i][1] = in.nextInt();

        }
        for(int j=0; j<n; j++){
            int h = knights[j][0];
            int w = knights[j][1];

            String res = "";
            for(int k=0; k<n; k++){
                if(knights[k][0] < h && knights[k][1]<w){
                    res = "YES";
                    break;
                } else if (knights[k][0]<w && knights[k][1] < h){
                    res = "YES";
                    break;
                }

            }
            if(res.equals("")){
                res = "NO";
            }
            out.println(res);
            
        }
        out.close();
        in.close();
    }
}
