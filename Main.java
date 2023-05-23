// Reflection API

/*
class A{

    static {
        System.out.println("in a static block");
    }
    // Static block is used to initialize the static members of a class when the class is loaded,
    // while instance block is used to initialize the instance members of an object when the object is created.
    public A(){
        System.out.println("in a Constructor");
    }

    {
        System.out.println("in a instance block");
    }


    public static void show(){
        System.out.println("in a static show");
    }
}
*/

import java.lang.reflect.Method;

class Apple{
    private void repair(int cost){
        System.out.println("Repairing..." + cost);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
//
//        // Reflction API Use
//        Apple apple = new Apple();
//
//        Class<?> appleClass = apple.getClass();
//        Method repairMethod = appleClass.getDeclaredMethod("repair");
//        repairMethod.setAccessible(true);
//        repairMethod.invoke(apple);
//
//
        Class c = Class.forName("Apple");
        // Class<?> c = Class.forName("Apple"); // Generic Co
        Apple apple = (Apple) c.newInstance();

        Method m = c.getDeclaredMethod("repair", int.class);
        m.setAccessible(true);
        m.invoke(apple, 30);





//        Apple apple = new Apple();
//        apple.repair(); // As repair is private we cannot simply call it in main.. (Reflection API)


//        A obj = new A();
//        A.show();
//
//        Class.forName("A");
//
//        Class c = Class.forName("Product");
//
//        System.out.println(c.getName());
//        System.out.println(c.getSuperclass());
//
//        System.out.println(c.getConstructors().length);
//        System.out.println(c.getConstructors());
//
//        Constructor constructors[] = c.getConstructors();
//
//        for(Constructor constructor : constructors){
//            System.out.println(constructor.getName());
//            System.out.println(constructor.getModifiers());
//            System.out.println(constructor);
//        }
//
//        System.out.println("=============");
//        Field fields[] = c.getDeclaredFields();
//
//        for(Field field : fields){
//            System.out.println(field);
//        }

//        System.out.println("===============");
//        Method methods[] = c.getMethods();
//
//        for(Method method : methods){
//            System.out.println(method); // Getting Error
//        }




    }
}
