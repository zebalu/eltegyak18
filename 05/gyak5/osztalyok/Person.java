package osztalyok;

public class Person {
	
	private String lastName;
	private String firstName;
	private Id id;
	
	public Person(String lastName, String firstName, Id id) {
		this.lastName=lastName;
		this.firstName=firstName;
		this.id=id;
	}
	
	@Override
	public String toString() {
		return lastName+", "+firstName;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Person)) {
			return false;
		}
		Person p = (Person)o;
		return p.id.equals(id);
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}

	
}