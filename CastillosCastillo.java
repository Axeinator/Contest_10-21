import java.io.*;
import java.util.*;


public class CastillosCastillo {
    static double getAngle(Point a, Point b) {
        if (a.equals(b)) return 2 * Math.PI;
        else return Math.atan2(b.y - a.y, b.x - a.x);
    }
    static double getDist(Point a, Point b) {
        return  Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        int cases = in.nextInt();
        for(int zz = 0; zz < cases; zz++) {
            int n = in.nextInt();
            ArrayList<Point> points = new ArrayList<Point>();
            for(int p = 0; p < n; p++) {
                points.add(new Point(in.nextInt(), in.nextInt()));
            }
          
            Point start = points.get(0);
            for(Point p : points) {
                if (p.y < start.y) {
                    start = p;
                }
            }
            points.remove(start);
            out.println(start);
            // find point with min angle from this one;
            Point current = start;
            Point next = points.get(0);
            out.println(points);
            int i = 1;
            ArrayList<Point> order = new ArrayList<Point>();
            order.add(start);
            while (i < 7) {
                for(Point p : points) {
                    double currentAngle = getAngle(current, next);
                    out.println(currentAngle);
                    double checkAngle = getAngle(current, p);
                    double currentDist = getDist(current, next);
                    double checkDist = getDist(current, p);
                    out.println(p + " " + checkAngle);
                    if(checkAngle < currentAngle) {
                        next = p;
                    }
                    else if(checkAngle == currentAngle && checkDist > currentDist) {
                        next = p;
                    }
                }
                order.add(next);
                points.remove(next);
                i++;
                current = next;
                next = points.get(0);
                
            }

            out.close();
            in.close();

        }

        

}
    }

class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return x + " " + y;
    }
    
    public boolean equals(Point b) {
        return this.x == b.x && this.y == b.y;
    }
}

