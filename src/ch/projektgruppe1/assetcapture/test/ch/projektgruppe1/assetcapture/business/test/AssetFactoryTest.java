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
        // Verwende den Index direkt anstelle einer separaten Zählervariable
        Asset asset1 = theAssetFactory.createAsset(EXPECTED_AssetCategory1, EXPECTED_Title1, EXPECTED_AssetSN1);
        Asset asset2 = theAssetFactory.createAsset(EXPECTED_AssetCategory2, EXPECTED_Title2, EXPECTED_AssetSN2);
        Asset asset3 = theAssetFactory.createAsset(EXPECTED_AssetCategory3, EXPECTED_Title3, EXPECTED_AssetSN3);

        // Speichere Assets
        theAssetFactory.saveAsset(asset1, 0);  // Speichern bei Index 0
        theAssetFactory.saveAsset(asset2, 1);  // Speichern bei Index 1
        theAssetFactory.saveAsset(asset3, 2);  // Speichern bei Index 2

        // Erwarte die gespeicherten Assets
        Asset[] expectedAssets = { asset1, asset2, asset3 };

        // Teste die gespeicherten Assets
        for (int i = 0; i < expectedAssets.length; i++) {
            Asset actualAsset = theAssetFactory.findAllAssets(i);

            // Überprüfen, dass das Asset nicht null ist
            assertNotNull("Asset does not exist!", actualAsset);

            // Überprüfen des Titels, der Kategorie und der Seriennummer
            assertEquals("Wrong title!", expectedAssets[i].getTitle(), actualAsset.getTitle());
            assertEquals("Wrong category!", expectedAssets[i].getAssetCategory(), actualAsset.getAssetCategory());
            assertEquals("Wrong serial number!", expectedAssets[i].getAssetSN(), actualAsset.getAssetSN());
        }

        // Optional: Weitere spezifische Checks
        Asset firstAsset = theAssetFactory.findAllAssets(0); // Erste Asset zu prüfen
        assertNotSame("Title matches unexpected value!", "A", firstAsset.getTitle());
        assertNotSame("Serial number matches unexpected value!", "1", firstAsset.getAssetSN());
    }

}
