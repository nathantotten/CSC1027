package week5;
import java.util.ArrayList;

public class Student {
	private int sNumber;				// student number
	private String fName;				// first name
	private String lName;				// last name
	//private String modules;			// list of modules taken
	private ArrayList<Module> mods;
	private final int MAX_MODULES = 5;	// upper limit for modules
	
	public Student(int number, String first, String last) {
		this.sNumber = number;
		this.fName = first;
		this.lName = last;
		//modules = "";		// empty String
		mods = new ArrayList<Module>();
	}
	
	public String getName() {
		return lName + ", " + fName;
	}
	
	public int getNumber() {
		return sNumber;
	}
	
	public void setForename(String fore) {
		fName = fore;
	}
	
	public void setSurname(String surname) {
		lName = surname;
	}
	
	public boolean addModule(Module mod) {
		
		if (mod != null && mods.size() < MAX_MODULES) {
			mods.add(mod);
			return true;
		}
		return false;
	}
	
	public String display() {
		String result = "";
		result += "Number: " + getNumber() + "\n";
		result += "Name: " + getName() +"\n";
		result += "Modules: ";
		if (mods.size() > 0) {
			result += getModules() + "\n";
		}
		else {
			result += "No modules available.";
		}
		return result;
	}
	
	public String getModules() {
		String list = "";
		for(Module aMod : mods) {
			list += aMod.getCode() + " " + aMod.getName() +"\n";
		}
		return list;
	}
}
