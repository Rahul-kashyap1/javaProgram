package inheritance;

public class BoxWeight extends Box {

	double weight;

	public String toString() {
		return "Box length " + this.l + " Box height " + this.h + " Box width " + w + " Box weight " + this.weight;
	}

	public BoxWeight() {
		this.weight = -1;
	}

	public BoxWeight(double l, double h, double w, double weight) {
		super(l, h, w);
		this.weight = weight;
	}

}
