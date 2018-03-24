package LinkList;

import java.util.LinkedList;

public class LinkList {
	public static void main(String[]args) {
		LinkNode L=new LinkNode();
		for(int i=1;i<=10;i++)
		//	L.addNodeByHead(i);
			L.addNode(i);
		    L.Show();
		    System.out.println();
		    System.out.println(L.getLength());
		    L.remove(10);
		    L.Show();
		    System.out.println();
		    System.out.println(L.getLength());
		    L.addNode(9, 10);
		    L.addNode(5, 0);
		    L.Show();
		    System.out.println();
		    System.out.println(L.getLength());
		    LinkedList r=new LinkedList();
	}

}
