/**
 * Parent class for Assets
 * Only for Devices in the first Iteration!
 */

package ch.projektgruppe1.assetcapture.business;

abstract class AbstractAsset implements Asset {
	
	// Attributes
	
		/**
		 * The title.
		 */
		private String assetTitle;
		
		/**
		 * The Asset serial number.
		 */
		private String assetSN;

		/**
		 * The asset Description.
		 */
		private String assetDescription;
		
		/**
		 * The Status ID
		 */
		private int statusID;
		
		/**
		 * The status Description
		 */
		private String statusDescription;
		
		/**
		 * The Asset Category
		 */
		private String assetCategory;
		
		//Constructor for BCDevice
		/**
		 * @param assetTitle
		 * @param assetSN
		 * @param assetCategory
		 */
		public AbstractAsset(String assetCategory, String assetTitle, String assetSN) {
			setAssetTitle(assetTitle);
			setAssetSN(assetSN);
			setAssetCategory(assetCategory);
		}	
		
		// Special constructor
		
		/**
		 * @param assetTitle
		 * @param assetSN
		 * @param assetDescription
		 * @param statusID
		 * @param statusDescription
		 * @param assetCategory
		 */
		public AbstractAsset(String assetTitle, String assetSN, String assetDescription, int statusID, String statusDescription, String assetCategory) {
			setAssetTitle(assetTitle);
			setAssetSN(assetSN);
			setAssetDescription(assetDescription);
			setStatusID(statusID);
			setStatusDescription(statusDescription);
			setAssetCategory(assetCategory);
		}	
		
		//Getter methods

		/* (non-Javadoc)
		 *
		 */
		public final String getAssetTitle() {
			return assetTitle;
		}

		/* (non-Javadoc)
		 *
		 */
		public final String getAssetSN() {
			return assetSN;
		}	
		
		/* (non-Javadoc)
		 * 
		 */
		public final String getAssetDescription() {
			return assetDescription;
		}	
		
		/* (non-Javadoc)
		 * 
		 */
		public final int getStatusID() {
			return statusID;
		}	
		
		/* (non-Javadoc)
		 * 
		 */
		public final String getStatusDescription() {
			return statusDescription;
		}	
		
		/* (non-Javadoc)
		 * 
		 */
		public final String getAssetCategory() {
			return assetCategory;
		}	
		
		//Setter methods		
		/**
		 * @param title the title to set
		 */
		public void setAssetTitle(String assetTitle) {
			this.assetTitle = assetTitle;
		}		
		
		/**
		 * @param assetSN the assetSN to set
		 */
		public void setAssetSN(String assetSN) {
			this.assetSN = assetSN;
		}

		/**
		 * @param assetDescription the AssetDescirption to set
		 */
		public void setAssetDescription(String assetDescription) {
			this.assetDescription = assetDescription;
		}	
		/**
		 * @param statusID the setStatusID to set
		 */																																
		public void setStatusID(int statusID) {
			this.statusID = statusID;
		}

		/**
		 * @param statusDescription the StatusDescription to set
		 */
		public void setStatusDescription(String statusDescription) {
			this.statusDescription = statusDescription;      
		}	    
		
		/**
		 * @param assetCategory the setAssetCategory to set
		 */
		public void setAssetCategory(String assetCategory) {
			this.assetCategory = assetCategory;
		}
}

