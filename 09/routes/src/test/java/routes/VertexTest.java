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
	
	@Test
	public void goodOrderIsSigned() {
		Vertex v1 = new Vertex("a");
		Vertex v2 = new Vertex("b");
		
		assertTrue(v1.compareTo(v2) < 0);
	}
	
	@Test
	public void badOrderIsSigned() {
		Vertex v1 = new Vertex("a");
		Vertex v2 = new Vertex("b");
		
		assertTrue(v2.compareTo(v1) > 0);
	}
	
	@Test
	public void sameOrderIsSigned() {
		Vertex v1 = new Vertex("a");
		Vertex v2 = new Vertex("a");
		
		assertTrue(v1.compareTo(v2) == 0);
	}
}