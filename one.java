
class Test{
    public static void main(String[] args) {
        System.out.println(10/2);
try{
     System.out.println(10/0);
}
catch(ArithmeticException ae){
   System.out.println(ae.getMessage());
   ae.printStackTrace();
}

System.out.println(10/5);
    }
}