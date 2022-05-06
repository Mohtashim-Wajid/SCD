package q2;

public class Control {
	int headCount = 0;
	int inside = 0;
	int waiting = 0;
	public int show() {
		return inside;
	}
	public int add() throws CustomExecp{
		try {
			if(headCount == 10) {
			throw new CustomExecp("count OVerflow");
			}
		}
		catch (CustomExecp e) {
			System.out.println("exception caught");
		}
		
		if(headCount >= 0 && headCount <10) {
			headCount ++;
			return 1;
		}else {
			return 0;
		}
		
	}
	
	public int remove() throws CustomExecp{
		try {
			if(headCount == 0) {
				throw new CustomExecp("Count underflow");
			}
			
		}catch(CustomExecp e) {
				System.out.println("Exception caught");
			}
		
		if(headCount >= 0 && headCount <=10) {
			headCount --;
			return 1;
		}
		else {
			return 0;
		}
		
	}
	public void resetCount() {
		headCount = 0;
	}
}
