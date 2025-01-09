/**
 * Class implementing a Device.
 */

package ch.projektgruppe1.assetcapture.business;

public class BCDevice extends AbstractAsset{

	
	/* (non-Javadoc)
	 * Full constructor (for further iterations)
	 * 
	 * Public BCDevice(String title, String assetSN, String assetDescription, int statusID, String statusDescription,
		String assetCategory) {
		super(title, assetSN, assetDescription, statusID, statusDescription, assetCategory);
		}
	 */
			
	/**
	 * Constructor for first Iteration.
	 * @param assetCategory Category to set
	 * @param assetTitle Title to set
	 * @param assetSN Serial number to set
	 */
	public BCDevice(String assetCategory, String assetTitle, String assetSN) {
		super(assetCategory, assetTitle, assetSN);
		// TODO Auto-generated constructor stub
	}

	}

