package task1;

public class Main {

    public static void main(String[] args) {
        SingletonEnumImpl singleton = SingletonEnumImpl.INSTANCE;

        System.out.println(singleton.getMessage());
        singleton.setMessage("Hello World");
        System.out.println(singleton.getMessage());
    }
}
