package week8.section1;


public class Employee {
    String firstName;
    String lastName;
    int salary;
    Material[] responsibleFor;
    
    Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.responsibleFor = new Material[10];
    }
    
    void addMaterial(Material paramMat) {
        for (int i = 0; i < responsibleFor.length; i++) {
            if (responsibleFor[i] == null) {
                responsibleFor[i] = paramMat;
                return;
            }
        }
        System.out.println("Employee can't take more responsibilities.");
    }
    
    String getFullName() {
        return firstName + " " + lastName;
    }
    
    
}
