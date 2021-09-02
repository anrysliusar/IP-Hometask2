package task2;

import java.lang.reflect.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        ExampleClass<Integer> exampleObj = new ExampleClass<>();
        var clazz = exampleObj.getClass();

//      Use the Reflection API to get information (Class, method, parameter, ....)
        System.out.println("\nMethods");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("\n" + method.getName());
            System.out.println(Modifier.toString(method.getModifiers()));
            for (Parameter parameter : method.getParameters()) {
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());

            }

        }


        System.out.println("\nConstructors");
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("\n" + constructor.getName());
            for (Parameter parameter : constructor.getParameters()) {
                System.out.println(parameter.getName());
                System.out.println(parameter.getType());
            }
        }

        //Access and change the value of a private field.
        System.out.println("\nFields");

        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.getType().getName().equals("java.lang.String")) {
                field.setAccessible(true);
                System.out.println("Before: " + field.get(exampleObj));
                field.set(exampleObj, "Test value");
                System.out.println("After: " + field.get(exampleObj));
            }
        }
    }
}
