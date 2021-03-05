package q1.extract_method.refactored;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class test {
	@Test
	public void test()
	{
		List<Node> nodes = new ArrayList<>();
		Node a = new Node();
		a.setName("abcde");
		Node b = new Node();
		b.setName("abc");
		nodes.add(a);
		nodes.add(b);
		
		List<Edge> edges = new ArrayList<>();
		Edge c = new Edge();
		Edge d = new Edge();
		c.setName("abcde");
		d.setName("abc");
		edges.add(c);
		edges.add(d);
		A t1 = new A();
		t1.m1(nodes, "d");
		System.out.println();
		t1.m2(edges, "a");
	}
}
