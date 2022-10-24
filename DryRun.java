import java.io.*;
import java.util.*;

public class DryRun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int s = 0;
        for(int i = 0; i < n; i++) {
            s += in.nextInt();
        }
        out.println(s);
        out.println("Akshay Kapur, Sara Shen, Patrick Shaw");
        out.println("Novice");
        out.println("Bellaire High School");
        out.println("Team 1");
        out.close();
        in.close();
    }
}
