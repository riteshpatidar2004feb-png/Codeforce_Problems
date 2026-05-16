import java.util.Scanner;
public class ASieveOfErato67Henes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int n=sc.nextInt();
            int sixseven=0;
            int[] nums=new int[n];
            for(int j=0;j<n;j++){
                nums[j]=sc.nextInt();
                if(nums[j]==67) sixseven=1;
            }
            if(sixseven==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
