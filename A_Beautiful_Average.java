import java.util.Scanner;
public class A_Beautiful_Average{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int a=1;a<=t;a++){
        int n=sc.nextInt(),maxave=0;
        int[] nums=new int[n];
        for(int b=0;b<n;b++) nums[b]=sc.nextInt();
        int i=0,j=0;
        while(i<n){
            int sum=0;
            for(int k=i;k<=j;k++) sum+=nums[k];
            int avg=sum/(j-i+1);
            if(avg>maxave) maxave=avg;
            j++;
            if(j>=(n-1)) {
                i++;
                j=i;
            }
        }
        System.out.println(maxave);
    }
}
} 