import java.util.Scanner;
public class A_Square{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int[] nums=new int[4];
            for(int j=0;j<4;j++){
                nums[j]=sc.nextInt();
            }
            if(nums[0]!=nums[1]||nums[0]!=nums[2]||nums[0]!=nums[3]){
                System.out.println("NO");
            }
            else System.out.println("YES");
        }
    }
} 
    

