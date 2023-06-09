package week9.section1;

public class AcademicalSalary extends Salary {
    private int additionalSalary;
    
    public AcademicalSalary(int netSalary, int bonus, int additionalSalary) {
        super(netSalary, bonus);
        this.additionalSalary = additionalSalary;
    }
    
    public AcademicalSalary(Salary salary, int additionalSalary) {
        super(salary);
        this.additionalSalary = additionalSalary;
    }
    
    public int getAdditionalSalary() {
        return additionalSalary;
    }

    public void setAdditionalSalary(int additionalSalary) {
        this.additionalSalary = additionalSalary;
    }
}
