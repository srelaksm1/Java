import java.lang.*;
public class ExceptionExample {
    public static void main(String[] args) {
	try{
            int res= 10/0 ;
            System.out.println("Result:" +res);
          
	}catch(ArithmeticException ae)
		{
		System.out.println("Divide by zero error at line no 4"+ae);
		}
		finally
		{
		  System.out.println(100);
		
            for(int i=0;i<=10;i++)
            {
            System.out.println(i);
            }
            }

        }
}

