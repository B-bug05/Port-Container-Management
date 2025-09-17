package portManagement;

public class Container {
	private String id;
	private String desc;
	private double weight = 0;
	

public Container() {
}

public Container(String id, String desc, double weight) {
	this.id = id;
	this.desc = desc;
	this.weight = weight;

}

@Override
public String toString() {
	return id + "|" + desc + "|" + weight + "kg";
}

public void setId(String id) {
	this.id = id;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public void setWeight(double weight) {
	this.weight = weight;
}

public String getId() {
	return this.id;
}
public String getDesc() {
	return this.desc;
}
public double getWeight() {
	return this.weight;
}

}


