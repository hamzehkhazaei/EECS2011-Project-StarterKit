package eecs2011.project;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // number of functions
        int[][] workflow = new int[n + 2][n + 2]; // workflow graph
        int[] rt = new int[n]; // response time of functions
        for (int i = 0; i < n + 2; i++) {
            for (int j = 0; j < n + 2; j++)
                workflow[i][j] = input.nextInt(); // read workflow graph from standard input
        }
        for (int i = 0; i < n; i++) {
            rt[i] = input.nextInt(); // read response time from standard input
        }
        input.close();
        ; //do something
        System.out.println("1 0\n4 124\n2 295\n3 444\n510"); // write my answer to standard output
    }
}
