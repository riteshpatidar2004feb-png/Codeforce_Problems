package Codeforces_Problems;
import java.util.Scanner;
public class B_Powers_of_Two{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        int count=0;
        for(int i=0;i<n;i++) nums[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long sum=nums[i]+nums[j];
                if((sum > 0) && ((sum & (sum - 1)) == 0)) count++;
            }
        }
        System.out.println(count);
    }
}

// nhi hua submit