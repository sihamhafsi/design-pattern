package composite;

import beans.Employee;

public class composite {

	public static void main(String[] args) {
		 Employee john = new Employee("John");
	     Employee sarah = new Employee("Sarah");
	     TeamLead manager = new TeamLead("Manager");
	     TeamLead manager1 = new TeamLead("Manager");
	      manager.addTeamMember(john);
	      manager1.addTeamMember(sarah);
	}

}
