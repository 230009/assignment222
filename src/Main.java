import src.Employee;
import src.Person;
import src.Student;

public class Main {
    public static void main(String[] args) {
        Person s1 = new Student("Liya", "Zharylkassyn", 4d);
        Person s2 = new Student("Leo", "Di", 1.27);
        Person e1 = new Employee("Angelina", "Jolie", "Worker", 100000d);
        Person e2 = new Employee("The", "HWeeknd", "Head office", 10000000d);
        printData(s1, s2, e1, e2);
    }

    public static void printData(Person... persons) {
        for(Person person : persons) {
            String data = person.toString() + " earns " + person.getPaymentAmount() + " tenge.";
            System.out.println(data);
        }
    }
}