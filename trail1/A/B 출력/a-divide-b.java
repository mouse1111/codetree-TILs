import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.print(A/B);
        System.out.print(".");

        int r = A % B;

        for(int i=0; i<20; i++){
            r *= 10;
            System.out.print(r / B);
            r%=B;
        }
    }
}