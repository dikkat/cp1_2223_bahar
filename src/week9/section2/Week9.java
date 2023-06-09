package week9.section2;

public class Week9 {
    public static void main(String[] args) {
        Salary sal = new Salary(10000, 1000);
        Company comp = new Company("FSMVU", "Fatih/Istanbul");
        
        
        // AcademicalSalary extends Salary
        // AcademicalSalary can act like Salary
        // Salary can't act like AcademicalSalary
        Salary acasal = new AcademicalSalary(sal, 2000);
        
        Employee standardEmployee = new Employee("ert", "dontcare", 
                comp, 0, sal);
        
        AcademicalEmployee academicalEmployee = new AcademicalEmployee("ert2", 
                "dontcareeither", comp, 0, 
                (AcademicalSalary)acasal, "assistant");
        
        ManagerialEmployee managerialEmployee = new ManagerialEmployee("ert3", 
                "whatevre", comp, 0, sal, "CEO", 5);
        
        /*
        System.out.println(standardEmployee.getSalary());
        System.out.println(academicalEmployee.getSalary());
        System.out.println(managerialEmployee.getSalary());
        */
        academicalEmployee.setSalary(new AcademicalSalary(acasal, 2000));
        managerialEmployee.setSalary(new Salary(sal));
        sal.setNetSalary(9000);
        System.out.println("");
        System.out.println(standardEmployee.getSalary());
        System.out.println(academicalEmployee.getSalary());
        System.out.println(managerialEmployee.getSalary());
       
        // System.out.println(comp);
        System.out.println(comp.getTotalSalary());
        System.out.println(Company.increaseSalaries(comp, 0.1));
        System.out.println(comp.getTotalSalary());
        System.out.println("");
        System.out.println(standardEmployee.getSalary());
        System.out.println(academicalEmployee.getSalary());
        System.out.println(managerialEmployee.getSalary());
        
        System.out.println("Give bonus");
        comp.giveBonus(1000);
        System.out.println(standardEmployee.getSalary());
        System.out.println(academicalEmployee.getSalary());
        System.out.println(managerialEmployee.getSalary());
        System.out.println("");
        comp.giveBonusAcademical(100);
    }
}
