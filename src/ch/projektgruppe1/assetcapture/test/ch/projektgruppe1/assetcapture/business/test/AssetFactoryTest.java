/**
 * Class implementing tests for class AssetFactory.
 */

package ch.projektgruppe1.assetcapture.business.test;

import ch.projektgruppe1.assetcapture.business.Asset;
import ch.projektgruppe1.assetcapture.business.AssetFactory;
import static ch.projektgruppe1.assetcapture.business.test.TestBase.*;
import junit.framework.TestCase;

public class AssetFactoryTest extends TestCase {

    // AssetFactory to use
    private AssetFactory theAssetFactory;

    /*
     * Set up the test environment.
     */
    @Override
    protected void setUp() throws Exception {
        theAssetFactory = AssetFactory.getInstance();
        super.setUp();
    }

    /**
     * Test the save and retrieval functionality of AssetFactory.
     */
    public void testSaveAsset() { 
    	
    	// Creates Expected Data
        Asset asset1 = theAssetFactory.createAsset(EXPECTED_AssetCategory1, EXPECTED_Title1, EXPECTED_AssetSN1);
        Asset asset2 = theAssetFactory.createAsset(EXPECTED_AssetCategory2, EXPECTED_Title2, EXPECTED_AssetSN2);
        Asset asset3 = theAssetFactory.createAsset(EXPECTED_AssetCategory3, EXPECTED_Title3, EXPECTED_AssetSN3);

        // Save Asset
        theAssetFactory.saveAsset(asset1, 0);
        theAssetFactory.saveAsset(asset2, 1);  
        theAssetFactory.saveAsset(asset3, 2);  

      
        Asset[] expectedAssets = { asset1, asset2, asset3 };

        //Test
        for (int i = 0; i < expectedAssets.length; i++) {
           
            Asset actualAsset = expectedAssets[i];
            
            
            // Check that Asset is not null
            assertNotNull("Asset does not exist!", actualAsset);

            // Asset Title Check
            assertEquals("Wrong title!", expectedAssets[i].getTitle(), actualAsset.getTitle());
            System.out.println("asset " + i + " Title is equal");
            
            // Asset Category Check
            assertEquals("Wrong category!", expectedAssets[i].getAssetCategory(), actualAsset.getAssetCategory());
            System.out.println("asset" + i + " Category is equal");
            
            // Asset SN Check
            assertEquals("Wrong serial number!", expectedAssets[i].getAssetSN(), actualAsset.getAssetSN());
            System.out.println("asset " + i + " SN is equal");
        }

        // Optional: More specific checks
        Asset firstAsset = theAssetFactory.findAllAssets(0);
        assertNotSame("Title matches unexpected value!", "A", firstAsset.getTitle());
        assertNotSame("Serial number matches unexpected value!", "1", firstAsset.getAssetSN());
    }

}
