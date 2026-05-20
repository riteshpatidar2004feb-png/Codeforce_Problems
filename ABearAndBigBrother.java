
    import java.util.Scanner ;
    public class ABearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 0;
        while(true){
            if(a > b) {
                System.out.println(i);
                break;
            }
            else{
                a = a*3;
                b = b*2;
            }
            i++;
        }
    }
}

