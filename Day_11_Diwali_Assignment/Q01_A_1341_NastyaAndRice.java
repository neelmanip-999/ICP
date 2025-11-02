import java.util.*;
public class Q01_A_1341_NastyaAndRice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int l = n*(a-b);
            int r = n*(a+b);
            if(l>c+d || r<c-d){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}