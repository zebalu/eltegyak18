package routes;

import org.junit.*;
import static org.junit.Assert.*;

public class VertexTest {
		
	@Test
	public void creationGetsName() {
		Vertex v = new Vertex("test");
		assertEquals("test", v.getName());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void nullNameIsNotAllowed() {
		new Vertex(null);
	}
	
	@Test
	public void toStringContainsName() {
		Vertex ts = new Vertex("test");
		assertEquals("V<test>", ts.toString());
	}
	
	@Test
	public void vertexesAreEqualIfNameIsTheSame() {
		Vertex v1 = new Vertex("a");
		Vertex v2 = new Vertex("a");
		assertTrue(v1.equals(v2));
	}
	
	@Test
	public void vertexesAreNotEqualIfNameIsDifferent() {
		Vertex v1 = new Vertex("a");
		Vertex v2 = new Vertex("b");
		assertFalse(v1.equals(v2));
	}
	
	@Test
	public void vertexesShareHashCodeIfEqual() {
		Vertex v1 = new Vertex("a");
		Vertex v2 = new Vertex("a");
		assertTrue(v1.hashCode() == v2.hashCode());
	}
}