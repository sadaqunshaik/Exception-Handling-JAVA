
class Test{

    public static void main(String[] args) {
       int[] arr={101,102,103};
       System.out.println(arr.length);
       
       try {
           System.out.println(arr[4]);
       } catch (ArrayIndexOutOfBoundsException aibe) {
       // System.out.println(aibe);
        System.out.println(aibe.getMessage());
       // aibe.printStackTrace();
       }
       System.out.println(arr[0]);
    }
}