/**
 * Class implementing tests for class AssetDAO.
 */

package ch.projektgruppe1.assetcapture.persistance.test;

import static ch.projektgruppe1.assetcapture.business.test.TestBase.EXPECTED_AssetCategory1;
import static ch.projektgruppe1.assetcapture.business.test.TestBase.EXPECTED_AssetCategory2;
import static ch.projektgruppe1.assetcapture.business.test.TestBase.EXPECTED_AssetCategory3;
import static ch.projektgruppe1.assetcapture.business.test.TestBase.EXPECTED_AssetSN1;
import static ch.projektgruppe1.assetcapture.business.test.TestBase.EXPECTED_AssetSN2;
import static ch.projektgruppe1.assetcapture.business.test.TestBase.EXPECTED_AssetSN3;
import static ch.projektgruppe1.assetcapture.business.test.TestBase.EXPECTED_Title1;
import static ch.projektgruppe1.assetcapture.business.test.TestBase.EXPECTED_Title2;
import static ch.projektgruppe1.assetcapture.business.test.TestBase.EXPECTED_Title3;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import ch.projektgruppe1.assetcapture.persistence.AssetDAO;
import ch.projektgruppe1.assetcapture.persistence.AssetDAOFactory;

public class AssetDAOTest {

    // The AssetDAO Factory
    private AssetDAOFactory theAssetDAOFactory = null;

    // The Asset DAO
    private AssetDAO theAssetDAO = null;

    @BeforeEach
    void setUp() throws Exception {
        // Initializing the AssetDAOFactory and AssetDAO
        theAssetDAOFactory = AssetDAOFactory.getInstance();
        theAssetDAO = theAssetDAOFactory.createAssetDAO();
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    /**
     * Test the input and select with Arrays
     */
    @Test
    public void testInsertAndSelectAssetAsArray() {

        // Creates expected Data
        String[] asset_1 = { EXPECTED_Title1, EXPECTED_AssetSN1, EXPECTED_AssetCategory1};
        String[] asset_2 = { EXPECTED_Title2, EXPECTED_AssetSN2, EXPECTED_AssetCategory2};
        String[] asset_3 = { EXPECTED_Title3, EXPECTED_AssetSN3, EXPECTED_AssetCategory3};

        String[][] assetsExpected = { asset_1, asset_2, asset_3 };

        // Inserting asset data
        theAssetDAO.insertAssetAsArray(asset_1);
        theAssetDAO.insertAssetAsArray(asset_2);
        theAssetDAO.insertAssetAsArray(asset_3);

        /**
         * Test the input and select with Arrays
         */
        for (int i = 0; i < assetsExpected.length; i++) {
            String[] actualAsset = theAssetDAO.selectAssetAsArray(i); // Asset abrufen

            // Check that Asset is not null
            assertNotNull(actualAsset, "Asset does not exist!");

            // Asset Title Check
            assertEquals("Wrong title!", assetsExpected[i][0], actualAsset[0]);
            //System.out.println("Asset " + i + " Title is equal");

            // Asset SN Check
            assertEquals("Wrong serial number!", assetsExpected[i][1], actualAsset[1]);
            //System.out.println("Asset " + i + " Serial Number is equal");
        
            // Asset Category Check
            assertEquals("Wrong Category!", assetsExpected[i][2], actualAsset[2]);
            //System.out.println("Asset " + i + " Category is equal");
        }

        /**
         * Test the input and select with Arrays
         */
        // Optional: More specific checks
        String[] firstAsset = theAssetDAO.selectAssetAsArray(0);
        assertNotSame("Title matches unexpected value!", "A", firstAsset[0]);
        assertNotSame("Serial number matches unexpected value!", "1", firstAsset[1]);
    }
}  