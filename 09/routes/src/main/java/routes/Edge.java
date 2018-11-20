package routes;

public class Edge {
	
	private final Vertex from;
	private final Vertex to;
	
	public Edge(Vertex from, Vertex to) {
		if(from == null || to == null) {
			throw new IllegalArgumentException("vertexes must not be null");
		}
		if(from.equals(to)) {
			throw new IllegalArgumentException("Edges can not be created on same ends");
		}
		this.from=from;
		this.to=to;
	}
	
	public Vertex getFrom() {
		return from;
	}
	
	public Vertex getTo() {
		return to;
	}
	
	@Override
	public String toString() {
		return from.getName() + " --> " + to.getName();
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Edge)) {
			return false;
		}
		Edge e = (Edge)o;
		return from.equals(e.from) && to.equals(e.to);
	}
	
	@Override
	public int hashCode() {
		int prime = 37;
		int result = 0;
		result += from.hashCode() * prime;
		result *= prime;
		result += to.hashCode() * prime;
		return result;
	}
}