package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void groupedAssertions() {
        // Given
        Person person = new Person(1L, "Zhao", "Liu");

        // Then
        assertAll("Test Props Set",
                () -> assertEquals("Zhao", person.getFirstName()),
                () -> assertEquals("Liu", person.getLastName()));
    }

    @Test
    void groupedAssertionsMsgs() {
        // Given
        Person person = new Person(1L, "Zhao", "Liu");

        // Then
        assertAll("Test Props Set",
                () -> assertEquals("Zhao", person.getFirstName(), "First Name Failed"),
                () -> assertEquals("Liu", person.getLastName(), "Last Name Failed"));
    }
}
