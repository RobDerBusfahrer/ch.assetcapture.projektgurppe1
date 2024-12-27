package ch.projektgruppe1.assetcapture.persistence;

public class AssetDAOFactory {

	/**
	 * The Singleton instance 
	 */
	private static AssetDAOFactory theInstance = null;
	
	/**
	 * Default constructor
	 */
	private AssetDAOFactory() {
	}
	
	/**
	 * @return The Singleton
	 */
	public static AssetDAOFactory getInstance(){
		if(theInstance == null){
			theInstance = new AssetDAOFactory();
		}
		return theInstance;
	}
	
	/**
	 * Creates concrete DAO
	 * @return DAO
	 */
	public AssetDAO createAssetDAO(){
		// Concrete DAO should be configured.
		return new AssetDAOMock();
			}
	
}
