import java.util.ArrayList;

public class DotCom {
	private ArrayList<String> locationsCells;
	int numOfHits = 0;
	
	public void setLocationCells(ArrayList<String> locs) {
		locationsCells = locs;
	}
	
	public String checkYourself (String stringGuess) {
		String result = "miss";
		int index = locationsCells.indexOf(stringGuess);
		if(index >= 0){
			locationsCells.remove(index);

			if (locationsCells.isEmmpty()) {
				result = "kill";
			} else {
				result = "hit";
			} // close if
		}//close outer if
		System.out.println(result);
		return result;
	} // close method
} // close class
