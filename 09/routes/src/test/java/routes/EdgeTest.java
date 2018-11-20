package routes;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class EdgeTest {
	
	private Vertex from;
	private Vertex to;
	private Edge e;
	
	@Before
	public void initTest() {
		from = new Vertex("a");
		to = new Vertex("b");
		e = new Edge(from, to);
	}
	
	
	@Test
	public void creationKeepsFromAndTo() {
		Edge e = new Edge(new Vertex("apple"), new Vertex("pear"));
		Assert.assertEquals(new Vertex("apple"), e.getFrom());
		Assert.assertEquals(new Vertex("pear"), e.getTo());
	}
	
	@Test
	public void toStringReturnsReadableString() {
		Assert.assertEquals("a --> b", e.toString());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void canNotCreateEdgeOnNullFrom() {
		new Edge(null, to);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void canNotCreateEdgeOnNullTo() {
		new Edge(from, null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void canNotCreateEdgeWithSameFromAndTo() {
		new Edge(from, from);
	}
	
	@Test
	public void sameEdgesAreEqual() {
		Edge other = new Edge(from, to);
		Assert.assertTrue(e.equals(other));
	}
	
	@Test
	public void differentEdgesAreNotEqual() {
		Edge other = new Edge(to, from);
		Assert.assertFalse(e.equals(other));
	}
	
	@Test
	public void equalEdgesShareHasCode() {
		Edge other = new Edge(from, to);
		Assert.assertTrue(e.hashCode() == other.hashCode());
	}
}