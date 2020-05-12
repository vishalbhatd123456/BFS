package BreadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	public void bfs(Vertex root)
	{
		//FIFO STRUCTURE
		Queue<Vertex> queue = new LinkedList<>();
		
		root.setVisited(true);
		queue.add(root);
		while(!queue.isEmpty()){
			Vertex actualvertex = queue.remove();
			System.out.println(actualvertex+"  ");
			
			
			for(Vertex v : actualvertex.getNeighbourList())
			{
				if(!v.isVisited())
				{
					v.setVisited(true);
					queue.add(v); //add the unexplored neighbours
				}
			}
		}
		
	}

}

