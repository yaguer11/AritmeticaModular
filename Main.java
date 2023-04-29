class Main {
  public static void main(String[] args) {
    
    Employee employeeOne = new Employee(245643,"German",50000);
    Employee employeeTwo = new Employee(245981,"Adriana",250000);
    Employee employeeThree = new Employee(257135,"Carlos",1000000);

    Table tableHash = new Table();

    tableHash.Insert(employeeOne);
    tableHash.Insert(employeeTwo);
    tableHash.Insert(employeeThree);

    System.out.println("------------------------");
    System.out.println(" Función de dispersión");
    System.out.println(" [ Aritmética Modular ]");
    System.out.println("------------------------");
    tableHash.ShowTable();
 
  }
}