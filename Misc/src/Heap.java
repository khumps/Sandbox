public class Heap<E extends Comparable> {
	private HeapNode head;
	private int numElements;
	public Heap(E item) {
		head = new HeapNode(item, null, null, null);
		numElements = 1;
	}

	private class HeapNode {
		private E item;
		private HeapNode root;
		private HeapNode left;
		private HeapNode right;

		public HeapNode(E item, HeapNode root, HeapNode left, HeapNode right) {
			this.item = item;
			this.root = root;
			this.left = left;
			this.right = right;
		}

		public HeapNode(HeapNode h, HeapNode root) {
			item = h.item;
			this.root = root;
			left = h.left;
			right = h.right;
		}

	}

	public void fix() {
		fix(head);
	}

	public void fix(HeapNode node) {
		if (node != null) {
			if (node.left.item.compareTo(node.root.item) > 0) {
				swap(node, node.root);
				}
			fix(node.left);
			fix(node.right);
		}
	}

	private void swap(Heap<E>.HeapNode n1, Heap<E>.HeapNode n2) {
		HeapNode temp = new HeapNode(n1, n2.root);
		n1 = new HeapNode(n2, n1.root);
		n2 = temp;
	}
	
	public void add(E item)
	{
		numElements++;
		
		
	}
	
	public HeapNode findNext()
	{
		return 
	}

}
