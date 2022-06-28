/*Defining the Abstract Class Factory (Car) having car as abstract method*/
abstract class Car{
    abstract public Car createCar(String obj);
}

/*This class Car is inherited by child factory class 
 * Factory classes are responsible for creating the objects
 * Here Modern Car and Classic Car should also extends Car because it is type of Car and needs to leave abstract method empty
*/

class CarFactory extends Car{
    
    @Override
    public Car createCar(String name) {
        Car obj = null;
        if(name == "Modern Car"){
            obj = new ModernCar();
        }
        else if(name=="Classic Car")
        {
            obj = new ClassicCar();
        }
        return obj;
    }
}


class ModernCar extends Car{
    public ModernCar(){
        System.out.println("Modern Car properties");
    }

    @Override
    public Car createCar(String obj) {
        return null;
    }

    
}


class ClassicCar extends Car{
    public ClassicCar(){
        System.out.println("Classic Car properties");
    }

    @Override
    public Car createCar(String obj) {
        // TODO Auto-generated method stub
        return null;
    }
}


/*Client will directly contact the factory classes*/
class factory{
    public static void main(String[] args) {
        CarFactory modern_car = new CarFactory();
        modern_car.createCar("Modern Car");
        CarFactory classic_car = new CarFactory();
        classic_car.createCar("Classic Car");
    }
}
/*Output:-
 * Modern Car properties
 * Classic Car properties
 */