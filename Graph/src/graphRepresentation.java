import java.util.Scanner;

/*
* Here we are printing the graph using the Matrix
* */

public class graphRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();
        int edges = sc.nextInt();
        int[][] mat = new int[nodes+1][nodes+1];
        for(int i=0;i<edges;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            mat[start][end] = 1;
            mat[end][start] = 1;
        }
        for (int[] ints : mat) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
