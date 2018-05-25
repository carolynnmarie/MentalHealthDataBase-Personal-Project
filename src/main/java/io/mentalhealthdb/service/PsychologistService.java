package io.mentalhealthdb.service;

import io.mentalhealthdb.repository.PsychPracticeRepo;
import io.mentalhealthdb.repository.PsychologistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PsychologistService {

    private PsychologistRepo psychologistRepo;
    private PsychPracticeRepo psychPracticeRepo;

    @Autowired
    public PsychologistService(PsychologistRepo psychologistRepo, PsychPracticeRepo psychPracticeRepo) {
        this.psychologistRepo = psychologistRepo;
        this.psychPracticeRepo = psychPracticeRepo;
    }
}
