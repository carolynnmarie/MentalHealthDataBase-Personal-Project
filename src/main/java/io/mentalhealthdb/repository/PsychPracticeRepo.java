package io.mentalhealthdb.repository;

import io.mentalhealthdb.domain.PsychPractice;
import org.springframework.data.repository.CrudRepository;

public interface PsychPracticeRepo extends CrudRepository<PsychPractice, Long> {
}
