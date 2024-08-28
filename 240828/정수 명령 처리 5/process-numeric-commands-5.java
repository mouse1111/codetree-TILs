import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ArrayList<Integer> arr = new ArrayList<>();
       int N = sc.nextInt();

       for(int i = 0; i < N; i++){
            String s = sc.next();

            if(s.equals("push_back")){
                int num = sc.nextInt();
                arr.add(num);
            }
            else if(s.equals("pop_back")){
                if (!arr.isEmpty()) {  
                    arr.remove(arr.size() - 1);
                }
            }
            else if(s.equals("size")){
                System.out.println(arr.size());
            }
            else if(s.equals("get")){
                int k = sc.nextInt();
                if (k >= 1 && k <= arr.size()) {
                    System.out.println(arr.get(k - 1)); 
                }
            }
       }
       sc.close();
    }
}