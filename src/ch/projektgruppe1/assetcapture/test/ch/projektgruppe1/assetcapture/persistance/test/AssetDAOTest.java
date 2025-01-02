package ch.projektgruppe1.assetcapture.persistance.test;

import ch.projektgruppe1.assetcapture.persistance.*;

public class AssetDAOTest {

	//The DAO Factory
	 private DAOFactory theDAOFactory = null;
	 
	//The DAP
	 private AssetDAO theAssetDAO = null;
	 
	 @BeforeEach
	void setUp() throws Exception {
		theDAOFactory = DAOFactory.getInstance();
		theAssetDAO = theDAOFactory.createMediaDAO();
		
		
		
		
	 }
}
