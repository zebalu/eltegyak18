package routes;

import java.util.Set;
import java.util.HashSet;

public class Graph {
	
	private final Set<Vertex> vertexes = new HashSet<>();
	private final Set<Edge> edges = new HashSet<>();
	
	public void addVertex(Vertex v) {
		vertexes.add(v);
	}
	
	public int getVertexCount() {
		return vertexes.size();
	}
	
	public boolean contains(Vertex v) {
		return vertexes.contains(v);
	}
	
}