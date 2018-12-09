package routes;

import java.io.FileWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		Graph<Integer> g = new Graph<>();
		Vertex v1 = new Vertex("a");
		Vertex v2 = new Vertex("b");
		Edge<Integer> e = new Edge<>(v1, v2, 7);
		g.addEdge(e);
		FileWriter fw = new FileWriter("output.txt");
		GraphExporter.writeOut(g, fw);
		fw.close();
	}
}