import java.util.Scanner;
import java.util.Arrays;
public class A_Be_Positive{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int a=1;a<=t;a++){
            int n=sc.nextInt();
            int[] nums=new int[n];
            for(int b=0;b<n;b++) nums[b]=sc.nextInt();
            Arrays.sort(nums);
            int count=0,count1=0;
            for(int i=0;i<n;i++){
                if(nums[i]==0){
                    nums[i]++;
                    count++;
                }
                if(nums[i]==-1) count1++;
            }
            if(count1%2!=0){
                nums[0]=nums[0]+2;
                count=count+2;
            }
            System.out.println(count);
        }
    }
}