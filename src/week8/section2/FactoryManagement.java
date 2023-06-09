package week8.section2;

public class FactoryManagement {
    
    static FactoryManagement factoryManager = new FactoryManagement();
    
    Factory[] factories;
    
    FactoryManagement() {
        factories = new Factory[10];
    }
    
    static void addFactory(Factory factory) {
        for (int i = 0; i < factoryManager.factories.length; i++) {
            if (factoryManager.factories[i] == null) {
                factoryManager.factories[i] = factory;
                return;
            }
        }
        System.out.println("FactoryManagement at capacity.");
    }
}
