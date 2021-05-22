public class Main {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "Sevtap", "Beran", "Bilgisayar Mühendisi");
		Employee employee2 = new Employee(2, "Serap", "Beran", "Bilgisayar Mühendisi");
		Employee employee3 = new Employee(3, "Aslý", "Morgil", "Avukat");

		Employee[] employees = { employee1, employee2, employee3 };

		for (Employee employee : employees) {
			System.out.println(employee.firstName + " iþe baþladý");

		}

		Category category1 = new Category();
		category1.id = 1;
		category1.classification = "Mavi Yaka";

		Category category2 = new Category();
		category2.id = 2;
		category2.classification = "Beyaz Yaka";

		Category[] categories = { category1, category2 };
		for (Category category : categories) {
			System.out.println(category.classification);
		}

		EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.add(employee1);
		employeeManager.delete(employee2);
		employeeManager.update(employee3);

	}

}
