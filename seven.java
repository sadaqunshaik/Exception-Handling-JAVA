
class Test
{
    void m1(){
    this.m2();
    }
    void m2(){
        System.out.println(10/0);
    }
    public static void main(String[] args) {
        Test t=new Test();
        t.m1();
        t.m2();
    }
}