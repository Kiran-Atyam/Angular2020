import java.util.Scanner;
public class Employee1 {
    
    int id;
    String eName;
    String role;
    double salary;
    double experience;
    public Employee1(int id, String eName, String role, double salary, double experience) {
        this.id = id;
        this.eName = eName;
        this.role = role;
        this.salary = salary;
        this.experience = experience;
    }
    
    @Override
    public String toString() {
        return "Employee1 [eName=" + eName + ", experience=" + experience + ", id=" + id + ", role=" + role
                + ", salary=" + salary + "]";
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String geteName() {
        return eName;
    }
    public void seteName(String eName) {
        this.eName = eName;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getExperience() {
        return experience;
    }
    public void setExperience(double experience) {
        this.experience = experience;
    }

}
class EmployeeSystem{
    static Scanner sc = new Scanner(System.in);
    private static Employee1 addEmployee(){
        System.out.println("Enter the Employee id");
        int id = sc.nextInt();
        System.out.println("Enter the Employee eName"); 
        String eName = sc.nextLine();
        System.out.println("Enter the Employee role");
        String role = sc.nextLine();
        System.out.println("Enter the Employee salary");
        double salary = sc.nextDouble();
        System.out.println("Enter the Employee experience");
        double experience = sc.nextDouble();
        Employee1 E = new Employee1(id, eName, role, salary, experience);
        System.out.println("Employee Id added Successfully");
        System.out.println(E);
        return(E);
    }
    public static void main(String[] args) {
        while(true){
            System.out.println("1.add an employee");
            System.out.println("2. exit the program");
            System.out.println("Enter the choice :>");
            int choice = sc.nextInt();
            switch(choice){
         case 1:
            addEmployee();
                break;
case 2:
System.out.println(" Thank You!");
System.exit(0);
break;

            }
        }

    }
        
    }


