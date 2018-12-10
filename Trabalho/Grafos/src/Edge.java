/**
 * Classe Edge que armazena uma aresta a para b e o weight
 * 
 */
public class Edge {

	public Node a, b;
	public Node originA, originB;
	public Integer weight;

	public Edge() {
	}

	/**
	 * @param a
	 * @param b
	 * @param weight
	 */
	public Edge(Node a, Node b, Integer weight) {
		this.a = a;
		this.b = b;
		this.originA = a;
		this.originB = b;
		this.weight = weight;
	}

	/**
	 *
	 * To the edge(1,2), both nodes 1 and 2 contains the edges like (1,2). So we don't know which is p adjNode to 1 and 2 singly
	 *
	 * @param node
	 * @return
	 */
	public Node GetNextEnd(Node node) {
		if(a.equals(node))
			return b;
		else if(b.equals(node))
			return a;
		else if(originA.equals(node))
			return originB;
		else
			return originA;
	}	
}
