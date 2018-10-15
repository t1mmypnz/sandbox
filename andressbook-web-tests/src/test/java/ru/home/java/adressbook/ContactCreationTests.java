package ru.home.java.adressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {


    @Test
    public void testContactCreation() {
        initContactCreation();
        fillContactCreation(new ContactData("Батя", "Тоток", "Лолз", "Timmy", "98752123", "Qutrei@mail.ru"));
        returnToHomePage();
    }


}
