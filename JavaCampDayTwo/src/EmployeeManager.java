
public class EmployeeManager {

	public void add(Employee employee) {
		System.out.println("Çalýþan eklendi :" + employee.firstName);
	}

	public void delete(Employee employee) {
		System.out.println("Çalýþan iþten çýkarýldý : " + employee.firstName);
	}

	public void update(Employee employee) {
		System.out.println("Çalýþan bilgisi güncellendi : " + employee.Job);
	}

}
