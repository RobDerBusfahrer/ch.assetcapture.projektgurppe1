package ch.projektgruppe1.assetcapture.persistance.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static ch.projektgruppe1.assetcapture.business.test.TestBase.*;
import ch.projektgruppe1.assetcapture.persistence.AssetDAO;
import ch.projektgruppe1.assetcapture.persistence.AssetDAOFactory;
import junit.framework.TestCase;

class AssetDAOTest {

    // Die DAO Factory
    private AssetDAOFactory theAssetDAOFactory = null;

    // Die DAO
    private AssetDAO theAssetDAO = null;

    @BeforeEach
    void setUp() throws Exception {
        // Initialisieren der DAO Factory und der DAO
        theAssetDAOFactory = AssetDAOFactory.getInstance();
        theAssetDAO = theAssetDAOFactory.createAssetDAO();
    }

    @AfterEach
    void tearDown() throws Exception {
        // Cleanup falls erforderlich
    }

    /**
     * Testet die Insert- und Select-Funktionalität mit Arrays.
     */
    @Test
    public void testInsertAndSelectAssetAsArray() {

        // Erstellen von Asset-Daten als Array
        String[] asset_1 = { EXPECTED_Title1, EXPECTED_AssetSN1, EXPECTED_AssetCategory1};
        System.out.println("nigur");
        String[] asset_2 = { EXPECTED_Title2, EXPECTED_AssetSN2, EXPECTED_AssetCategory1};
        String[] asset_3 = { EXPECTED_Title3, EXPECTED_AssetSN3, EXPECTED_AssetCategory1};

        String[][] assetsExpected = { asset_1, asset_2, asset_3 };

        // Einfügen der Asset-Daten
        theAssetDAO.insertAssetAsArray(asset_1);
        theAssetDAO.insertAssetAsArray(asset_2);
        theAssetDAO.insertAssetAsArray(asset_3);

        // Abrufen und Validierung der gespeicherten Assets
        for (int i = 0; i < assetsExpected.length; i++) {
            String[] actualAsset = theAssetDAO.selectAssetAsArray(i); // Asset abrufen

            // Überprüfen, dass das Asset nicht null ist
            assertNotNull(actualAsset, "Asset does not exist!");

            // Asset Title Check
            assertEquals("Wrong title!", assetsExpected[i][0], actualAsset[0]);
            System.out.println("Asset " + i + " Title is equal");

            // Asset SN Check
            assertEquals("Wrong serial number!", assetsExpected[i][1], actualAsset[1]);
            System.out.println("Asset " + i + " Serial Number is equal");
        }

        // Optional: Weitere spezifische Checks
        String[] firstAsset = theAssetDAO.selectAssetAsArray(0);
        assertNotSame("Title matches unexpected value!", "A", firstAsset[0]);
        assertNotSame("Serial number matches unexpected value!", "1", firstAsset[1]);
    }
}  