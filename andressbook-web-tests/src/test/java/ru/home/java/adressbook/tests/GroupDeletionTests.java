package ru.home.java.adressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

    
    @Test
    public void testGroupDeletion() {
        app.gotoGroupPage();
        app.selectGroup();
        app.deleteSelectedGroups();
        app.returnToGroupPage();
    }


}
