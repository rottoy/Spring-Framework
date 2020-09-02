package com.example.demo;

public interface InvitationDAO {

    public Invitation getInvitations(String id);
    public void approveRequest(Invitation invitation);
    public void rejectRequest(Invitation invitation);
}
