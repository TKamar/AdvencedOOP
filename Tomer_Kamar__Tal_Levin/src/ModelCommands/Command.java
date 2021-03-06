package ModelCommands;

import java.io.FileNotFoundException;
import java.io.IOException;

import Model.Product;

public interface Command {
	
	void addProductCommand(String catalog, String pName, int storePrice, int custPrice, String custName, String phoneNum, boolean promotions) throws FileNotFoundException, IOException;
	
	boolean undoInsert();
	
	String[] showAllProducts();
	
	Product searchProduct(String catalog);
	
	String[] showProfit();
	
	boolean deleteProduct(String catalog);
	
	void deleteAll();
	
	void sendPromotion();
	
	String showAcceptedCustomer();
}
