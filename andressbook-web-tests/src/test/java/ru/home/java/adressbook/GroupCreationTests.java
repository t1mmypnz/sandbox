package ru.home.java.adressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreateon() {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("qwer", "qwert", "qwerty"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
