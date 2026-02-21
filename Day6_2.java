public class Day6_2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(10);
        System.out.println("Initial capacity:"+sb.capacity());
                System.out.println("Initial length:"+sb.length());

                sb.append("Helloworld");

                System.out.println("After adding 10 characters:");
                  System.out.println("capacity:"+sb.capacity());
  System.out.println("length:"+sb.length());
sb.append("java");
System.out.println("capacity:"+sb.capacity());
  System.out.println("length:"+sb.length());
    }
}
//Rule:
//new capacity=(old capacity*2)+2