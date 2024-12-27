package ch.projektgruppe1.assetcapture.persistence;

public class AssetDAOMock implements AssetDAO {
	private String[][] assetList = null;
	private int insertCount = 0;

	AssetDAOMock() {		
	assetList = new String[10][];
	insertCount = 0;
	}
	
	public void insertAssetAsArray(String[] assetData) {
		if(insertCount < 10){
			assetList[insertCount] = assetData;
			insertCount++;
}
	}
	public String[] selectAssetAsArray(int assetId) {
		if(assetId < insertCount){
			return assetList[assetId];	
		}	
		return null;
}
}

	
	