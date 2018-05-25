package io.mentalhealthdb.domain;

import javax.persistence.*;
import java.util.ArrayList;

public class Psychologist {

    @Id
    @GeneratedValue
    @Column(name = "PSYCHOLOGIST_ID")
    private long id;

    @Column(name = "DEGREE")
    private String degree;

    @Column(name = "FIRST_NAME")
    private String first_name;

    @Column(name = "LAST_NAME")
    private String last_name;

    @Column(name = "E_MAIL")
    private String e_mail;


    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "ADDRESS_ID")
    private ArrayList<Address> addresses;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "psychologists")
    private ArrayList<PsychPractice> practices;

}
