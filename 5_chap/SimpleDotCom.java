public class SimpleDotCom {
	int[] locationsCells;
	int numOfHits = 0;
	
	public void setLocationCells(int[] locs) {
		locationsCells = locs;
	}
	
	public String checkYourself (String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for (int cell : locationsCells) {
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
		} // out of loop
		
		if (numOfHits == locationsCells.length) {
			result = "kill";
		}
		
		System.out.println(result);
		return result;
	} // close method
} // close class