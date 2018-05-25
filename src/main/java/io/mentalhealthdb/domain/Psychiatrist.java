package io.mentalhealthdb.domain;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "Psychiatrists")
public class Psychiatrist {

    @Id
    @GeneratedValue
    @Column(name = "PSYCHIATRIST_ID")
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

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "doctors")
    private ArrayList<PsychPractice> practices;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }

    public ArrayList<PsychPractice> getPractices() {
        return practices;
    }

    public void setPractices(ArrayList<PsychPractice> practices) {
        this.practices = practices;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }
}
