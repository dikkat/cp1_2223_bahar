package week9.section2;

public class Salary {
    private int netSalary;
    private int bonus;

    public Salary(int netSalary, int bonus) {
        this.netSalary = netSalary;
        this.bonus = bonus;
    }
    
    // copy constructor
    public Salary(Salary salary) {
        this.netSalary = salary.netSalary;
        this.bonus = salary.bonus;
    }

    public int getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(int netSalary) {
        this.netSalary = netSalary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Salary{" + "netSalary=" + netSalary + ", bonus=" + bonus + '}';
    }
    
    
}
