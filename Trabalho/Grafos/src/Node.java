import java.util.LinkedList;
import java.util.List;

public class Node {

	public Integer id;
	public List<Edge> adjacentEdges;

	public Node parentMST;
	public Integer rank;
	public List<Edge> edgesMST;
	public double L;

	public Node(Integer id) {
		this.id = id;
		adjacentEdges = new LinkedList<>();
		parentMST = null;
		rank = 0;
		edgesMST = new LinkedList<Edge>();
		L = 0;
	}

	/**
	 * add edge
	 * @param adj
	 */
	public void addAdjacentNode(Edge adj) {
		this.adjacentEdges.add(adj);
	}
}