package cardealership;

public class Vehicle{
	/*All of the fields needed for the class Vehicle.
	Each vehicle has a make, a vin, a total price to be paid
	a total amount paid, a total amount remaining, the last
	time a payment was made and how much it was, the next time
	the payment needs to be made and how much. Whoever buys 
	the vehicle has a Name, phone number that has area, 
	3 digits, and 4 digits, an address, and possible an
	address */
	public String make;
	public String vin;
	public double totalPrice;
	public double totalPaid;
	public double totalRemaining;
	public double lastPayment;
	public String lastPayMonth;
	public int lastPayDay;
	public int lastPayYear;
	public double nextPayment;
	public String nextPayMonth;
	public int nextPayDay;
	public int nextPayYear;
	public String buyerName;
	public int buyerNumber;
	public string buyerAddress;
	public int buyerPhoneArea;
	public int buyerPhone3;
	public int buyerPhone4;

	//The vehicle class has a constructor
	//this constructor is based on nothing passed
	public Vehicle(){
		make = "default";
		vin = "a00a00a00";
		totalPrice = 000.00;
		totalPaid = 000.00;
		totalRemaining = 000.00;
		lastPayment = 000.00;
		lastPayMonth = "January";
		lastPayDay = 00;
		lastPayYear = 0000;
		nextPayment = 000.00;
		nextPayMonth = "January";
		nextPayDay = 00;
		nextPayYear = 0000;
		buyerName = "default";
		buyerNumber = 0;
		buyerAddress = "Default";
		buyerPhoneArea = 000;
		buyerPhone3 = 000;
		buyerPhone4 = 0000;
		}
	
	public void setMake(String newMake){
		
