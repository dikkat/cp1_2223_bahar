package week9.section2;

public class AcademicalEmployee extends Employee {
    private String role;
    
    AcademicalEmployee(String firstName, String lastName,
            Company company, int startDate, AcademicalSalary salary, String role) { 
        // subclass->AcademicalEmployee -- superclass->Employee
        // AcademicalSalary extends Salary
        // AcademicalSalary can act like Salary
        // Salary can't act like AcademicalSalary
        super(firstName, lastName, company, startDate, salary);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    @Override
    public void setSalary(Salary salary) {
        // salary.netSalary *= 1.1;
        salary.setNetSalary((int)(salary.getNetSalary() * 1.1));
        super.setSalary(salary);
    }
}
