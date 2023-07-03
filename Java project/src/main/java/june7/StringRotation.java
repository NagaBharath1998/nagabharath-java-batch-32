package june7;

public class StringRotation {
    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }

    public static void main(String[] args) {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";

        if (isRotation(str1, str2)) {
            System.out.println(str2 + " is a rotation of " + str1);
        } else {
            System.out.println(str2 + " is not a rotation of " + str1);
        }
    }
}
