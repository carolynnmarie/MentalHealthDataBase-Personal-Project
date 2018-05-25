package io.mentalhealthdb.service;

import io.mentalhealthdb.repository.CounselorRepo;
import io.mentalhealthdb.repository.PsychPracticeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CounselorService {

    private CounselorRepo counselorRepo;
    private PsychPracticeRepo psychPracticeRepo;

    @Autowired
    public CounselorService(CounselorRepo counselorRepo, PsychPracticeRepo psychPracticeRepo){
        this.counselorRepo = counselorRepo;
        this.psychPracticeRepo = psychPracticeRepo;
    }
}
