package week8.section1;


public class Material {
    String title;
    int price;
    static String type = "MATERIAL";
    
    Material(String title, int price) {
        this.title = title;
        this.price = price;
    }
    
    void print() {
        System.out.println(FactoryManagement.factoryManager.factories[0].title);
    }
}
