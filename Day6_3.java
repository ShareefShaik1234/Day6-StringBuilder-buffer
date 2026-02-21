import java.util.Scanner;

public class Day6_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();//madam

        StringBuilder sb=new StringBuilder(str);
             //madam.equals("madam")->True
        if(sb.toString().equals(sb.reverse().toString()))
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    
}
