package AbstractFactoryPattern;

import AbstractFactoryPattern.Color.Color;
import AbstractFactoryPattern.Shape.Shape;

public abstract class AbstractFactory {
    abstract Shape getShape(String shapeName);
    abstract Color getColor(String colorName);
}
