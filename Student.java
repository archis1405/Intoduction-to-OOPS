//Basic Demonstration of the Constructors in Java

public class Student {

    public String name;
    public int id;
    
    // Constructors are stored in the Heap Memory
    // Default Constructor
    /* 
        Student(){
            System.out.println("Constructor called");
        }
    */

    //Parameterised Constructor 
    
        Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        //NOTE - We can have multiple parameterised constructors with different parameters.

    //Copy Constructor

    public Student(Student student){
        this(student.name, student.id); // copy of the object 
    }

    public static void main(String[] args) {
        // Using Default Constructor
        // Student student1 = new Student();
        // System.out.println("Student 1: " + student1.name + ", ID: " + student1.id);

        // Using Parameterised Constructor
        Student student2 = new Student("Alice", 101);
        System.out.println("Student 2: " + student2.name + ", ID: " + student2.id);

        // Using Copy Constructor
        Student student3 = new Student(student2);//passing the object 
        System.out.println("Student 3: " + student3.name + ", ID: " + student3.id);
    }
    
}
 

/* 
    Can a constructor call another constructor?
    Yes, a constructor can call another constructor using 'this()' syntax and multiple
    constructors can be called within the same class.

    CONSTRUCTOR CHAINING ::
    It is a technique in which a constructor calls another constructor in the same class.
    This is done to avoid code duplication and to initialize the object with different 
    sets of parameters.

    CONSTRUCTOR OVERLOADING ::
    It is a feature in which a class can have multiple constructors with different
    parameters . Kindoff like method overloading but with constructors.

*/