public class ArrayIndexExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

try{
        System.out.println("Value at index 3: " + numbers[3]);  
    }
    catch(ArrayIndexOutOfBoundsException ae){
    System.out.println(" undefinedindex value 3:" +ae);
    }
    finally{
    for(int i=0;i<=2;i++){
    System.out.println("result:"+ numbers[i]);
   }
    }
}
}
