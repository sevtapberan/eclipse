
public class EmployeeManager {

	public void add(Employee employee) {
		System.out.println("�al��an eklendi :" + employee.firstName);
	}

	public void delete(Employee employee) {
		System.out.println("�al��an i�ten ��kar�ld� : " + employee.firstName);
	}

	public void update(Employee employee) {
		System.out.println("�al��an bilgisi g�ncellendi : " + employee.Job);
	}

}
