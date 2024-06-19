
class Test{
    public static void main(String[] args) {
       String str=null;
       try {
           System.out.println(str.length());
       } 
       catch (NullPointerException npe) {
         System.out.println(npe);
       }
    }    
}