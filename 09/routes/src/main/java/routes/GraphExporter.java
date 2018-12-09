package routes;

import java.io.Writer;
import java.io.IOException;

public class GraphExporter {
	
	public static void writeOut(Graph<?> g, Writer w) throws IOException {
		w.write(g.toString());
		w.flush();
	}
}