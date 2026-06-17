public class Aman {
    Aman(String n){
        System.out.println(n);
    }
    Aman(int age){
        System.out.println("My age is: "+age);
    }
    Aman(double  sallary){
        System.out.println("My sallary is: "+sallary);
    }
    public static void main(String[] args) {
        Aman am=new Aman("Aman");
        Aman am1=new Aman(21);
        Aman sl=new Aman(5999);
    }
}
