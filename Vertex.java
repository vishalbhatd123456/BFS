package BreadthFirstSearch;
import java.util.*;
public class Vertex {
	private int data;
	boolean visited;
	private List<Vertex> neighbourList;

	public Vertex(int data)
	{
		this.data = data;this.neighbourList = new ArrayList<Vertex>(); //allocate the instance or reference the memory
		
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getNeighbourList() {
		return neighbourList;
	}

	public void setNeighbourList(List<Vertex> neighbourList) {
		this.neighbourList = neighbourList;
	}
	public void addNeighbourVertex(Vertex vertex)
	{
		this.neighbourList.add(vertex);
	}
	public String toString()
	{
		return " "+this.data;
	}
	
	
}
