package tigerteam.seminaire.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import tigerteam.seminaire.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
