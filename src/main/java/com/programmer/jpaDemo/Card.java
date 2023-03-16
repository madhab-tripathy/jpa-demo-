package com.programmer.jpaDemo;

import javax.persistence.*;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int card_no;
    @Column(nullable = false,unique = true)
    private String dob;
    @Enumerated(EnumType.STRING)
    private Status status;
    @OneToOne
    @JoinColumn
    User user;

    public Card(){}
    public Card(int card_no, String dob, Status status) {
        this.card_no = card_no;
        this.dob = dob;
        this.status = status;
    }

    public int getCard_no() {
        return card_no;
    }

    public void setCard_no(int card_no) {
        this.card_no = card_no;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
