//package DesignPattern.Structural;
//
//public class Bridge {
//    public static void main(String[] args) {
//
//    }
//}
//interface Renderer{
//    void renderShape();
//}
//
//class SvgRenderer implements Renderer {
//    @Override
//    public void renderShape() {
//        // Lógica de renderização SVG
//    }
//}
//
//class BitmapRenderer implements Renderer {
//    @Override
//    public void renderShape() {
//        // Lógica de renderização de bitmap
//    }
//}
//
//abstract class Shape {
//    protected Renderer renderer;
//
//    public Shape(Renderer renderer) {
//        this.renderer = renderer;
//    }
//
//    public abstract void draw();
//}
//
//public class Circle extends Shape {
//    private int radius;
//
//    public Circle(int radius, Renderer renderer) {
//        super(renderer);
//        this.radius = radius;
//    }
//
//    @Override
//    public void draw() {
//        // Lógica para desenhar um círculo usando a renderização fornecida
//        renderer.renderShape();
//    }
//}
//
//class Rectangle extends Shape {
//    private int width;
//    private int height;
//
//    public Rectangle(int width, int height, Renderer renderer) {
//        super(renderer);
//        this.width = width;
//        this.height = height;
//    }
//
//    @Override
//    public void draw() {
//        // Lógica para desenhar um retângulo usando a renderização fornecida
//        renderer.renderShape();
//    }
//}
//
