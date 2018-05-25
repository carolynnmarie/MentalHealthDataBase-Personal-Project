package io.mentalhealthdb.repository;

import io.mentalhealthdb.domain.Psychologist;
import org.springframework.data.repository.CrudRepository;

public interface PsychologistRepo extends CrudRepository<Psychologist, Long> {
}
