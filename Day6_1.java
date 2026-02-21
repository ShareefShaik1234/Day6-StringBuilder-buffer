import java.util.Scanner;

public class Day6_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String base=sc.nextLine();
        String target=sc.nextLine();
        String replace=sc.nextLine();

        StringBuilder sb=new StringBuilder(base);

        int index=sb.indexOf(target);


        while(index!=-1){
            sb.replace(index, index+target.length(), replace);
            index=sb.indexOf(target);
        }
        System.out.println(sb);
    }
    
}
