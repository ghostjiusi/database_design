
public class Main {
    public static void main(String[] args) {
        String a = "00000001";
        int b=Integer.valueOf(a).intValue();
        System.out.println(b);
        b++;
        String s=String.format("%08d",b);
        System.out.println(s);
    }
}