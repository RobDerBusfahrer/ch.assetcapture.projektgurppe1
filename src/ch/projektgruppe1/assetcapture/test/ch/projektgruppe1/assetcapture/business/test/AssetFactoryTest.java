package ch.projektgruppe1.assetcapture.business.test;

import ch.projektgruppe1.assetcapture.business.AssetFactory;
import junit.framework.TestCase;

public class AssetFactoryTest extends TestCase {

	//Asset Factory to use
	private AssetFactory theAssetfactory = null;
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {

		theAssetfactory = AssetFactory.getInstance();

		super.setUp();
	}

	/**
	 * Tests MediaFactory.
	 */
	public void testSaveMedia() {
		
		//Create Laptops
		theClient.inputAsset("Computer", "MacMini", "23525");
		theClient.inputAsset("Laptop", "Lenovo", "GB37");
		theClient.inputAsset("Laptop", "Dell", "3622");
		theClient.inputAsset("Laptop", "test", "3622");

	}
}
