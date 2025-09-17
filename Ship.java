package portManagement;

public class Ship {
	private String name;
	private String captain;
	

	public Ship() {
		
	}
	
	public Ship(String name, String captain) {
		this.name = name;
		this.captain = captain;
	}
	
	@Override
	public String toString() {
		return name + "|" + captain;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	public String getName() {
		return this.name;
	}
	public String getCaptain() {
		return this.captain;
	}
}
