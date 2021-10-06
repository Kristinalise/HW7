public class Table extends Inventory {
	
	private double width;
	private double length;
	private double height;
	private int numChairs;
	
	public Table(String theName, int theQuantity, double thePrice, String theCode, double theWidth, double theLength, double theHeight, int theNumChairs) {
		super(theName, theQuantity, thePrice, theCode);
		width = theWidth;
		length = theLength;
		height = theHeight;
		numChairs = theNumChairs;
	}
	
	public String toString() {
		return "We have " + this.getQuantity() + " units of the table " + this.getName() + ", which costs " + this.dollarFormat() + " and it is " + width + " by " + length + " by " + height + "inches, with " + numChairs + " chairs.";
	}

}
