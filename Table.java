
class Table {
  
  Employee[] m;
  
  public Table() {
    this.m = new Employee[997];
  }

  public double Aritmetica_Modular(int x){
    return (x % 997);
  }
  
  public void Insert(Employee newEmployee) {
    
  int position = (int) Aritmetica_Modular(newEmployee.id);
  if (m[position] == null) {
    m[position] = newEmployee;
  } else {
    int i = 1;
    while (m[(position + i) % m.length] != null) {
      i++;
    }
    m[(position + i) % m.length] = newEmployee;
  }
}
  public void ShowTable() {
    for (int i = 0; i < m.length; i++) {
      if (m[i] != null) {
        System.out.println("[" + i + "]: " + m[i].name + " (ID: " + m[i].id + ")");
      }
    }
  }
  
}     