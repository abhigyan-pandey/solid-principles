import java.util.List;

//                      ========    INTERFACE SEGGREGATION  ========
interface Vehicle {

    void getVehicleNumber();

}

interface buy_New_Car {

    void purchase_Car();
}

interface sell_Your_Car {

    void sell_Car();
}

// ======== SINGLE RESPONSIBILITY AND OPEN/CLOSED PRINCIPLE =========

class Car implements Vehicle {
    String vehicleNumber;

    public Car(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void getVehicleNumber() {
        System.out.println("VEHICLE NUMBER FOR THE CAR IS -> " + vehicleNumber);
    }

}

class Bike implements Vehicle {
    String vehicleNumber;

    public Bike(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void getVehicleNumber() {
        System.out.println("VEHICLE NUMBER FOR BIKE IS -> " + vehicleNumber);

    }
}

class BMW extends Car {
    String colour;

    public BMW(String modelnumber) {
        super(modelnumber);
    }

    public void getVehicleNumber() {
        super.getVehicleNumber();
    }

    void setcolour(String colour) {
        this.colour = colour;
    }

    void getcolour() {
        System.out.println("THE COLOUR OF BMW IS -> " + colour);
    }
}

// ========== LISKOV SUBSTITUTION PRINCIPLE ==========
interface Shaped {

    public void extract_Area();
}

class Squared implements Shaped {
    int length;
    int breadth;

    void setlength(int length_value) {
        length = length_value;
        breadth = length_value;
    }

    void setbreadth(int breadth_value) {
        breadth = breadth_value;
        length = breadth_value;
    }

    public void extract_Area() {
        int area = length * breadth;
        System.out.println("AREA IS " + area);
    }
}


// ========== Dependency Inversion Principle ===========

interface Developer {

    void develop();
}

class FrontEndDeveloper implements Developer {
    public void develop() {
        System.out.println("HERE THE REACT CODE HAS BEEN IMPLEMENTED");
        System.out.println("HERE THE ANGULAR CODE HAS BEEN IMPLEMENTED");
    }
}

class BackEndDeveloper implements Developer {
    public void develop() {
        System.out.println("THIS IS THE FUNCTION FOR USING JAVA");
        System.out.println("THIS IS THE FUNCTION FOR USING SPRINGBOOT");
    }
}

class Project {

    private List<Developer> developers;

    public Project(List<Developer> developers) {

        this.developers = developers;
    }

    public void implement() {

        developers.forEach(d -> d.develop());
    }

}

// ========= MAIN FUNCTION AND CLASS ==========
public class solid {

    public static void main(String args[]) {
        Car objCar = new Car("XY ZY QE 1234");
        objCar.getVehicleNumber();

        Car objectCarTwo = new BMW("TL 20 CJ 1920");
        objectCarTwo.getVehicleNumber();
        System.out.println("======    CREATING  A NEW OBJECT FOR BWM CLASS ======");
        BMW objectBMW = new BMW("LH 70 RT 1990");
        objectBMW.setcolour("Black");
        objectBMW.getcolour();

    }
}
