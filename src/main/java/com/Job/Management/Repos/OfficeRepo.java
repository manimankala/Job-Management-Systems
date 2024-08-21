package com.Job.Management.Repos;

import com.Job.Management.Models.Office;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OfficeRepo extends MongoRepository<Office, String> {

}
