package week5;

public class Module {
	private String code;
	private String name;
	private String description;
	private int catPoints;
	private int hours;
	
	public Module(String code, String name, String desc, int cats, int hours) {
		this.code = code;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCode() {
		return code;
	}
}

/*
 * - code : String
 * - name : String
 * - description : String
 * - catPoints : int
 * - hours : int
 * 
 * + Module(String,String,String,int,int)
 * + getName() : String
 * + getCode() : String
 * + getDescription() : String
 * + getCats():int
 * + getHours():int

 */
