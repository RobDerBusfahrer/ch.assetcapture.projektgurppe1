package ch.projektgruppe1.assetcapture.business;

abstract class AbstractAsset implements Asset {
	
	// Attributes
	
	
	
	

		/**
		 * The title.
		 */
		private String title;
		
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
		 * @param title
		 * @param assetSN
		 * @param assetCategory
		 */
		public AbstractAsset(String assetCategory, String assetTitle, String assetSN) {
			setTitle(assetTitle);
			setAssetSN(assetSN);
			setAssetCategory(assetCategory);
		}	
		
		// Special constructor
		
		/**
		 * @param title
		 * @param assetSN
		 * @param assetDescirption
		 * @param statusID
		 * @param statusDescirption
		 * @param assetCategory
		 */
		public AbstractAsset(String title, String assetSN, String assetDescription, int statusID, String statusDescription, String assetCategory) {
			setTitle(title);
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
		public final String getTitle() {
			return title;
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
		public void setTitle(String title) {
			this.title = title;
		}		
		
		/**
		 * @param assetSN the assetSN to set
		 */
		public void setAssetSN(String assetSN) {
			this.assetSN = assetSN;
		}

		/**
		 * @param AssetDescirption the AssetDescirption to set
		 */
		public void setAssetDescription(String assetDescription) {
			this.assetDescription = assetDescription;
		}	
		/**
		 * @param setStatusID the setStatusID to set
		 */																																
		public void setStatusID(int statusID) {
			this.statusID = statusID;
		}

		/**
		 * @param StatusDescription the StatusDescription to set
		 */
		public void setStatusDescription(String statusDescription) {
			this.statusDescription = statusDescription;      
		}	    
		
		/**
		 * @param setAssetCategory the setAssetCategory to set
		 */
		public void setAssetCategory(String assetCategory) {
			this.assetCategory = assetCategory;
		}
}

