import java.util.Scanner;
public class B_Cutie_Cutie_Cutie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1) {
            System.out.println(1);
            return;
        }
        int[] freq=new int[n+1];
        for(int i=1;i<n;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            freq[u]++;freq[v]++;
        }
        int count=0;
        if(freq[1]<2) count=1;
        else count=0;
        for(int i=1;i<=n;i++){
            if(freq[i]>=2) count++;
        }
        System.out.println(count);
    }
}
