package composite;
import java.util.ArrayList;
import java.util.List;

import beans.Employee;
import composite.EmployeeComponent;

public class TeamLead implements EmployeeComponent {
	private String nom;
	private List<Employee> teamMembers = new ArrayList<>();
	 public TeamLead(String nom) {
	        this.nom = nom;
	    }
	    @Override
	    public void work() {
	        System.out.println(nom + " is managing the team.");
	    }
		@Override
		public String getNom() {
	        return nom;
	    }

		public void addTeamMember(Employee employee) {
	        teamMembers.add(employee);
	    }
}
