package week8.section1;

public class Week8 {
    public static void main(String[] args) {
        Factory toAdd = new Factory("Fabrika");
        
        FactoryManagement.factoryManager.addFactory(toAdd);
        Factory factory = FactoryManagement.factoryManager.factories[0];
        
        Material material = new Material("carbon", 200);
        
        Material material2 = new Material("neon", 300);
        
        factory.addMaterial(material);
        factory.addMaterial(material2);
        
        // material.print();
        // toAdd.printFirstFactory();
        
        Employee emp = new Employee("ertu", "isla", 400000);
        factory.addEmployee(emp);
        System.out.println(factory.employees[0].firstName);
    }
}
