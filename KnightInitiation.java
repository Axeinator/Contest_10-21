import java.io.*;
import java.util.*;

public class KnightInitiation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        int t = in.nextInt();



        for(int ij = 0; ij < t; ij++) {
            int n = in.nextInt();
            int x = in.nextInt();
            ArrayList<Integer> knights = new ArrayList<Integer>();
            ArrayList<Integer> friend = new ArrayList<Integer>();
            for(int i = 0; i < n; i++){ 
                knights.add(in.nextInt());
            }
    
            for(int i = 0; i < n; i++){ 
                friend.add(in.nextInt());
            }
    
            int sum = 0;
            for(int i = 0; i < friend.size(); i++) {
                if(friend.get(i) == 0)  {
                    sum += knights.get(i);
                    knights.remove(i);
                    friend.remove(i);
                    i--;
                }
            }
            int[] knightsArr = new int[knights.size()];
            for(int i = 0; i < knights.size(); i++) {
                knightsArr[i] = knights.get(i);
            }
    
            Arrays.sort(knightsArr);
            int friendCnt = 0;
            int i = knightsArr.length - 1;
            while(sum < x) {
                sum += knightsArr[i];
                i--;
                friendCnt++;
            }
            
            out.println(friendCnt);
        }


        out.close();
        in.close();
    }
}
