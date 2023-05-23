import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        // Obtain the Class object for a given class
        Class<?> stringClass = String.class;

        // Print class name, package name, and superclass name
        System.out.println("Class Name: " + stringClass.getName());
        System.out.println("Package Name: " + stringClass.getPackage().getName());
        System.out.println("Superclass Name: " + stringClass.getSuperclass().getName());

        // Print all declared methods of the class
        Method[] methods = stringClass.getDeclaredMethods();
        System.out.println("Declared Methods:");
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        // Print all implemented interfaces of the class
        Class<?>[] interfaces = stringClass.getInterfaces();
        System.out.println("Implemented Interfaces:");
        for (Class<?> interfaceClass : interfaces) {
            System.out.println(interfaceClass.getName());
        }
    }
}
