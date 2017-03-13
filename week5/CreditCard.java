public class CreditCard {

	private int cardNo;
	private int ccv;
	private int expiryDate;
	private string cardName;

	public CreditCard(int cardNoIn, int ccvIn, int expIn, string nameIn) {
		cardNo = cardNoIn;
		ccv = ccvIn;
		expiryDate = expIn;
		cardName = nameIn;
	}

	public CreditCard() {
		// TODO - implement CreditCard.CreditCard
		throw new UnsupportedOperationException();
	}

}
