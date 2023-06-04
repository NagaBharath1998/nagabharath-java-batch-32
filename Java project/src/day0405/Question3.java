package day0405;

class Question3 {
    private static int staticVariable;

    static {
        staticVariable = initializeStaticVariable();
    }

    public static int initializeStaticVariable() {
        // Perform some calculations or logic here
        return 42;
    }

    public static int getStaticVariable() {
        return staticVariable;
    }
}