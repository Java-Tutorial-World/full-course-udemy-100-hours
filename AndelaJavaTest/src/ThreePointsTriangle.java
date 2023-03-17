import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;


//public class ThreePointsTriangle {
//}





public class ThreePointsTriangle {

    static void checkForTriangle(int pointx1, int pointy1, int pointx2, int pointy2, int pointx3, int pointy3){

        int area =( pointx1 * (pointy2 - pointy3)) + (pointx2 * (pointy3 - pointy1)) +	(pointx3 * (pointy1 - pointy2));

        if (area == 0)
        System.out.println("No");
        else
        System.out.println("Yes");
    }

    public static void main(String[] args){
        int pointx1 = 1, pointy1 = 1, pointx2 = 2, pointy2 = 2,
        pointx3 = 3, pointy3 = 3;
        checkForTriangle(pointx1, pointy1, pointx2, pointy2, pointx3, pointy3);
    }
}

//To check if a string forms palindrome

class palindromeStringCheck {
    public static boolean isPalindrome(String str){

        String reversesWord = "";

        boolean result = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            reversesWord = reversesWord + str.charAt(i);
        }

        if (str.equals(reversesWord)) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args)
    {
        // Input string
        String str = "wow";

        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        System.out.println(A);
    }
}


//Last test
class Point {
    public int x;
    public int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static float findDistance(Point p1, Point p2) {
        return (float) Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) +
                (p1.y - p2.y) * (p1.y - p2.y)
        );
    }

    public static float stripClosest(Point[] strip, int size, float d) {
        float min = d; // Initialize the minimum distance as d

        Arrays.sort(strip, 0, size, new PointYDifference());

        for (int i = 0; i < size; ++i) {
            for (int j = i + 1; j < size && (strip[j].y - strip[i].y) < min; ++j) {
                if (findDistance(strip[i], strip[j]) < min) {
                    min = findDistance(strip[i], strip[j]);
                }
            }
        }
        return min;
    }

    public static float closestUtil(Point[] P, int startIndex, int endIndex) {

        if ((endIndex - startIndex) <= 3) {
            return bruteForce(P, endIndex);
        }

        int mid = startIndex + (endIndex - startIndex) / 2;
        Point midPoint = P[mid];

        float dl = closestUtil(P, startIndex, mid);
        float dr = closestUtil(P, mid, endIndex);

        float d = Math.min(dl, dr);

        Point[] strip = new Point[endIndex];
        int j = 0;
        for (int i = 0; i < endIndex; i++) {
            if (Math.abs(P[i].x - midPoint.x) < d) {
                strip[j] = P[i];
                j++;
            }
        }
        return Math.min(d, stripClosest(strip, j, d));
    }

    public static float bruteForce(Point[] P, int n) {
        float min = Float.MAX_VALUE;
        float currMin = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                currMin = findDistance(P[i], P[j]);
                if (currMin < min) {
                    min = currMin;
                }
            }
        }
        return min;
    }

    public static float closest(Point[] P, int n) {
        Arrays.sort(P, 0, n, new PointXDifference());
        return closestUtil(P, 0, n);
    }

}

class PointXDifference implements Comparator<Point> {
    @Override
    public int compare(Point pointA, Point pointB) {
        return Integer.compare(pointA.x, pointB.x);
    }

}

class PointYDifference implements Comparator<Point> {

    @Override
    public int compare(Point pointA, Point pointB) {
        return Integer.compare(pointA.y, pointB.y);
    }

}

class ClosestPoint {

    // Driver code
    public static void main(String[] args) {
        Point[] P = new Point[]{
                new Point(2, 3),
                new Point(12, 30),
                new Point(40, 50),
                new Point(5, 1),
                new Point(12, 10),
                new Point(3, 4)
        };

        DecimalFormat df = new DecimalFormat("#.######");
        System.out.println("The smallest distance is " +
                df.format(Point.closest(P, P.length)));
    }

}


