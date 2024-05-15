//package Especial;
//
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
//
////Reflection
//public class Cat {
//    private String name;
//    private int age;
//
//    public Cat(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//    public String getName(){
//        return name;
//    }
//    public int getAge(){
//        return age;
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//    public void setAge(int age){
//        this.age = age;
//    }
//
//    public void Meow(){
//        System.out.println("MEOWWWW");
//    }
//}
//class Reflection {
//    public static void main(String[] args) {
//        Cat loki = new Cat("Loki", 2);
//        Field[] catFields = loki.getClass().getDeclaredFields();
//        Method[] catMethod = loki.getClass().getDeclaredMethods();
//
//        for(Field field : catFields){
//            System.out.println(field.getName());
//        }
//        for(Method method : catMethod){
//            System.out.println(method.getName());
//        }
//    }
//
//}
