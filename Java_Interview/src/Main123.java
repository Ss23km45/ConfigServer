import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Main123
{
  public static void main(String args[])
  {
    HashSet<Integer> hash_set1 = new HashSet<Integer>();
    hash_set1.add(1);
    hash_set1.add(8);
    hash_set1.add(5);
    hash_set1.add(3);
    hash_set1.add(0);

    HashSet<Integer> hash_set2 = new HashSet<Integer>();
    hash_set2.add(1);
    hash_set2.add(0);
    hash_set2.add(8);
    hash_set2.add(3);
    hash_set2.add(5);

    HashSet<Integer> hash_set3 = new HashSet<Integer>();
    hash_set3.add(1);
    hash_set3.add(7);
    hash_set3.add(5);
    hash_set3.add(2);
    hash_set3.add(8);
    
    
	/*
	 * HashSet<Employee1> empList = new HashSet<>(); empList.add(new
	 * Employee1(4,"A")); empList.add(new Employee1(1,"A")); empList.add(new
	 * Employee1(2,"C")); empList.add(new Employee1(3,"B"));
	 */
	
	Set<Employee1> empList1 = new TreeSet<>();
	empList1.add(new Employee1(4,"A"));
	empList1.add(new Employee1(4,"A"));
	empList1.add(new Employee1(2,"C"));
	empList1.add(new Employee1(3,"B"));
	
	System.out.println(empList1 + "  With Size " + empList1.size());
	
//	List<Employee> emp = empList.c

//    System.out.println("hash_set1 is equal to hash_set2? : " + empList1.equals(empList));

    System.out.println("hash_set2 is equal to hash_set3? : " + hash_set2.equals(hash_set3));
  }
  
}


class Employee1 implements Comparable<Employee1>{
	    
	    int id;
	    String name;
		public Employee1(int id, String name) {
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
	    return "Employee1{" +
	        "id=" + id +
	        ", name='" + name + '\'' +
	        '}';
		}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		return Objects.equals(name, other.name);
	}
	@Override
	public int compareTo(Employee1 o) {
		Employee1 other = (Employee1) o;
		if(Objects.equals(name, other.name)) {
			return 0;
		}
		return 1;
	}
	  
	  
		
	}