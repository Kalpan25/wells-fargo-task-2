package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;


@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientId;      // Primary Key  (PK)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="advisor_id")  // (Foreign key (FK)
    private Advisor advisor;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    protected Client() {

    }
    public Client(Advisor advisor, String firstName, String lastName, String email, String phone) {
        this.advisor = advisor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }
    public long getClientId() {
        return clientId;
    }

    public Advisor getAdvisor() {
        return advisor;
    }
    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public String getFirstName() {
        return firstName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public  void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
            this.email=email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
}
