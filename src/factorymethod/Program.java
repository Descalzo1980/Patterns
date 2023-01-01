package factorymethod;

public class Program {
    public static void main(String[] args) {
        Developer developer = new JavaDeveloper();
        developer.writeCode();
        Developer developer1 = new CppDeveloper();
        developer1.writeCode();

        /*и это тоже не слишком гибко*/
    }
}
