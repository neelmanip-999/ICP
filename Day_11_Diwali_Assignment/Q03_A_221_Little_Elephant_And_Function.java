import java.util.*;
public class Q03_A_221_Little_Elephant_And_Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(n);
        for (int i = 1; i < n; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
}
