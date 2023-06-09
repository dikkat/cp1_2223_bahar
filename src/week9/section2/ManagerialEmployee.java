package week9.section2;

public class ManagerialEmployee extends Employee {
    private String role;
    private int level;
    
    public ManagerialEmployee(String firstName, String lastName, Company company, 
            int startDate, Salary salary, String role, int level) {
        super(firstName, lastName, company, startDate, salary);
        this.role = role;
        this.level = level;
    }
    
    @Override
    public void setSalary(Salary salary) {
        salary.setNetSalary((int)(salary.getNetSalary() * this.level));
        salary.setBonus((int)(salary.getBonus() * this.level));
        super.setSalary(salary);
    }

    @Override
    public void giveBonus(int bonus) {
        super.giveBonus(bonus * level);
    }
    
    
    
}
