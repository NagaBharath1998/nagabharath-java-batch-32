package june5;

public class Number {
    public static void main (String[] arg){
        int n=123456;
        int rev=0;
        while(n!=0){
            int remainder=n%10;
            rev=rev*10+remainder;
            n=n/10;
        }
        System.out.println(rev);
    }
}