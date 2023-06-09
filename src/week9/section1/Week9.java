package week9.section1;

public class Week9 {
    public static void main(String[] args) {
        Salary sal = new Salary(9000, 500);
        Company comp = new Company("FSMVU", "Fatih/Istanbul");
        Employee emp = new Employee("ert", "isl", comp, 
                0, sal);
        
        
        Salary acsal = new AcademicalSalary(sal, 2000);
        // AcademicalSalary can act like a Salary
        // Salary can't act like AcademicalSalary
        AcademicEmployee acemp = new AcademicEmployee("ert1", "isl1", 
                comp, 0, (AcademicalSalary)acsal, "asstnt");
        
        ManagerialEmployee manemp = new ManagerialEmployee("ert2", "isl2", comp, 0, new Salary(100000, 10000), "CEO", 5);
        
        sal.setNetSalary(10000);
        System.out.println(emp.getSalary());
        System.out.println(acemp.getSalary());
        System.out.println(manemp.getSalary());
        System.out.println("");
        System.out.println(comp.getTotalSalaries());
        System.out.println(Company.increaseAllSalaries(comp, 100)); // increase managerial employee salary by their level do it yourself
        System.out.println(emp.getSalary());
        System.out.println(acemp.getSalary());
        System.out.println(manemp.getSalary());
        System.out.println("");
        System.out.println(comp.getTotalSalaries());
        System.out.println("");
        System.out.println(emp.getSalary());
        System.out.println(acemp.getSalary());
        System.out.println(manemp.getSalary());
        comp.giveBonus(1000);
        System.out.println("");
        System.out.println(emp.getSalary());
        System.out.println(acemp.getSalary());
        System.out.println(manemp.getSalary()); // there is a problem with the result of managerial employee bonus
    }
}
