package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "invitation")
public class Invitation {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private int id;

   @Column(name = "processed")
    private boolean processed;

   @Column(name = "approved")
    private boolean approved;

   @Column(name = "user_id")
    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Invitation(){

    }

    @Override
    public String toString() {
        return "Invitation{" +
                "id=" + id +
                ", processed=" + processed +
                ", approved=" + approved +
                ", userId=" + userId +
                '}';
    }

}
