package pathFinding;

public class pathFinder {
	
	
	private int currentX;
	private int currentY;
	boolean moveX = false, moveY = false;
	static int nStartX; 
	static int nStartY;
    static int nTargetX;
    static int nTargetY;
    int[] pMap;
    static int nMapWidth;
    static int nMapHeight;
    int[] pOutBuffer;
    int nOutBufferSize;
	
	public int findPath(final int nStartX, int nStartY,
            final int nTargetX, final int nTargetY, 
            int[] pMap, final int nMapWidth, final int nMapHeight,
            int[] pOutBuffer, final int nOutBufferSize) {
		pathFinder.nStartX = nStartX;
		pathFinder.nStartY = nStartY;
		pathFinder.nTargetX = nTargetX;
		pathFinder.nTargetY = nTargetY;
		this.pMap = pMap;
		pathFinder.nMapWidth = nMapWidth;
		pathFinder.nMapHeight = nMapHeight;
		this.pOutBuffer = pOutBuffer;
		this.nOutBufferSize = nOutBufferSize;
		
		currentX = nStartX;
		currentY = nStartY;
		
		if(Math.abs(nStartX-nTargetX) >= Math.abs(nStartY-nTargetY)) {
			currentX = moveX();
			updateBuffer(currentX, currentY);
		}else {
			currentY = moveY();
		}
		
		return 0;
	}

	private int moveX() {
		return 0;
	}
	
	private int moveY() {
		return 0;
	}

	private void updateBuffer(int currentX, int currentY) {
		
	}
}
