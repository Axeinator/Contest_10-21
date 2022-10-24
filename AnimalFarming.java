import java.io.*;
import java.util.*;

public class AnimalFarming {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            int s1 = in.nextInt();
            int s2 = in.nextInt();
            int s3 = in.nextInt();
            int s4 = in.nextInt();

            if (s1 == s2 && s1 == s3 && s1 == s4){
                out.println("sheep");
            }
            else if(s1==s3 && s2==s4){
                out.println("cattle");
            } else{
                out.println("pigs");
            }
        }
        
        out.close();
        in.close();
    }
}