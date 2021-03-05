package q1.extract_method.refactored;

import java.util.List;


public class A {
	Node m1(List<Node> nodes, String p) {
		System.out.println("Executed for Node");
		ex(nodes, p);
		return null;
	}

	Edge m2(List<Edge> edgeList, String p) {
		System.out.println("Executed for Edge");
		ex(edgeList, p);
		return null;
	}
	
	<T extends Graph> void ex(List<T> objs, String p)
	{
		for (T obj : objs)
		{
			if (obj.contains(p))
			{
				System.out.println(obj);
			}
		}
	}
}

class Graph
{
	String name;
	boolean contains(String p)
	{
		return name.contains(p);
	}
}

class Node extends Graph
{
	public void setName(String newName)
	{
		this.name = newName;
	}
	
	String name;

	public boolean contains(String p) {
		return name.contains(p);
	}
}

class Edge extends Graph
{
   String name;

	public void setName(String newName)
	{
		this.name = newName;
	}
	
   public boolean contains(String p) {
       return name.contains(p);
   }
}