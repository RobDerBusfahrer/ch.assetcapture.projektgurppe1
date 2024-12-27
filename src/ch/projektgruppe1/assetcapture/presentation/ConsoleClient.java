package ch.projektgruppe1.assetcapture.presentation;


public class ConsoleClient {
	
	// Assetfactory to use
	private AssetFactory theAssetFactory = null;
	
	// Constructors
	public ConsoleClient() {
		theAssetFactory = AssetFactory.getInstance();
	}
	
	//Methods
	
	public void inputAsset(assetCategory String, assetTitle String, assetSN String) {
		Asset asset = theAssetFactory.createAsset(assetCategory, assetTitle, assetSN)
	}