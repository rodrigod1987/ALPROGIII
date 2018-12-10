import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//Search: https://en.wikipedia.org/wiki/Graph_theory
public class Graph {
	public List<Node> nodes;
	public List<Edge> edges;
	public Integer nodeOfNodes;
	public Integer nodeOfEdges;
	public Map<Integer, Node> nodesHashMap;
	
	public List<Edge> mstTreeEdges;

	public Graph() {
		nodes = new LinkedList<Node>();
		edges = new LinkedList<Edge>();
		nodesHashMap = new HashMap<>();
		nodeOfNodes = 0;
		nodeOfEdges = 0;
		mstTreeEdges = new LinkedList<Edge>();

	}

	/**
	 * add nodes and edges to graph
	 * @param node1
	 * @param node2
	 * @param weigth
	 */
	public void AddNodeAndEdge(Node node1, Node node2, Integer weigth) {
		if(nodesHashMap.containsKey(node1.id)) {
			node1 = nodesHashMap.get(node1.id);
		} else {
			nodes.add(node1);
			nodesHashMap.put(node1.id, node1);
		}

		if(nodesHashMap.containsKey(node2.id)) {
			node2 = nodesHashMap.get(node2.id);
		} else {
			nodes.add(node2);
			nodesHashMap.put(node2.id, node2);
		}

		Edge edge = new Edge(node1, node2, weigth);
		edges.add(edge);	  // add edge in list
		node1.addAdjacentNode(edge); // add the list of ajacent matrix
		node2.addAdjacentNode(edge); // add the matrix of list of adjacent matrix
	}

	/**
	 * Kruskal
	 * Search link: https://pt.wikipedia.org/wiki/Algoritmo_de_Kruskal
	 */
	public void Kruskal() {

		Node ru, rv;
		for(Node node : nodes)
			MakeSet(node);

		//edges has been in descending order
		for(Edge edge : edges) {
			ru = Find(edge.originA);
			rv = Find(edge.originB);
			if(!ru.equals(rv)) {
				mstTreeEdges.add(edge);
				edge.originA.edgesMST.add(edge);
				edge.originB.edgesMST.add(edge);
				Union(ru,rv);
			}
		}
	}

	private void Union(Node ru, Node rv) {
		if(ru.rank > rv.rank)
			rv.parentMST = ru;
		else if(rv.rank > ru.rank)
			ru.parentMST = rv;
		else {
			rv.parentMST = ru;
			++ru.rank;
		}
	}

	private Node Find(Node node) {
		if(node.parentMST.equals(node))
			return node;
		return Find(node.parentMST);
	}

	private void MakeSet(Node node) {
		node.parentMST = node;
	}
}
