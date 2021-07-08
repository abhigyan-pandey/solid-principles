//                      ========    INTERFACE SEGGREGATION  ========
interface Vehicles {
    void buyCar();

    void driveCar();

    void sellCar();
}
// ======== SINGLE RESPONSIBILITY =========

class student {

    String name;
    int age;
    int total_Marks;
    int number_Of_Subjects;

    // TWO DIFFERENT TASKS IN SAME CLASS

    void print_Details() {
        System.out.println("NAME IS " + name);
        System.out.println("AGE IS " + age);
    }

    void calculate_result() {
        int percentage = total_Marks / number_Of_Subjects;
        System.out.println("PERCENTAGE IS -> " + percentage);
    }

}

// OPEN CLOSED PRINCIPLE
class Shapes {
    String shape_type;
    int side_length;
    int height;
    int breadth;

    void calculate_Area(Shapes[] object_List) {
        for (Shapes object : object_List) {
            int area = 0;
            if (object.shape_type == "Triangle") {

                area = (object.side_length * object.side_length);

            } else if (object.shape_type == "Rectangle") {
                area = (object.height * object.breadth);
            }
            System.out.println(area);
        }
    }

}

// ========== LISKOV SUBSTITUTION PRINCIPLE ==========
class Shape {
    int length;
    int breadth;

    void setlength(int lengthval) {
        length = lengthval;
    }

    void setbreadth(int breadthval) {
        breadth = breadthval;
    }

    public void extract_Area() {
        int area = length * breadth;
        System.out.println("THE AREA OF SHAPE IS -> " + area);
    }
}

class Square extends Shape {
    void setlength(int length_value) {
        length = length_value;
        breadth = length_value;
    }

    void setbreadth(int breadth_value) {
        breadth = breadth_value;
        length = breadth_value;
    }
}

// ======== DEPENDENCY INVERSION PRINCIPLE ==========

class backendDevCodes {
    public void implementJava() {
        System.out.println("THIS IS THE FUNCTION FOR USING JAVA");
    }

    public void implementSpring() {
        System.out.println("THIS IS THE FUNCTION FOR USING SPRINGBOOT");
    }
}

class frontendDevCodes {

    public void useReactJS() {
        System.out.println("HERE THE REACT CODE HAS BEEN IMPLEMENTED");
    }

    public void useAngularJS() {
        System.out.println("HERE THE ANGULAR CODE HAS BEEN IMPLEMENTED");
    }
}

class MainProject {
    private frontendDevCodes Front_End_Object;
    private backendDevCodes Back_End_Object;

    public void implementApplication() {
        Front_End_Object.useReactJS();

        Back_End_Object.implementJava(); // Main Project is dependent on the two classes
        Back_End_Object.implementSpring();

    }

}