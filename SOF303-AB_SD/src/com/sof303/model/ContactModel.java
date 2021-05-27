package com.sof303.model;

public class ContactModel extends AbstractModel<ContactModel> {
    private String firstName;
    private int idManager;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getIdManager() {
        return idManager;
    }

    public void setIdManager(int idManager) {
        this.idManager = idManager;
    }
}
