package com.github.hasanyelaldi.rabbitmq.repository;

import com.github.fabiomaffioletti.firebase.repository.DefaultFirebaseRealtimeDatabaseRepository;
import com.github.hasanyelaldi.rabbitmq.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends DefaultFirebaseRealtimeDatabaseRepository<User, String> {

}
