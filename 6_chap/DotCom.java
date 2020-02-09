import java.util.*;

public class DotCom {
	private ArrayList<String> locationsCells;
	private String name;
	
	public void setLocationCells(ArrayList<String> locs) {
		locationsCells = locs;
	}
	
	public void setName(String n) {
		name = n;
	}

	public String checkYourself (String stringGuess) {
		String result = "miss";
		int index = locationsCells.indexOf(stringGuess);
		if(index >= 0){
			locationsCells.remove(index);

			if (locationsCells.isEmpty()) {
				result = "kill";
			} else {
				result = "hit";
			} // close if
		}//close outer if
		//System.out.println(result);
		return result;
	} // close method
} // close class
