package io.mentalhealthdb.repository;

import io.mentalhealthdb.domain.Counselor;
import org.springframework.data.repository.CrudRepository;

public interface CounselorRepo extends CrudRepository<Counselor, Long> {
}
