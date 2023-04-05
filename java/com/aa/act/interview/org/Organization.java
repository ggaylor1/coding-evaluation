package com.aa.act.interview.org;

import java.util.Optional;
//new import
import java.util.List;

public abstract class Organization {

	private Position root;
	
	public Organization() {
		root = createOrganization();
	}
	
	protected abstract Position createOrganization();
	//constructor
	public Organization(List<Position> positions){
		this.positions = positions;
	}
	//giving myself the option to list through different positions
	private List<Position> positions;
	
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
		* */

	public Optional<Position> hire(Name person, String title) {

	//looking for a specific position out of all the positions
		for(Position p : positions){
			//using the getTitle function to see if the title is available
			if(p.getTitle().equals(title) && p.isFilled())
			{
				//create that person as a new employee
				Employee e = new Employee(person, p);
				employee.add(e);
				//hire the person for that position
				p.hire(person);
				//if Position title exists , return the newly filled position
				return p;
				return Optional.of(p);
			}
		}
		//if not, return empty
		return null;
	}

	@Override
	public String toString() {
		return printOrganization(root, "");
	}

	//I chose not to mess with this print statement (although tempting)
	private String printOrganization(Position pos, String prefix) {
		StringBuffer sb = new StringBuffer(prefix + "+-" + pos.toString() + "\n");
		for(Position p : pos.getDirectReports()) {
			sb.append(printOrganization(p, prefix + "\t"));
		}
		return sb.toString();
	}
}
