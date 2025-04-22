public class ThrowExample{
public static void main(String args[]){
int age=16;
if(age<18){
            throw new ArithmeticException("Access denied - You must be 18 or older.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}

