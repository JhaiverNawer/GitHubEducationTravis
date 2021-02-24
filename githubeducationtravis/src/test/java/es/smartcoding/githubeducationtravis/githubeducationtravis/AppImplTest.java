package es.smartcoding.githubeducationtravis.githubeducationtravis;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppImplTest {
	
	private static App app;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		app = new AppImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		app = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd1() throws Exception {
		assertEquals(3, app.add(1, 2));
	}

}
