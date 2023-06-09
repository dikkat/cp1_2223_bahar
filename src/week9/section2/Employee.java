package week9.section2;

public class Employee {
    private String firstName;
    private String lastName;
    private Company company;
    private int startDate;
    private Salary salary;
    
    public Employee(String firstName, String lastName, Company company, 
            int startDate, Salary salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.startDate = startDate;
        this.salary = salary;
        this.company.addEmployee(this);
    }
    
    public void giveBonus(int bonus) {
        this.salary.setBonus(this.salary.getBonus() + bonus);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "firstName=" + firstName + 
                ", lastName=" + lastName + 
                ", startDate=" + startDate + ", salary=" + salary + '}';
    }
}