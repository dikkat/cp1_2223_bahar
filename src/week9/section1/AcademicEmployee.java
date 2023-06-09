package week9.section1;


public class AcademicEmployee extends Employee {
    private String title; 
    
    AcademicEmployee(String name, String lastName, Company company, int entryDate, AcademicalSalary salary, String title) {
        super(name, lastName, company, entryDate, salary);
        this.setSalary(salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    @Override
    public void setSalary(Salary salary) {
        salary.setNetSalary((int)(salary.getNetSalary() * 1.1));
        super.setSalary(salary);
    }
}
