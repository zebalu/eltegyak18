package routes;

public class Edge<T extends Comparable<T>> implements Comparable<Edge<T>> {
	
	private final Vertex from;
	private final Vertex to;
	private final T cost;
	
	public Edge(Vertex from, Vertex to, T cost) {
		if(from == null || to == null) {
			throw new IllegalArgumentException("vertexes must not be null");
		}
		if(from.equals(to)) {
			throw new IllegalArgumentException("Edges can not be created on same ends");
		}
		this.from=from;
		this.to=to;
		this.cost = cost;
	}
	
	public Vertex getFrom() {
		return from;
	}
	
	public Vertex getTo() {
		return to;
	}
	
	public T getCost() {
		return cost;
	}
	
	@Override
	public String toString() {
		return from.toString() + " --> " + to.toString();
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
	
	@Override
	public int compareTo(Edge<T> other) {
		int fromCompare = from.compareTo(other.from);
		if(fromCompare == 0) {
			int toCompare = to.compareTo(other.to);
			if(toCompare == 0) {
				return cost.compareTo(other.cost);
			}
			return to.compareTo(other.to);
		}
		return fromCompare;
	}
}