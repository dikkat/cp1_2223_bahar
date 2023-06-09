package week9.section2;

public class AcademicalSalary extends Salary {
    private int additionalSalary;
    
    public AcademicalSalary(int netSalary, int bonus, int additionalSalary) {
        super(netSalary, bonus);
        this.additionalSalary = additionalSalary;
        super.setNetSalary(super.getNetSalary() + additionalSalary);
    }
    
    public AcademicalSalary(Salary salary, int additionalSalary) {
        super(salary);
        this.additionalSalary = additionalSalary;
    }

    @Override
    public void setNetSalary(int netSalary) {
        super.setNetSalary(netSalary + additionalSalary);
    }
    
    
    
}
