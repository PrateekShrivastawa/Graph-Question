import java.util.ArrayList;
import java.util.Scanner;

public class secondgraph{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt();
        int edge = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i <= node; i++) {
            arr.add(new ArrayList<>());
        }
        for (int i = 0; i < edge; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr.get(start).add(end);
            arr.get(end).add(start);
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(i+" ");
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}