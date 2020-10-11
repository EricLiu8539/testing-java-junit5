package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @Test
    void dependentAssertions() {
        Owner owner = new Owner(1L, "Zhao", "Liu");
        owner.setCity("Sydney");
        owner.setTelephone("0430566885");

        assertAll("Properties Test",
                () -> assertAll("Person Properties",
                        () -> assertEquals("Zhao", owner.getFirstName(), "First Name Test Failed"),
                        () -> assertEquals("Liu", owner.getLastName(), "Last Name Test Failed")),
                () -> assertAll("Owner Properties",
                        () -> assertEquals("Sydney", owner.getCity(), "City Test Failed"),
                        () -> assertEquals("0430566885", owner.getTelephone(), "Telephone Test Failed")
                ));
    }
}
