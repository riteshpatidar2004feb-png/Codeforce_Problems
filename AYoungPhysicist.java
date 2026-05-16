import java.util.Scanner;
public class AYoungPhysicist{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        int[] sum = new int[3] ;
        for(int i = 1; i <= n; i++){
            sum[0] = sum[0] + sc.nextInt();
            sum[1] = sum[1] + sc.nextInt();
            sum[2] = sum[2] + sc.nextInt();
        }
        if(sum[0] == 0 && sum[1] == 0 && sum[2] == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}