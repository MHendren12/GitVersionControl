public class BeerSong {

	public static void main(String[] args) {
	}
	
	public static void Ninety_Nine_Bottles_Of_Beer(){
		for(int i = 99; i > 0; i--){
			if(i>1)
				System.out.println(i + " bottles of beer on the wall, " +i +" bottles of beer\n"
						+ "take one down pass it around " +(i-1) + " bottle of beer on the wall.");
			else
				System.out.println(i + " bottle of beer on the wall, " +i +" bottles of beer\n"
						+"take one down pass it around, no more bottles of beer on the wall");
		}
	}
}
