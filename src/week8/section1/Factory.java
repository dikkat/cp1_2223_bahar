package week8.section1;


/*
Define these classes: Material {title, price} and Factory {title, materials}.
Write two methods for Factory class that add a value and remove a value from the materials array. Method parameter is material.
*/
public class Factory {
    String title;
    Material[] materials;
    Employee[] employees;

    Factory(String title) {
        this.title = title;
        this.materials = new Material[10];
        this.employees = new Employee[10];
    }
    
    /*
    void printFirstFactory() {
        
        Factory temp = FactoryManagement.factoryManager.factories[0];
        System.out.println(temp.title);
        for (Material material : temp.materials) {
            if (material != null)
                System.out.println(material.title);
        }
    }
    */
    
    int getMaterialsCount() {
        int count = 0;
        for (int i = 0; i < materials.length; i++) {
            if (materials[i] != null) {
                count++;
            }  
        }
        return count;
    }
    
    int getMaterialsPriceTotal() {
        int total = 0;
        for (int i = 0; i < materials.length; i++) {
            if (materials[i] != null) {
                total += materials[i].price;
            }  
        }
        return total;
    }
    
    void addMaterial(Material paramMat) {
        // Material arr[] = new Material[10];
        // [paramMat, paramMat, paramMat, ... paramMat]
        for (int i = 0; i < materials.length; i++) {
            if (materials[i] == null) {
                materials[i] = paramMat;
                return;
            }  
        }
        System.out.println("Factory at capacity.");
    }
    
    void removeMaterial(Material material) {
        for (int i = 0; i < materials.length; i++) {
            // null.title
            if (materials[i] != null && materials[i].title == material.title) {
                materials[i] = null;
                return;
            }  
        }
        System.out.println("Material not found.");
    }
    
    void removeUnderGivenPrice(int price) {
        for (int i = 0; i < materials.length; i++) {
            if (materials[i] != null && materials[i].price < price) {
                materials[i] = null;
            }  
        }
    }
    
    void addEmployee(Employee paramEmp) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = paramEmp;
                return;
            }  
        }
        System.out.println("Employees at capacity.");
    }
    
    void assignMaterialToEmployee(Employee emp, Material mat) {
        
        Material materialExists = null;
        for (int i = 0; i < materials.length; i++) {
            if (materials[i] != null && materials[i].title == mat.title) {
                materialExists = materials[i];
            }  
        } 
        if (materialExists == null) {
            System.out.println("Factory does not have the given material.");
            return;
        }
        
        Employee employeeExists = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullName() == emp.getFullName()) {
                employeeExists = employees[i];
            }  
        } 
        if (employeeExists == null) {
            System.out.println("Factory does not employe the given employee.");
            return;
        }
        
        employeeExists.addMaterial(materialExists);
    }
    
    /*
    Write a method for Factory that increases the price of a material with given title by a given value. 
    If the price of the material is less than 5 increase it's price by additional 2. 
    Return the total price increase.
    */
    
    void increasePrice(String title, int value) {
        // 3, 10
        // 3 + 10 + 2 = 15
        // 5, 10
        // 5 + 10 = 15
        for (int i = 0; i < materials.length; i++) {
            if (materials[i] != null && materials[i].title == title) {
                if (materials[i].price < 5) {
                    materials[i].price += value + 2;
                } else {
                    materials[i].price += value;
                }
            }  
        }
    }
}
