package routes;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.StringJoiner;

public class Graph<T extends Comparable<T>> {
	
	private final Set<Vertex> vertexes = new HashSet<>();
	private final Set<Edge<T>> edges = new HashSet<>();
	
	public void addVertex(Vertex v) {
		vertexes.add(v);
	}
	
	public void addEdge(Edge<T> e) {
		edges.add(e);
		vertexes.add(e.getTo());
		vertexes.add(e.getFrom());
		
	}
	
	public int getVertexCount() {
		return vertexes.size();
	}
	
	public boolean contains(Vertex v) {
		return vertexes.contains(v);
	}
	
	public boolean isThereAWay(Vertex from, Vertex to) {
		Queue<Edge<T>> fromEdges = new ArrayDeque<>();
		Set<Vertex> visited = new HashSet<>();
		fromEdges.addAll(getEdgesFrom(from));
		visited.add(from);
		while(fromEdges.peek() != null) {
			Edge<T> e = fromEdges.poll();
			System.out.println(e);
			if(e.getTo().equals(to)) {
				return true;
			} else if(!visited.contains(e.getTo())) {
				fromEdges.addAll(getEdgesFrom(e.getTo()));
			}
		}
		System.out.println("not found");
		return false;
	}
	
	private List<Edge<T>> getEdgesFrom(Vertex f) {
		List<Edge<T>> result = new ArrayList<>();
		for(Edge<T> e : edges) {
			if(e.getFrom().equals(f)) {
				result.add(e);
			}
		}
		return result;
	}
	
	@Override
	public String toString() {
		StringJoiner sj = new StringJoiner("\n");
		vertexes.stream().sorted().forEach(v -> sj.add(v.toString()));
		edges.stream().sorted().forEach(e->sj.add(e.toString()));
		return sj.toString();
	}
	
}