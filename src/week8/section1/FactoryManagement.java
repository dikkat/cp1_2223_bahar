package week8.section1;

public class FactoryManagement {
    Factory[] factories;
    
    static FactoryManagement factoryManager = new FactoryManagement();
    
    FactoryManagement() {
        factories = new Factory[10];
    }
    
    void addFactory(Factory paramFac) {
        for (int i = 0; i < factories.length; i++) {
            if (factories[i] == null) {
                factories[i] = paramFac;
                return;
            }
        }
        System.out.println("Factory management at capacity.");
    }
}
