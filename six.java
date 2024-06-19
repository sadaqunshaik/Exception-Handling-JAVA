import java.io.IOException;
class Test{
    public static void main(String[] args)throws  ArrayIndexOutOfBoundsException
     {
        int arr[]={101,102,103,104};
        try {
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println("SuccessFully thrown !....");
        }
            
    }
}