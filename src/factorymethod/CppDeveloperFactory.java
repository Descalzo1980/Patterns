package factorymethod;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer creatDeveloper() {
        return new CppDeveloper();
    }
}
