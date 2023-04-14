package com.aa.act.interview.org;

import java.util.Optional;
//new imports
import java.util.HashMap;
import java.util.Map;

public abstract class Organization {

	private Position root;
	

	protected abstract Position createOrganization();

	//creating a hashmap
	private Map<String, Position> positions;
	public Organization(){
		positions = new HashMap<>();
		//had to include this down here otherwise would throw a null point execption
		root = createOrganization();
	}
	/**
	 * hire the given person as an employee in the position that has that title
	 * 
	 * @param person
	 * @param title
	 * @return the newly filled position or empty if no position has that title
	 */

	/* Dear Reader,
		Thank you very much for this opportunity. I had somewhat limited time (~24hrs) to work on this project to be upfront.
		Most of that time was spent getting the "javac" command to run on my system. I had to create a new PATH in my system's
		environment variables, which then in turn messed up the terminal on my IDE. I spent awhile fixing that issue by finding the right
		.exe in my system. After all the settings were fixed, my minimal time turned into even less. I spent more time fixing my settings than
		I was able to on the code, and wanted to communicate that to whomever is reading this. :)

		EDIT: I was graciously given a little more time to work through this, and with a fresh mind got it to compile and made
		decent progress compared to my last run. I am so grateful for this opportunity!
		* */

	public Optional<Position> hire(Name person, String title) {
		Position position = positions.get(title);
		if (position != null && position.isFilled()){
			Employee employee = new Employee(1, person);
			position.setEmployee(Optional.of(employee));
			return Optional.of(position);
		}
		else {
			return Optional.empty();
		}

	}
	//added
	public void addPosition(Position position){
		positions.put(position.getTitle(), position);
	}
	public Map<String, Position> getPositions() {
		return positions;
	}
	public void setPositions(Map<String, Position> positions){
		this.positions = positions;
	}

	@Override
	public String toString() {
		return printOrganization(root, "");
	}

	//I chose not to mess with this print statement
	private String printOrganization(Position pos, String prefix) {
		StringBuffer sb = new StringBuffer(prefix + "+-" + pos.toString() + "\n");
		for(Position p : pos.getDirectReports()) {
			sb.append(printOrganization(p, prefix + "\t"));
		}
		return sb.toString();
	}
}
