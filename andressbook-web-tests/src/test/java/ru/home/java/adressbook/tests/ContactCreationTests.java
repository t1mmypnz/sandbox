package ru.home.java.adressbook.tests;

import org.testng.annotations.Test;
import ru.home.java.adressbook.model.ContactData;

public class ContactCreationTests extends TestBase {


    @Test
    public void testContactCreation() {
        app.initContactCreation();
        app.fillContactCreation(new ContactData("Батя", "Тоток", "Лолз", "Timmy", "98752123", "Qutrei@mail.ru"));
        app.returnToHomePage();
    }


}
