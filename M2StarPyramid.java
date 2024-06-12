package PatternPrinting.SQUARE.CompositePattern;

import java.util.Scanner;

public class M2StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        int Spaces = (n-1);
        int Stars = 1;
        for (int i =1; i <= n; i++){
            for (int j =1; j <= Spaces; j++){
                System.out.print("  ");
            }
            for (int j =1; j <=Stars; j++){
                System.out.print("* ");
            }
            Spaces -= 1;
            Stars += 2;
            System.out.println();
        }
    }
}
