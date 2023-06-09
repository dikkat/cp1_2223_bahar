package week9.section1;

public class Company {
    final private String name; 
    private String adress;
    
    private int numberOfEmployees;
    final private Employee[] employees;
    
    public Company(String name, String adress) {
        this.name = name;
        this.adress = adress;
        this.employees = new Employee[1000];
    }
    
    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
    }
    
    public int getTotalSalaries() {
        int total = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                total += employees[i].getSalary().getNetSalary();
            }
        }
        /*
        ALTERNATIVE FOR-EACH LOOP SAME THING!!
        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary().getNetSalary();
            }
        }
        */
        
        return total;
    }
    
    static public int increaseAllSalaries(Company comp, int increaseAmount) {
        int total = 0;
        for (int i = 0; i < comp.employees.length; i++) {
            if (comp.employees[i] != null) {
                Salary salary = comp.employees[i].getSalary();
                salary.setNetSalary(salary.getNetSalary() + increaseAmount);
                total += increaseAmount;
                // ALTERNATIVE
                //comp.employees[i].getSalary().setNetSalary(
                //      comp.employees[i].getSalary().getNetSalary() + increaseAmount);
            }
        }
        return total;
    }
    
    public void giveBonus(int bonus) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].setSalaryBonus(employees[i].getSalary().getBonus() + bonus);
            }
        }
    }
    
    public void printBonus() {
       for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getSalary().getBonus());
            }
        } 
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    
    
}
