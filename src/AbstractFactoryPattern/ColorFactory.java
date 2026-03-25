package AbstractFactoryPattern;

import AbstractFactoryPattern.Color.Blue;
import AbstractFactoryPattern.Color.Color;
import AbstractFactoryPattern.Color.Green;
import AbstractFactoryPattern.Color.Red;
import AbstractFactoryPattern.Shape.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeName) {
        return null;
    }

    @Override
    public Color getColor(String colorName){
        if(colorName.equalsIgnoreCase("Red")){
            return new Red();
        } else if (colorName.equalsIgnoreCase("Green")) {
            return new Green();
        } else if (colorName.equalsIgnoreCase("Blue")) {
            return new Blue();
        }else {
            return null;
        }
    }
}
