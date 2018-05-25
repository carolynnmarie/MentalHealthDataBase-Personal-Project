package io.mentalhealthdb.service;

import io.mentalhealthdb.repository.PsychPracticeRepo;
import io.mentalhealthdb.repository.PsychiatristRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PsychiatristService {

    private PsychiatristRepo psychiatristRepo;
    private PsychPracticeRepo psychPracticeRepo;

    @Autowired
    public PsychiatristService(PsychiatristRepo psychiatristRepo, PsychPracticeRepo psychPracticeRepo) {
        this.psychiatristRepo = psychiatristRepo;
        this.psychPracticeRepo = psychPracticeRepo;
    }

}
