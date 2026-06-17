class A{
    void e(){
        System.out.println("Class A method");
    }
}
    class B extends A{
        void y(){
            System.out.println("Class B method");   
        }
    }
    class Testinheritance{
        public static void main(String args[]){
            B obj=new B();
            obj.e();
            obj.y();
        }
    }
