package factorymethod;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("Java");
        Developer developer = developerFactory.creatDeveloper();
        developer.writeCode();

        DeveloperFactory developerFactory1 = createDeveloperBySpeciality("php");
        Developer developer1 = developerFactory1.creatDeveloper();
        developer1.writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciality(String speciality){
        if(speciality.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        }else if ((speciality.equalsIgnoreCase("cpp"))){
            return new CppDeveloperFactory();
        }else {
            throw new RuntimeException(speciality + " is unknown speciality");
        }
    }
}
