
package week8.section2;

public class Factory {
    String title;
    Material[] materials;
    Employee[] employees;
    
    Factory(String title) {
        this.title = title;
        // new int[10]; -> [0, 0, 0, ..., 0]
        // new Object[10]; -> [null, null, null, ..., null]
        // new String[10]; -> [null, null, null, ..., null]
        // new Material[10]; -> [paramMat, null, null, ..., null]
        // new Factory[10]; -> [null, null, null, ..., null]
        // Factory[0].addMaterial() -> null.addMaterial() -> NullPointerException
        materials = new Material[10];
        employees = new Employee[10];
    }
    
    void addMaterial(Material paramMat) { // parameter material
        for (int i = 0; i < materials.length; i++) {
            if (materials[i] == null) {
                materials[i] = paramMat;
                return; // you can also do this using boolean variables try it yourself if you like
            }
        }
        System.out.println("Factory at capacity.");
    }
    
    void removeMaterial(Material paramMat) {
        for (int i = 0; i < materials.length; i++) {
            if (materials[i] != null && materials[i].title == paramMat.title) {
                materials[i] = null;
                return;
            }
        }
        System.out.println("Factory does not have the given material.");
    }
    
    void addEmployee(Employee paramEmp) { // parameter employee
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = paramEmp;
                return; // you can also do this using boolean variables try it yourself if you like
            }
        }
        System.out.println("Factory can't employ anymore.");
    }
    
    
    int getMaterialsCount() {
        int count = 0;
        for (int i = 0; i < materials.length; i++) {
            if (materials[i] != null) {
                count++;
            }
        }
        return count;
    }
    
    int getTotalPriceOfMaterials() {
        int sum = 0;
        for (int i = 0; i < materials.length; i++) {
            if (materials[i] != null) {
                sum += materials[i].price;
            }
        }
        return sum;
    }
    
    void removeMaterialsUnderPrice(int price) {
        for (int i = 0; i < materials.length; i++) {
            if (materials[i] != null && materials[i].price < price) {
                materials[i] = null;
            }
        }
    }
    
    /*
    Write a method for Factory that increases the price of a material 
    with given title by a given value. 
    If the price of the material is less than 5 increase it's price by additional 2.
    Return the total price increase. -> not final price
    */
    
    int increasePrice(String title, int value) {
        for (int i = 0; i < materials.length; i++) {
            if (materials[i] != null && materials[i].title == title) {
                if (materials[i].price < 5) {
                    materials[i].price += value + 2;
                    return value + 2;
                } else {
                    materials[i].price += value;
                    return value;
                }
                
            }
        }
        System.out.println("Factory does not have the given material.");
        return -1;
    
    }
    
    // 1. make sure that an employee with given name exists in the factory
    // 2. make sure that given mat exists in the factory
    // 3. emp -> mat
    void assignMaterial(String firstName, String lastName, Material mat) {
        Employee employee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null 
                    && employees[i].firstName == firstName 
                    && employees[i].lastName == lastName) {
                employee = employees[i];
            }
        }
        if (employee == null) {
            System.out.println("Employee with given name doesn't work here.");
            return;
        }
        
        Material material = null;
        for (int i = 0; i < materials.length; i++) {
            if (materials[i] != null && materials[i].title == mat.title) {
                material = materials[i];
            }
        }
        if (material == null) {
            System.out.println("Material doesn't exist in the factory.");
            return;
        }
        
        employee.addMaterial(material);
    }
    
    // DO IT YOURSELF: Write a method for Factory that lists the employees whose salary is higher than the total price of the materials they are responsible for.
}
