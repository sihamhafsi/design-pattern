package beans;

public class Mement {

	public static void main(String[] args) {
		Employee employee = new Employee(1, "John");
        EmployeeMemento memento = employee.saveToMemento();
        employee.setNom("ahmed");
        employee.restoreFromMemento(memento);

	}
}
