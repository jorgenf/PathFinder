package pathFinding;

public class Tree {
	private int width;
	private int height;
	Node startNode;

	public Tree(int width, int height) {
		this.width = width;
		this.height = height;
	}

	private class Node{
		int traversable;
		int posX;
		int posY;
		Node parentL;
		Node parentR;
		Node childL;
		Node childR;
		
		Node(int posX, int posY, int traversable){
			this.posX = posX;
			this.posY = posY;
			this.traversable = traversable;
			if(posX == 0) {
				parentL = null;
			}
			if(posY == 0) {
				parentR = null;
			}
			if(posX == pathFinder.nMapWidth) {
				childR = null;
			}
			if(posY == pathFinder.nMapHeight) {
				childL = null;
			}
				
		}
	}
	
	public void fillTree(int[] pMap, int nMapWidth, int nMapHeight) {
		boolean start = true;
		int x = 0, y = 0;
		Node currentNode = startNode;
		int count = 0;
		for(int node : pMap) {
			if(start) {
				startNode = new Node(0,0, node);
				start = false;
				count++;
				break;
			}
			if(x <= nMapWidth)
			currentNode.childR = new Node(x, y, node);
			
			
		}
	}
}
