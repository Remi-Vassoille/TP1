package isen.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void testConstructor() {
        Person person = new Person();
        assertEquals("unknown", person.getName());
        assertEquals(22, person.getYears());
    }

    @Test
    void setName() {
        Person person = new Person();
        person.setName("John");
        assertEquals("John", person.getName());
    }

    @Test
    void setYears() {
        Person person = new Person();
        person.setYears(30);
        assertEquals(30, person.getYears());
    }
}