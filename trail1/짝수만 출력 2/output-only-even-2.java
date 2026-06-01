import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        while(A>=B){
            if(A%2==0){
                System.out.print(A+" ");
            }
            A--;
        }
    }
}