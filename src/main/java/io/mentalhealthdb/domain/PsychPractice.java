package io.mentalhealthdb.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Set;

@Entity
public class PsychPractice {

    @Id
    @GeneratedValue
    @Column(name = "PSYCH_PRACTICE_ID")
    private Long id;

    @Column(name = "PRACTICE_NAME")
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ADDRESS_ID")
    private Address address;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "PSYCHIATRIST_ID")
    private ArrayList<Psychiatrist> psychiatrists;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "PSYCHOLOGIST_ID")
    private ArrayList<Psychologist> psychologists;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNSELOR_ID")
    private ArrayList<Counselor> counselors;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "SOCIAL_WORKER_ID")
    private ArrayList<SocialWorker> social_workers;

    @Column(name = "HEALTH_CARE_PROVIDERS")
    private Set<HealthCare> health_care_providers;

    public Set<HealthCare> getHealth_care_providers() {
        return health_care_providers;
    }

    public void setHealth_care_providers(Set<HealthCare> health_care_providers) {
        this.health_care_providers = health_care_providers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<Psychiatrist> getPsychiatrists() {
        return psychiatrists;
    }

    public void setPsychiatrists(ArrayList<Psychiatrist> psychiatrists) {
        this.psychiatrists = psychiatrists;
    }

    public ArrayList<Psychologist> getPsychologists() {
        return psychologists;
    }

    public void setPsychologists(ArrayList<Psychologist> psychologists) {
        this.psychologists = psychologists;
    }

    public ArrayList<Counselor> getCounselors() {
        return counselors;
    }

    public void setCounselors(ArrayList<Counselor> counselors) {
        this.counselors = counselors;
    }

    public ArrayList<SocialWorker> getSocial_workers() {
        return social_workers;
    }

    public void setSocial_workers(ArrayList<SocialWorker> social_workers) {
        this.social_workers = social_workers;
    }
}
