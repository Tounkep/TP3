
public class OrderApp {

    public static double CalculTTC (int priceHt , int quantity ) {
    	double total = priceHt * quantity * 1.2; 
    	return total;
    }
    public static void  Afficher (String nom, double price,int  quantity, double total) {
       System.out.println(nom);
       System.out.println(price);
       System.out.println(quantity);
       System.out.println(total);
    		
    }
	public static void main(String[] args) {
		
		String firstCustomerName  = "Alice";
		
		double firstUnitPrice  = 10;
		
		int firstQuantity  = 2;
		double totalAlice=CalculTTC(10,2);
		
		Afficher("Alice",10,2,totalAlice);
		
		double firstTotalWithVat  = firstUnitPrice  * firstQuantity + firstUnitPrice  * firstQuantity * 0.2;

		String  secondCustomerName= "Bob";
		
		double secondUnitPrice = 15;
		
		int secondQuantity = 1;
		
		double secondTotalWithVat = secondUnitPrice* secondQuantity + secondUnitPrice * secondQuantity * 0.2;

		System.out.println("Client : " + firstCustomerName);
		
		System.out.println("Prix HT : " + firstUnitPrice );
		
		System.out.println("Quantité : " + firstQuantity);
		
		System.out.println("Total TTC : " + firstTotalWithVat );

		System.out.println("------------------------");

		System.out.println("Client : " + secondCustomerName);
		
		System.out.println("Prix HT : " + secondUnitPrice);
		
		System.out.println("Quantité : " + secondQuantity);
		
		System.out.println("Total TTC : " + secondTotalWithVat);

		System.out.println("------------------------");
		double totalOrders = firstTotalWithVat + secondTotalWithVat; 
		if (totalOrders > 30) {
			
			System.out.println("Réduction !");
			
		} else if (totalOrders > 20) {
				
				System.out.println("Petite réduction !");
				
			   } else {
				
				System.out.println("Pas de réduction.");
			   }
	}
}/*git commit -m "Apply naming conventions and formatting" */