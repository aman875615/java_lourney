class  Person   {
    String name;
    Person (String name) {
        this.name = name;

    }
    void show(){
        System.out.println("Name: " + name);
    }
}
class Employee extends Person{
    int empId;
    Employee(String name, int empId){
        super(name);
        this.empId = empId;
    }
        @Override
    void show(){
        super.show();
        System.out.println("Employee ID: " + empId);
    }
}
public class Exam {
    public static void main(String[] args) {
        Employee emp = new Employee("Aman", 201);
        emp.show();
    }
}
