/**
 * Class for the ConsoleClient. Also contains the 
 */

package ch.projektgruppe1.assetcapture.presentation;

import ch.projektgruppe1.assetcapture.business.Asset;
import ch.projektgruppe1.assetcapture.business.AssetFactory;

public class ConsoleClient {
	
	// AssetFactory to use
	private AssetFactory theAssetFactory = null;
	
	/**
	 * The Asset count
	 */
	private  int savedAssets = 0;
	
	// Constructors
	public ConsoleClient() {
		theAssetFactory = AssetFactory.getInstance();
	}
	
	//Methods
	
	/**
	 * Creates an Asset.
	 * @param assetCategory the category of the asset to create.
	 * @param assetTitle the title of the asset to create.
	 * @param assetSN the serial number of the asset to create.
	 */	
	public void inputAsset(String assetCategory ,String assetTitle,String assetSN) {
		Asset asset = theAssetFactory.createAsset(assetCategory, assetTitle, assetSN);
		//save asset
		theAssetFactory.saveAsset(asset, savedAssets);
		savedAssets++;
	}
	
	/**
	 * Displays the full inventory.
	 */
	public void outputInventory(){
		// Get book with given ID
		for (int i = 0; i < savedAssets; i++) {
			Asset asset = theAssetFactory.findAllAssets(i);
		
			// Display Asset
			System.out.println(asset.getTitle());
		}
	}
	
	
	/**
	 * The Main Method.
	 */
	public static void main(String[] args) {		
		ConsoleClient theClient = new ConsoleClient();
		
		theClient.inputAsset("Computer", "MacMini", "23525");
		theClient.inputAsset("Laptop", "Lenovo", "GB37");
		theClient.inputAsset("Laptop", "Dell", "3622");
		theClient.inputAsset("Laptop", "test", "3622");
		
		theClient.outputInventory();
		
	}
}
	