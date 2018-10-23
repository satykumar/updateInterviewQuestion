package abs.desgin.pattern;

public class ShapeFactory extends AbstractFactory {

    public Shape getShape(String shapeType)
    {
        if(shapeType == null){
            return null;
         }     
         if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
            
         } else if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
            
         } else if(shapeType.equalsIgnoreCase("Squre")){
            return new Squre();
         }
        return null;
    }

    @Override
    Color getColor(String color) {
        // TODO Auto-generated method stub
        return null;
    }
}
