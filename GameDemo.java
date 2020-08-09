abstract class game{
	void play() {
		
	}
	
}
class cricket extends game{
	public void play() {
		System.out.println("Playing cricket...");
	}
	
}
class football extends game{
	public void play() {
		System.out.println("Playing football...");
	}
	
}
class tennis extends game{
	public void play() {
		System.out.println("Playing tennis...");
	}
	
}
public class GameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		game arr[]=new game[3];
		arr[0]=new cricket();
		arr[1]=new football();
		arr[2]=new tennis();
		for(int i=0;i<arr.length;i++) {
			arr[i].play();
		}

	}

}
