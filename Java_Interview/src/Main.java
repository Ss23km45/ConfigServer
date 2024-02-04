import java.util.*;

class Main {

	public static void main(String[] args) {
	    
	    List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(4,"A"));
		empList.add(new Employee(1,"A"));
		empList.add(new Employee(2,"C"));
		empList.add(new Employee(3,"B"));
		
		Comparator<Employee> compEmp = (e1, e2) -> {
			if(e1.getName().equals(e2.getName())) {
				return e1.getId() - e2.getId();
			}
			
			return e1.getName().compareTo(e2.getName());
		};
		
		Collections.sort(empList, compEmp);
		
	    System.out.println(empList);
		//Output:
	   /* 1,A
	    4,A
	    3,B
	    2,C*/
	    
	    
	}
}


class Employee {
    
    int id;
    String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
	}
	
}