interface abc{
    int test(int x,int y);
}
class funinter{
    public static void main(String[] args) {
            abc obj=(x,y)-> x+y;

            System.out.println("sumof X and Y="+obj.test(3,5));

    }
}
