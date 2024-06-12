package PatternPrinting.SQUARE.CompositePattern;

import java.util.Scanner;

public class CompositeEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++){
            for (int j = 1; j <= n-i; j++){     //For Spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++){      //For Number
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
