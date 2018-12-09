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
		e = new Edge<Long>(from, to, 7L);
	}
	
	
	@Test
	public void creationKeepsFromAndTo() {
		Edge e = new Edge(new Vertex("apple"), new Vertex("pear"), 2);
		Assert.assertEquals(new Vertex("apple"), e.getFrom());
		Assert.assertEquals(new Vertex("pear"), e.getTo());
	}
	
	@Test
	public void toStringReturnsReadableString() {
		Assert.assertEquals("V<a> --> V<b>", e.toString());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void canNotCreateEdgeOnNullFrom() {
		new Edge(null, to, 4);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void canNotCreateEdgeOnNullTo() {
		new Edge(from, null, 4);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void canNotCreateEdgeWithSameFromAndTo() {
		new Edge(from, from, 4);
	}
	
	@Test
	public void sameEdgesAreEqual() {
		Edge other = new Edge(from, to, 4L);
		Assert.assertTrue(e.equals(other));
	}
	
	@Test
	public void differentEdgesAreNotEqual() {
		Edge other = new Edge(to, from, 4L);
		Assert.assertFalse(e.equals(other));
	}
	
	@Test
	public void equalEdgesShareHasCode() {
		Edge other = new Edge(from, to, 4L);
		Assert.assertTrue(e.hashCode() == other.hashCode());
	}
	
	@Test
	public void goodOrdering() {
		Edge other = new Edge(to, from, 2L);
		Assert.assertTrue(e.compareTo(other) <  0);
	}
	
	@Test
	public void badOrdering() {
		Edge other = new Edge(to, from, 2L);
		Assert.assertTrue(other.compareTo(e) >  0);
	}
	
	@Test
	public void irrelevantOrdering() {
		Edge other = new Edge(from, to, 7L);
		Assert.assertTrue(e.compareTo(other) ==  0);
	}
	
	@Test
	public void cheaperRoutIsCmoparedGood() {
		Edge other = new Edge(from, to, 9L);
		Assert.assertTrue(e.compareTo(other) <  0);
	}
}