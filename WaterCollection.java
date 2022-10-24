import java.io.*;
import java.util.*;

public class WaterCollection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        int n = in.nextInt();
        int index0= 0;
        int[] heights = new int[n];
        for(int i = 0; i < n; i++) {
            heights[i] = in.nextInt();
            if (heights[i] == 0) index0 = i;
        }
        
        int max1 = -1;
        int max2 = -1;
        int edge1 = 0;
        int edge2 = 0;

        for (int i = 0; i < index0; i++) {
            if (heights[i] > max1) {max1 = heights[i]; edge1 = i;}
        }

        for (int i = index0 + 1; i < n; i++) {
            if (heights[i] > max2) {max2 = heights[i]; edge2 = i;}
        }

        int edge = Math.min(max1, max2);
        int sum = 0;

        for (int i = edge1; i < edge2; i++) {
            sum += Math.max(0,edge-heights[i]);
        }

        out.println(sum);

        out.close();
        in.close();
    }
}
