# Telusko-Day-5
Reflection API 


## Output:
![image](https://github.com/Vyankatesh-Telusko/Telusko-Day-5/assets/134121798/d6a747a3-ef84-4a87-91ef-5bf730b105ff)

### Class<?> appleClass = apple.getClass();
This line retrieves the Class object for the apple instance by calling the getClass() method on it. The getClass() method is inherited from the Object class and returns the runtime class of the object. The Class<?> declares a variable named appleClass of type Class with a wildcard generic type (<?>), indicating that the specific type of the Class object is unknown or unspecified.



### Method repairMethod = appleClass.getDeclaredMethod("repair", int.class);
This line obtains the Method object representing the repair() method of the Apple_1 class. It uses the getDeclaredMethod() method of the Class object appleClass. The getDeclaredMethod() method takes the name of the method as the first argument ("repair" in this case) and the parameter types of the method as subsequent arguments. Here, the method has a single int parameter, so we use int.class to specify its type. The Method object is assigned to the variable repairMethod.



### repairMethod.setAccessible(true);
This line allows access to the private repair() method by calling the setAccessible(true) method on the Method object repairMethod. Since the repair() method is private, it is not accessible by default. By setting the accessibility to true, we override the access restrictions and enable invocation of the method.



### repairMethod.invoke(apple, 30);
This line invokes the repair() method on the apple instance using reflection. The invoke() method is called on the Method object repairMethod. It takes two arguments: the object on which the method should be invoked (in this case, apple) and the arguments to be passed to the method (in this case, 30). The invoke() method dynamically executes the private repair() method with the specified arguments.
