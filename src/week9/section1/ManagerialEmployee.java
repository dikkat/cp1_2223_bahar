package week9.section1;

public class ManagerialEmployee extends Employee {
    private String title; 
    private int level;

    public ManagerialEmployee(String name, String lastName, Company company, 
            int entryDate, Salary salary, String title, int level) {
        super(name, lastName, company, entryDate, salary);
        this.title = title;
        this.level = level;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void setSalary(Salary salary) {
        salary.setBonus(salary.getBonus() * level);
        salary.setNetSalary(salary.getNetSalary() * level);
        super.setSalary(salary);
    }
    
    @Override
    public void setSalaryBonus(int bonus) {
        super.setSalaryBonus(level * bonus);
    }

}
