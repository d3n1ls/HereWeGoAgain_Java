package Exam.More;

import java.util.Scanner;

public class Hashtag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int width = 4 * n + 1;
        int height = 2 * n + 1;
        int hashtag = 2*n-1;
        int spaces = 1;
        int dotsBottomPart = n+1;
        int hashtagBottomPart = 2*n-1;

        System.out.println(repeatString("#",width));

        for (int i = 1; i <= n; i++) {
            if (i == n/2+1){
                System.out.println(repeatString(".",i)+repeatString("#",hashtag)
                        +repeatString(" ",n/2-1)+"(@)"+repeatString(" ",n/2-1)
                        +repeatString("#",hashtag)+repeatString(".",i));
                hashtag-=2;
                spaces+=2;
            } else {
                System.out.println(repeatString(".", i) + repeatString("#", hashtag) + repeatString(" ", spaces)
                        + repeatString("#", hashtag) + repeatString(".", i));
                hashtag -= 2;
                spaces += 2;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(repeatString(".",dotsBottomPart)+repeatString("#",hashtagBottomPart)
                    +repeatString(".", dotsBottomPart));
            dotsBottomPart++;
            hashtagBottomPart-=2;
        }
    }

    public static String repeatString(String text, int repeatCount) {
        String result = "";
        for (int i = 0; i < repeatCount; i++) {
            result += text;
        }
        return result;
    }
}
