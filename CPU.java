import java.util.Scanner;

class CPU {
    double price;
class Processor {
    int cores;
    String manufacturer;
public void display() {
            System.out.println("Processor: " + cores + " cores, Manufacturer: " + manufacturer);
        }
    }
 static class RAM {
        int memory;
        String manufacturer;
public void display() {
            System.out.println("RAM: " + memory + " GB, Manufacturer: " + manufacturer);
        }
    }
public void displayCPUInfo() {
        System.out.println("CPU Price: $" + price);
    }
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CPU cpu = new CPU();
System.out.print("Enter the CPU price: ");
cpu.price = scanner.nextDouble();
        CPU.Processor processor = cpu.new Processor();

        System.out.print("Enter the number of processor cores: ");
        processor.cores = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Enter the processor manufacturer: ");
        processor.manufacturer = scanner.nextLine();

      
        CPU.RAM ram = new CPU.RAM();
     
        System.out.print("Enter the RAM memory (in GB): ");
        ram.memory = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Enter the RAM manufacturer: ");
        ram.manufacturer = scanner.nextLine();

        
        cpu.displayCPUInfo();
        processor.display();
        ram.display();
        scanner.close();
    }
}

