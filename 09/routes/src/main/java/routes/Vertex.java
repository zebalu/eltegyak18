package routes;

public class Vertex {
	
	private final String name;
	
	public Vertex(String name) {
		if(null == name) {
			throw new IllegalArgumentException("Vertex must have a real name!");
		}
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "V<"+name+">";
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Vertex)) {
			return false;
		}
		Vertex v = (Vertex)o;
		return name.equals(v.name);
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
}