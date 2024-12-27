package ch.projektgruppe1.assetcapture.business;

public class AssetFactory {

	/**
	 * Singleton
	 */
	private static AssetFactory theInstance = null;
	
	/**
	 * The Asset-DAO instance 
	 */
	private AssetDAO assetDAO = null;
	
	
	/**
	 * Default constructor
	 */
	private AssetFactory() {
		AssetDAOFactory assetDaoFactory = AssetDAOFactory.getInstance();
		this.assetDAO = assetDaoFactory.createAssetDAO();	
	}
	
	/**
	 * @return The Singleton instance
	 */
	public static AssetFactory getInstance(){
		if(theInstance == null){
			theInstance = new AssetFactory();
		}
		return theInstance;
	}
	
	/**
	 * Creates a concrete Device object with the Category, Title and Serial Number set
	 * @param assetCategory
	 * @param assetTitle
	 * @param assetSN
	 * @return Asset
	 */	
	public createAsset(assetCategory String, assetTitle String, assetSN String){
		Asset device = new BCDevice(assetCategory, assetTitle, assetSN);	// Concrete Device should be configured.
		this.assetDAO.insertAssetAsArray(assetToArray(asset));
		System.out.println("test")
	}	
	
}
