public class ExtraFunctions {

	public Graph root;
	public Node rootNode;

	/**
	 * Construtor Ṕadrão
	 */
	public ExtraFunctions() {
		root = new Graph();
		rootNode = null;
	}

	/**
	 * Analisa a primeira linha de entrada
	 * @param line
	 */
	public void ReadFirstLine(String line) {
		String splitStr[] = line.split("\\s+");
		root.nodeOfNodes = Integer.parseInt(splitStr[0]);
		root.nodeOfEdges = Integer.parseInt(splitStr[1]);
	}

	/**
	 * Analisar as linhas restantes da entrada
	 * @param str
	 */
	public void AddToGraph(String str) {
		String splitStr[] = str.trim().split("\\s+");

		Node a, b;
		Integer id1 = Integer.parseInt(splitStr[0]);
		Integer id2 = Integer.parseInt(splitStr[1]);
		if(root.nodesHashMap.containsKey(id1)) {
			a = root.nodesHashMap.get(id1);
		} else {
			a = new Node(id1);
		}
		if(root.nodesHashMap.containsKey(id2)) {
			b = root.nodesHashMap.get(id2);
		} else {
			b = new Node(id2);
		}

		if(rootNode == null) {
			rootNode = a;
		}

		//add Node and Edge (shows in console)
		root.AddNodeAndEdge(a,b, Integer.parseInt(splitStr[2]));
	}

	public Double Cost(Double cost){
		for(Edge edge : root.mstTreeEdges) {
			 cost+= edge.weight;
		}
		return cost;
	}
	
	public void Execute() {

		 // 1) Kruskal to fing the MST
		 
		Integer custo =0;
		root.Kruskal();						// mstTree have the edges of MST tree
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("\nEdges in MST Tree by Kruskal Algorithm :");
		for(Edge edge : root.mstTreeEdges) {
			System.out.println("(" + edge.a.id + "," + edge.b.id + ") = " + edge.weight);
			custo = custo + edge.weight;
		}
		System.out.println("\n---------------------------------------------------------------------------------------------------------");
		System.out.println("Cost :"+ custo);
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
	}
}
