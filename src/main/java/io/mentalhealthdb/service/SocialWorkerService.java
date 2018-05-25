package io.mentalhealthdb.service;

import io.mentalhealthdb.repository.PsychPracticeRepo;
import io.mentalhealthdb.repository.SocialWorkerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocialWorkerService {

    private SocialWorkerRepo socialWorkerRepo;
    private PsychPracticeRepo psychPracticeRepo;

    @Autowired
    public SocialWorkerService(SocialWorkerRepo socialWorkerRepo, PsychPracticeRepo psychPracticeRepo) {
        this.socialWorkerRepo = socialWorkerRepo;
        this.psychPracticeRepo = psychPracticeRepo;
    }

}
