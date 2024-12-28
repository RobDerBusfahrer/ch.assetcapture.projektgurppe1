/**
 * Class implementing a factory for Asset implementations.
 */

package ch.projektgruppe1.assetcapture.business;

import ch.projektgruppe1.assetcapture.persistence.AssetDAO;
import ch.projektgruppe1.assetcapture.persistence.AssetDAOFactory;

public class AssetFactory {

	/**
	 * Singleton instance
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
	 * @param assetCategory Category to set
	 * @param assetTitle Title to set
	 * @param assetSN Serial number to set
	 * @return Asset
	 */	
	public Asset createAsset(String assetCategory,String assetTitle,String assetSN ){
		return new BCDevice(assetCategory, assetTitle, assetSN);	// Concrete Device should be configured.
			}	
	
	/**
	 * Saves an Asset object
	 * @param asset The asset to save
	 * @param savedAssets Amount of currently saved Assets
	 */
	public void saveAsset(Asset asset, int savedAssets){		
		this.assetDAO.insertAssetAsArray(assetToArray(asset, savedAssets));
		System.out.println("Asset saved!");
	}
	
	/**
	 * Finds and returns chosen Asset.
	 * @param currentAsset ID of current Asset in loop
	 * @return Asset object or null
	 */
	public Asset findAllAssets(int currentAsset){
				
			String[] assetData = this.assetDAO.selectAssetAsArray(currentAsset);
			if(assetData == null){
				return null;
			}
			return arrayToAsset(assetData, currentAsset);
			}
		
	/**
	 * Converts Asset to Array.
	 * @param asset to convert
	 * @return Array containing data of given Asset
	 */
	private String[] assetToArray(Asset asset, int savedAssets){		
		String[] assetData = new String[savedAssets+1];
		
		assetData[savedAssets] ="Title: "+ asset.getTitle()+"		|"+"		Category: " +asset.getAssetCategory()+"		|"+"		SN: "+ asset.getAssetSN();
		
		return assetData;
	}
	
	/**
	 * Converts Array to Asset.
	 * @param assetData
	 * @return Array containing data of given Asset
	 */
	private Asset arrayToAsset(String[] assetData, int currentAsset){		
		Asset asset = createAsset(assetData[currentAsset], assetData[currentAsset], assetData[currentAsset]);		
		
		return asset;
	}
}


