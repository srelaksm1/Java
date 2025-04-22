import java.io.*;

public class ThrowsExample {
    public static void main(String[] args) {
try{        
readFile();
}catch(IOException io)
{
System.out.println("Input output error");
}  
    }

    public static void readFile() throws IOException {
        FileReader file = new FileReader("example.txt");
        BufferedReader fileInput = new BufferedReader(file);

        System.out.println(fileInput.readLine());
        fileInput.close();
    }
}

