package io.mentalhealthdb.repository;

import io.mentalhealthdb.domain.Psychiatrist;
import org.springframework.data.repository.CrudRepository;

public interface PsychiatristRepo extends CrudRepository<Psychiatrist, Long> {
}
