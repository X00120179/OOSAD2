public class Item {

	private int itemID;
	private string name;
	private double price;
	private int quantity;

	public Item(int idIn, string nameIn, double priceIn, int quantityIn) {
		itemID = idIn;
		name = nameIn;
		price = priceIn;
		quantity = quantityIn;

	}

	public string getName(){
		return name;
	}

	public Item() {
		// TODO - implement Item.Item
		throw new UnsupportedOperationException();
	}

}
