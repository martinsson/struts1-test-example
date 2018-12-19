import servletunit.struts.MockStrutsTestCase;

public class HelloWorldTest extends MockStrutsTestCase {

    public HelloWorldTest(String testName) { super(testName); }

    public void testSuccessfulLogin() {
        this.setConfigFile("/WEB-INF/struts-config.xml");
        setRequestPathInfo("/helloWorld");
        actionPerform();
        verifyForward("success");
        verifyNoActionErrors();
        verifyNoActionMessages();
//        assertEquals("deryl",(String) getSession().getAttribute("authentication"));
//        assertEquals(this.getResponse())
    }
}