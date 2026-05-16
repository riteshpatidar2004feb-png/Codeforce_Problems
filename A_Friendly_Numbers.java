import java.util.Scanner;
public class A_Friendly_Numbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int n=sc.nextInt();
            int mod=n%9,div=0;
            if(mod==0){
                div=n/9;
            }
            if(n!=9&&n!=99&&(div%10==1||n==90||mod!=0)) System.out.println(0);
            else System.out.println(10);
        }
    }
}