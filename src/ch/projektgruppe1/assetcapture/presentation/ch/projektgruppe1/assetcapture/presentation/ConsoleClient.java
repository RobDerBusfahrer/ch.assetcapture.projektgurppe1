package ch.projektgruppe1.assetcapture.presentation;

import ch.projektgruppe1.assetcapture.business.Asset;
import ch.projektgruppe1.assetcapture.business.AssetFactory;

public class ConsoleClient {
	
	// AssetFactory to use
	private AssetFactory theAssetFactory = null;
	
	// Constructors
	public ConsoleClient() {
		theAssetFactory = AssetFactory.getInstance();
	}
	
	//Methods
	
	public void inputAsset(String assetCategory ,String assetTitle,String assetSN) {
		Asset asset = theAssetFactory.createAsset(assetCategory, assetTitle, assetSN);
		//save asset
		theAssetFactory.saveAsset(asset);
	}
	
	public static void main(String[] args) {		
		ConsoleClient theClient = new ConsoleClient();
		System.out.println("new consoleclient");
		
		theClient.inputAsset("Computer", "MacMini", "23525");
		theClient.inputAsset("Laptop", "Lenovo", "GB37");
		
	}
}

	
	