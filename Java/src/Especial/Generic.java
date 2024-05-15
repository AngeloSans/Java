//package Especial;
//
//import java.util.ArrayList;
//
//public class Generic {
//    public static void main(String[] args) {
//            Box<String> toys = new Box<>();
//            toys.setThings("Car");
//            toys.setThings("Ball");
//            toys.setThings("Action Figured");
//            toys.getThings();
//            Box<Double> salaries = new Box<>();
//            salaries.setThings(5.000);
//            salaries.setThings(13.000);
//            salaries.setThings(25.000);
//            salaries.setThings(1000.000);
//            salaries.getThings();
//    }
//}
//class Box<B>{
//    ArrayList<B> things = new ArrayList<>();
//
//    public void setThings(B thing){
//        things.add(thing);
//    }
//    public void getThings(){
//        for(B Coisas : things){
//            System.out.println(Coisas);
//        }
//    }
//}