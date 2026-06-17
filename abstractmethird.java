 abstract class Bike{
    abstract void run();
 }
class abstractmethird extends Bike{
    void run(){System.out.println("running safely");}
    public static void main(String[] args) {
    Bike obj=new abstractmethird();
    obj.run();
    }
}