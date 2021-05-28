package codingTest;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee j = new Employee();
		j.name="제니";
		
		Manager k = new Manager();
		k.name="권지용";
		
		j.Operation();
		k.Operation();
		k.Management();
	}

}
