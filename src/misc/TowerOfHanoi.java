package misc;

public class TowerOfHanoi {
	
	static int z = 0;
	private void towerRearrange(int discCount, char fromDisc, char toDisc, char auxDisc) {

		if(discCount == 1) {
			
			System.out.println("Moving from " + fromDisc + " to " + toDisc );
			return;
		}

		towerRearrange(discCount-1, fromDisc, auxDisc, toDisc);
		
		System.out.println("Moving from "+ fromDisc + " to " + toDisc);
		
		towerRearrange(discCount-1, auxDisc, toDisc, fromDisc);
		
//		System.out.println("Moving from " + auxDisc + " to " + toDisc);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TowerOfHanoi hanoi1 = new TowerOfHanoi();
		int numberOfDisc = 2;
		
		hanoi1.towerRearrange(numberOfDisc, 'F', 'T', 'A');
	}

}
/**
class ManipulateTOH {
	char fromTower, auxTower, toTower;
	int diskCount;
	private ManipulateTOH (char fromTower, char auxTower, char toTower, int diskCount) {
		this.fromTower = fromTower;
		this.auxTower = auxTower;
		this.toTower = toTower;
		this.diskCount = diskCount;
	}

	 protected int rearrangeTower () {
		if ()
	}
}
**/