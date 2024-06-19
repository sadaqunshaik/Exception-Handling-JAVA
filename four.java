
class Test{
    
    public static void main(String[] args) {
        int a[]={101,102,103};
        String str=null;
        try {
            try {
                try {
                    // System.out.println(10/0);
                     //  System.out.println(a[4]); 
                   System.out.println(str.length());
                } 
                catch (ArithmeticException ae) {
                    System.out.println("ArithmeticException - ae");
                }
            }
             catch (ArrayIndexOutOfBoundsException aibe) {
                System.out.println("ArrayIndexOutOfBoundsException - aibe");
            }     
        } 
        catch (NullPointerException npe) {
            System.out.println("NullPointerException - npe");
        }
    }
}