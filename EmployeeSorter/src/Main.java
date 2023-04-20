import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println ("Enter an Sorting preference: 1 for id or 2 for name");
		int option = scanner.nextInt ();
		
		
		List<Employee> employees = new ArrayList<> ();
		employees.add (new Employee (1,"Mughees"));
		employees.add (new Employee (2,"Ahmar"));
		employees.add (new Employee (3,"Bari"));
		employees.add (new Employee (4,"Kamran"));
		
		if (option == 1){
			Comparator<Employee> byId = Comparator.comparing (e -> e.id);
			Collections.sort (employees,byId);
		} else if (option == 2){
			Comparator<Employee> byName = Comparator.comparing (e -> e.name);
			Collections.sort (employees,byName);
		} else {
			System.out.println ("Invalid input");
		}
		System.out.println (employees);
	}
}