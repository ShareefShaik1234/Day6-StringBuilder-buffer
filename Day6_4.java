import java.util.Scanner;

public class Day6_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.nextLine();


        StringBuilder sb=new StringBuilder();

        for(int i=0;i<n;i++){
            String str=sc.nextLine();
            sb.append(str);

            if(i<n-1){
                sb.append(",");
            }
        }

        System.out.println(sb.toString());
    }
    
}
