package ch.projektgruppe1.assetcapture.business;

import ch.projektgruppe1.assetcapture.persistence.AssetDAO;
import ch.projektgruppe1.assetcapture.persistence.AssetDAOFactory;

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
	public Asset createAsset(String assetCategory,String assetTitle,String assetSN ){
		return new BCDevice(assetCategory, assetTitle, assetSN);	// Concrete Device should be configured.
			}	
	
	/**
	 * Saves a device object
	 * @param device
	 */
	public void saveAsset(Asset asset){		
		this.assetDAO.insertAssetAsArray(assetToArray(asset));
		System.out.println("saving Asset");
	}
	
	/**
	 * Converts Asset to Array.
	 * @param asset to convert
	 * @return Array containing data of given Asset
	 */
	private String[] assetToArray(Asset asset){		
		String[] assetData = new String[2];
		
		assetData[1] = asset.getTitle();
		
		return assetData;
	}
}
