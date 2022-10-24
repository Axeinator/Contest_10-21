import java.io.*;
import java.util.*;

public class MoneyMoneyMoney {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        int c = in.nextInt();

        for(int i = 0; i < c; i++) {
            int n = in.nextInt();
            int thou = n / 1000;
            n -= 1000 * thou;
            int hund = n / 100;
            n -= 100 * hund;
            int fifty = n / 50;
            n -= 50 * fifty;
            int twenty = n / 20;
            n -= 20 * twenty;
            int ten = n / 10;
            n -= 10 * ten;
            int five = n / 5;
            n -= 5 * five;
            int one = n / 1;
            n -= one * 1;
            if (n != 0){
                out.println("oops");
            }
            out.println(thou + ":" + hund + ":" + fifty +":"+twenty+":"+ten+":"+five+":"+one);
        }


        
        
        out.close();
        in.close();
    }
}
