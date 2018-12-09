package routes;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GraphTest {
	
	@Test
	public void addNewVertexIncreaseVertexsCount() {
		Graph g = new Graph();
		int countBefore = g.getVertexCount();
		g.addVertex(new Vertex("a"));
		assertEquals("size is greater with 1 after add", countBefore+1, g.getVertexCount());
	}
	
	@Test
	public void addSameVertexDoesNotIncreaseVertexCount() {
		Graph g = new Graph();
		g.addVertex(new Vertex("a"));
		int countBefore = g.getVertexCount();
		g.addVertex(new Vertex("a"));
		assertEquals(countBefore, g.getVertexCount());
	}
	
	@Test
	public void vertexIsFoundInGraph() {
		Graph g = new Graph();
		g.addVertex(new Vertex("a"));
		assertTrue(g.contains(new Vertex("a")));
	}
	
	@Test
	public void missingVertexIsNotFoundInGraph() {
		Graph g = new Graph();
		assertFalse(g.contains(new Vertex("a")));
	}
	
	@Test
	public void edgeIsFound() {
		Graph<Integer> g = new Graph<>();
		g.addEdge(new Edge<Integer>(new Vertex("a"), new Vertex("b"), 1));
		g.addEdge(new Edge<Integer>(new Vertex("b"), new Vertex("c"), 1));
		assertTrue(g.isThereAWay(new Vertex("b"), new Vertex("c")));
	}
	
	@Test
	public void wayIsFound() {
		Graph<Integer> g = new Graph<>();
		g.addEdge(new Edge<Integer>(new Vertex("a"), new Vertex("b"), 1));
		g.addEdge(new Edge<Integer>(new Vertex("b"), new Vertex("c"), 1));
		assertTrue(g.isThereAWay(new Vertex("a"), new Vertex("c")));
	}
	@Test
	public void notExistingWayIsNotFound() {
		Graph<Integer> g = new Graph<>();
		g.addEdge(new Edge<Integer>(new Vertex("a"), new Vertex("b"), 1));
		g.addEdge(new Edge<Integer>(new Vertex("b"), new Vertex("a"), 1));
		assertFalse(g.isThereAWay(new Vertex("a"), new Vertex("c")));
	}
	
	@Test
	public void graphToString() {
		Graph<Integer> g = new Graph<>();
		g.addEdge(new Edge<Integer>(new Vertex("a"), new Vertex("b"), 1));
		g.addEdge(new Edge<Integer>(new Vertex("b"), new Vertex("c"), 1));
		assertEquals("V<a>\n"+"V<b>\n"+"V<c>\n"+"V<a> --> V<b>\n"+"V<b> --> V<c>", g.toString());
	}
}