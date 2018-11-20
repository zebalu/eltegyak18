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
}