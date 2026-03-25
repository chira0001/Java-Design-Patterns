package AbstractFactoryPattern;

public class FactoryProducer {
    public AbstractFactory getFactory(String factoryName){
        if (factoryName.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        else if(factoryName.equalsIgnoreCase("Shape")){
            return new ShapeFactory();
        }
        else {
            return null;
        }
    }
}
