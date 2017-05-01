package student;

import student.Group;

public class Student {
	private String firstName;
	private String lastName;
	private double rank;
	private Group group;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getRank() {
		return rank;
	}

	public void setRank(double rank) {
		this.rank = rank;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((group == null) ? 0 : group.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		Student other = null;
		if (obj instanceof Student) {
			other = (Student) obj;
		}
		return firstName.equals(other.firstName) && lastName.equals(other.lastName) && group.equals(other.group);
	}

	public boolean lessThan(double lowBoundary) {
		return rank <= lowBoundary;
	}

	@Override
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName + ", rank=" + rank + ", group=" + group;
	}
}
