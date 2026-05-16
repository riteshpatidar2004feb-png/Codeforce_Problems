
    import java.util.Scanner ;
    public class ABeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();n++;
        while(true){
            int n1 = n;
            int o = n1%10;
            n1/=10;
            int t = n1%10;
            n1/=10;
            int h = n1%10;
            n1/=10;
            int th = n1%10;
            if(o != t && o != h && o != th && t != h && t != th && h != th) {
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}

