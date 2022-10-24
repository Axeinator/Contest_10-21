import java.io.*;
import java.util.*;

public class JestersJokes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        int n = in.nextInt();
        ArrayList<String> people = new ArrayList<String>();
        in.nextLine();
        for(int i = 0; i < n; i++) {
            String name = in.nextLine();
            System.out.println(name);
            String temp = in.nextLine();
            String joke = "";
            while(temp != "\n") {
                System.out.println("Joke: " + joke);
                joke = joke + " " + in.nextLine();
            }
            if (joke.toLowerCase().contains("stroud")) {
                if (!people.contains(name)) {
                    people.add(name.substring(0, name.length()-1));
                }
            }
        }
        for(String person : people) {
            if (!person.equals("Jester")) {
                out.println(person);
            }
        }

        out.close();
        in.close();
    }
}