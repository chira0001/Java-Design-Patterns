package AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        FactoryProducer factoryProducer = new FactoryProducer();
        factoryProducer.getFactory("Shape").getShape("Circle").draw();
        factoryProducer.getFactory("Color").getColor("red").fill();
    }
}
