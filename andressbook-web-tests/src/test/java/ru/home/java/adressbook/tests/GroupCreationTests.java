package ru.home.java.adressbook.tests;

import org.testng.annotations.Test;
import ru.home.java.adressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreateon() {
    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("qwer", "qwert", "qwerty"));
    app.submitGroupCreation();
    app.returnToGroupPage();
  }

}
