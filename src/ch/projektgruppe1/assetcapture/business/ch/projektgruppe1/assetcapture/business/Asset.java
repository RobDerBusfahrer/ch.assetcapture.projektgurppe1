/**
 * Interface for Assets
 * Only for Devices in the first Iteration!
 */

package ch.projektgruppe1.assetcapture.business;

public interface Asset {

	//Setter methods		
			/**
			 * set the title
			 */
			public void setAssetTitle(String assetTitle);
			
			/**
			 * set the serial number
			 */
			public void setAssetSN(String assetSN);

			/**
			 * set the description
			 */
			public void setAssetDescription(String assetDescription);
			
			/**
			 * set the statusID
			 */																																
			public void setStatusID(int statusID);

			/**
			 * set the status description
			 */
			public void setStatusDescription(String statusDescription);  
			
			/**
			 * set the category
			 */
			public void setAssetCategory(String assetCategory);
			
			// Getter methods
	
			/**
			 * @return the title
			 */
			public String getAssetTitle();

			/**
			 * @return the serial number
			 */
			public String getAssetSN();
			
			/**
			 * @return the description
			 */
			public String getAssetDescription();
			
			/**
			 * @return the statusID
			 */
			public int getStatusID();
			
			/**
			 * @return the status description
			 */
			public String getStatusDescription();
			
			/**
			 * @return the category
			 */
			public String getAssetCategory();	
	
}
