package week9.section1;

public class Employee {
    private String name;
    private String lastName;
    private Company company;
    private int entryDate;
    private Salary salary;
    
    public Employee() {
    }

    public Employee(String name, String lastName, Company company, int entryDate, Salary salary) {
        this.name = name;
        this.lastName = lastName;
        this.company = company;
        this.entryDate = entryDate;
        this.salary = salary;
        this.company.addEmployee(this); // if you are studying this code from github and couldnt get this part, ask me through email if you like
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(int entryDate) {
        this.entryDate = entryDate;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
    
    public void setSalaryBonus(int bonus) {
        this.salary.setBonus(bonus);
    }

}
