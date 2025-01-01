/**
 * Interface of DAOs for data related to Assets
 */

package ch.projektgruppe1.assetcapture.persistence;

public interface AssetDAO {
	
	/**
	 * Inserts data of an asset as Array
	 * @param assetData
	 */
	public void insertAssetAsArray(String[] assetData);
	
	/**
	 * @param assetId
	 * @return Data of selected asset as Array
	 */
	public String[] selectAssetAsArray(int assetId);
}


