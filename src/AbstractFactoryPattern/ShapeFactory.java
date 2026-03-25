package AbstractFactoryPattern;

import AbstractFactoryPattern.Color.Color;
import AbstractFactoryPattern.Shape.Circle;
import AbstractFactoryPattern.Shape.Rectangle;
import AbstractFactoryPattern.Shape.Shape;
import AbstractFactoryPattern.Shape.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeName){
        if (shapeName.equalsIgnoreCase("Circle")){
            return new Circle();
        } else if (shapeName.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapeName.equalsIgnoreCase("Square")) {
            return new Square();
        }else {
            return null;
        }
    }

    @Override
    Color getColor(String colorName) {
        return null;
    }
}
