package june5;

public class Age {
    public static void age(int age){
        if(age < 13){
            System.out.println("Kid");
        }else if(age > 19){
            System.out.println("Adult");
        } else if (age > 13 && age <19) {
            System.out.println("Teen");
            
        }

    }
    public static void main(String[] arg){
        int age = 25;
        age(age);
    }
}
