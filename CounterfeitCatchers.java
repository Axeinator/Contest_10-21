import java.io.*;
import java.util.*;

public class CounterfeitCatchers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        
        for (int i = 0; i < n; i++) {

            int c = in.nextInt();
            int l = in.nextInt();
            in.nextLine();
            String c1 = "";
            String c2 = "";
            int count1 = 1;
            int count2 = 0;
            int c1index = 0;
            int c2index = -1;

            String temp = "";
            for (int k = 0; k < l; k++) {
                temp += in.nextLine();
            }
            c1 = temp;

            for (int j = 1; j < c; j++) {
                String temp2 = "";
                for (int k2 = 0; k2 < l; k2++) {
                    temp2 += in.nextLine();
                }
                if (temp2.equals(c1)) {count1++;}
                else if (c2 == "") {c2 = temp2; count2++; c2index = j;}
                else count2++;
            }

            out.print("Sir, coin ");
            if (count1 == 1) {out.print(c1index + 1);}
            else if (count2 == 1) {out.print(c2index + 1);} 
            out.println(" is a counterfeit!");
        }
        
        

        
        
        out.close();
        in.close();
    }
}