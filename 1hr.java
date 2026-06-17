class Emp{
    float salary=10000;
}
class HR extends Emp{
    float salary=20000;
    void display()
    {
        System.out.println("Salary is: "+salary);
        System.out.println("Salary is: "+super.salary);
    }
} 
