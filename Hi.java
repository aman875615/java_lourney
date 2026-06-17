interface helloP{
void print();
}
class Hi implements helloP{
    public void print(){
        System.out.println("Hello, World!");
    }
public static void main (String[] args) {
        Hi obj = new Hi();
        obj.print();
    }
}