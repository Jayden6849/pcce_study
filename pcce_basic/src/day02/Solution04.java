package day02;

import java.util.Scanner;

public class Solution04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2 == 0)
            System.out.print(n + " is even");
        else
            System.out.print(n + " is odd");
    }

}
