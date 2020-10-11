package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    IndexController indexController;

    @BeforeEach
    void setUp() {
        indexController = new IndexController();
    }

    @DisplayName("Test Prop View name is returned for index page")
    @Test
    void index() {
        assertEquals("index", indexController.index());
        assertEquals("index", indexController.index(),"Wrong View Returned");
        assertEquals("index", indexController.index(), () -> "Another expensive message, make me only if you have to");
    }

    @Test
    void oopsHandler() {
        assertTrue("notimplemented".equals(indexController.oopsHandler()), () -> "This is some expensive message to build for my test");
    }

    @DisplayName("Test Exception")
    @Test
    void throwException() {
        assertThrows(RuntimeException.class, () -> indexController.throwException());
    }

    @Disabled(value = "Demo of timeout assertion")
    @Test
    void testTimeout() {
        assertTimeout(Duration.ofMillis(100), () -> Thread.sleep(2000));
        System.out.println("testTimeout Done");
    }

    @Disabled(value = "Demo of timeout assertion")
    @Test
    void testTimeoutPrempt() {
        assertTimeoutPreemptively(Duration.ofMillis(100), () -> Thread.sleep(2000));
        System.out.println("testTimeoutPrempt Done");
    }

    @Test
    void testAssumptionTrue() {
        Assumptions.assumeTrue("GURU".equalsIgnoreCase(System.getenv("GURU_RUNTIME")));
    }

    @Test
    void testAssumptionIsTrue() {
        Assumptions.assumeTrue("GURU".equalsIgnoreCase("GURU"));
    }

    @EnabledOnOs(OS.MAC)
    @Test
    void testOnMacOS() {
    }

    @EnabledOnOs(OS.WINDOWS)
    @Test
    void testOnWindows() {
    }

    @EnabledOnJre(JRE.JAVA_8)
    @Test
    void testOnJava8() {
    }

    @EnabledOnJre(JRE.JAVA_11)
    @Test
    void testOnJava11() {
    }

    @EnabledIfEnvironmentVariable(named = "USER", matches = "ericliu")
    @Test
    void testIfUserRight() {
    }

    @EnabledIfEnvironmentVariable(named = "USER", matches = "admin")
    @Test
    void testIfUserWrong() {
    }

}
