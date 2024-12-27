package ch.projektgruppe1.assetcapture.persistence;

public interface AssetDAO {
	
	/**
	 * Inserts data of an asset as Array
	 * @param assetData
	 */
	public void insertAssetAsArray(String[] assetData);
}
