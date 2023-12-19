import java.util.Scanner;

public class Main {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        Persona persona = new Persona();
        System.out.println("Hello github!..quien esta de ese lado?");
        var name = entrada.nextLine();
        persona.setName(name);
        System.out.println("Ahaaaaa...con que te llamas " + persona.getName());
        System.out.println("y cuantos años tienes");
        var age= entrada.nextInt();
        persona.setAge(age);
        System.out.println("Ahaaa... y tienes  " + persona.getAge());
    }
}