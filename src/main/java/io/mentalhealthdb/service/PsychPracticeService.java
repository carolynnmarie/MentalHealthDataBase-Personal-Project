package io.mentalhealthdb.service;

import io.mentalhealthdb.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PsychPracticeService {

    private PsychPracticeRepo psychPracticeRepo;
    private PsychiatristRepo psychiatristRepo;
    private PsychologistRepo psychologistRepo;
    private CounselorRepo counselorRepo;
    private SocialWorkerRepo socialWorkerRepo;

    @Autowired
    public PsychPracticeService(PsychPracticeRepo psychPracticeRepo, PsychiatristRepo psychiatristRepo,
                                PsychologistRepo psychologistRepo, CounselorRepo counselorRepo, SocialWorkerRepo socialWorkerRepo) {
        this.psychPracticeRepo = psychPracticeRepo;
        this.psychiatristRepo = psychiatristRepo;
        this.psychologistRepo = psychologistRepo;
        this.counselorRepo = counselorRepo;
        this.socialWorkerRepo = socialWorkerRepo;
    }

}
