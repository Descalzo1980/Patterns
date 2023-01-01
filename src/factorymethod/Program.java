package factorymethod;

public class Program {
    public static void main(String[] args) {
        JavaDeveloper javadeveloper = new JavaDeveloper();
        javadeveloper.writeJavaCode();
        CppDeveloper cppDeveloper = new CppDeveloper();
        cppDeveloper.writeCppCode();

        /*так себе метод*/
    }
}
