import java.util.*;
public class DotComGame {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;

	private void setUpGame() {
		//first make some dot coms and give them locations
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		dotComList.add(one);
		dotComList.add(two);
		dotComList.add(three);
		
		System.out.println("Your gal is to sink the three dot coms.");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses");
		
		for (DotCom dotComSet : dotComList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComSet.setLocationCells(newLocation);
		} // close for loop
	} // close setUpGame method

	private void startPlaying() {
		while (!dotComList.isEmpty()) {
			String userGuess = helper.getUserInput("enter a number");
			checkUserGuess(userGuess);
		} // close while
		finishGame();
	} // close startPlaying method

	private void checkUserGuess(String userGuess) {
		numOfGuesses++;
		String result = "miss";

		for (DotCom dotComToTest : dotComList) {
			result = dotComToTest.checkYourself(userGuess);
			if (result.equals("hit")){
				break;
			}
			if (result.equals("kill")){
				dotComList.remove(dotComToTest);
				break;
			}
		} // close for
		System.out.println(result);
	} // close method

	private void finishGame() {
		System.out.println("All Dot Coms are dead! You stock is now worthless.");
		if (numOfGuesses <= 18) {
			System.out.println("It only took you " + numOfGuesses + " guesses.");
			System.out.println("You got out before your options sank.");
		} else {
			System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
			System.out.println("Fish are dancing with your options.");
		}
	} // close method

	public static void main (String[] args) {
		DotComGame game = new DotComGame();
		game.setUpGame();
		game.startPlaying();
	} // close main
} // close class
