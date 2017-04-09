package pplq3;
/**
 * Stores details of essential type of gifts
 * @author Aayush
 *
 */
public class gift_essential extends Gifts{

	/**
	 * giftname-Stores the giftname and number
	 */
	public String giftname;
	/**
	 * gifttype-stores the type of the gift
	 *1-essential 
	 */
	public int gifttype=1;
	/**
	 * price-stores the price of the gift
	 */
	public int price;
	/**
	 * value-stores the value of the gift
	 */
	public int value;
	/**
	 * status-stores whether the gift has been given or yet to be given(0-given 1-not given)
	 */
	public int status=0;

}
