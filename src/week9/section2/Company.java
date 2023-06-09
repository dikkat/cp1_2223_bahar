package week9.section2;

import java.util.Arrays;

public class Company {
    private String name;
    private String adress;
    private Employee[] employees;
    

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
    
    public int getTotalSalary() {
        int total = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                total += employees[i].getSalary().getNetSalary();
            }
        }
        return total;
    }
    
    /**
     * 
     * @param comp
     * comp should be Company
     * @param increaseFactor 
     * increaseFactor should be between 0-1
     */
    static public int increaseSalaries(Company comp, double increaseFactor) {
        int total = 0;
        for (int i = 0; i < comp.employees.length; i++) {
            if (comp.employees[i] != null) {
                Salary sal = comp.employees[i].getSalary();
                total += (int)(sal.getNetSalary() * (1 + increaseFactor)) - sal.getNetSalary();
                sal.setNetSalary((int)(sal.getNetSalary() * (1 + increaseFactor)));
            }
        }
        return total;
    }
    
    public void giveBonus(int bonus) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].giveBonus(bonus);
            }
        }
    }
    
    public void giveBonusAcademical(int bonus) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && (employees[i] instanceof AcademicalEmployee)) {
                
                employees[i].giveBonus(bonus);
                System.out.println(employees[i]);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Company{" + "name=" + name + ", adress=" + adress + ", employees=" + Arrays.toString(employees) + '}';
    }

    
    
}
