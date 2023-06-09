package week8.section2;


public class Employee {
    String firstName;
    String lastName;
    int salary;
    Material[] responsibleFor;

    public Employee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        responsibleFor = new Material[10];
    }
    
    void addMaterial(Material paramMat) { // parameter material
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
