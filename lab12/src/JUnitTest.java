import static org.junit.Assert.*;

import org.junit.*;

public class JUnitTest {

    private static CalcModel m;
    private static int nrTesteExecutate = 0;
    private static int nrTesteCuSucces = 0;

    public JUnitTest() {
        System.out.println("Constructor inaintea fiecarui test!");
    }

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("O singura data inaintea executiei setului de teste din clasa!");
        m = new CalcModel();
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("O singura data dupa terminarea executiei setului de teste din clasa!");
        System.out.println("S-au executat " + nrTesteExecutate + " teste din care " + nrTesteCuSucces + " au avut succes!");
    }

    @Before
    public void setUp() {
        System.out.println("Incepe un nou test!");
        nrTesteExecutate++;
    }

    @After
    public void tearDown() {
        System.out.println("S-a terminat testul curent!");
    }

    @Test
    public void testResetGetValue() {
        m.reset();
        String t = m.getValue();
        assertNotNull(t); // verifica t sa nu fie null
        assertEquals(t, "1"); // verifica continutul lui t sa fie identic cu "1"
        nrTesteCuSucces++;
    }

    @Test
    public void testMultiplyBy1() {
        m.reset();
        m.multiplyBy("7");
        m.multiplyBy("12");
        String t = m.getValue();
        assertNotNull(t); // verifica t sa nu fie null
        assertEquals(t, "84"); // verifica t sa nu fie null
        nrTesteCuSucces++;
    }

    @Test
    public void testMultiplyBy2() {
        m.reset();
        m.multiplyBy("7");
        m.multiplyBy("12");
        String t = m.getValue();
        assertTrue(t == "84"); // verifica referinta lui t sa fie identica cu referinta lui "84"
        nrTesteCuSucces++;
    }

    @Test
    public void testSetValue1() {
        m.setValue("50");
        String t = m.getValue();
        assertNotNull(t); // verifica t sa nu fie null
        assertSame(t, "50"); // verifica referinta lui t sa fie identica cu referinta lui "50"
        nrTesteCuSucces++;
    }

    @Test
    public void testSetValue2() {
        m.setValue("50");
        String t = m.getValue();
        assertNotNull(t); // verifica t sa nu fie null
        assertEquals(t, "50"); // verifica continutul lui t sa fie identic cu "50"
        nrTesteCuSucces++;
    }

    @Test
    public void testAlwaysFail() {
        fail("Esuat!"); // intotdeauna esueaza
        nrTesteCuSucces++;
    }
}
