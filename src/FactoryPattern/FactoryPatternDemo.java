package FactoryPattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        shapeFactory.getShape("Rectangle").draw();
        shapeFactory.getShape("Circle").draw();
    }
}
