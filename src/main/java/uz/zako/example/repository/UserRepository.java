package uz.zako.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.zako.example.entity.User;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {
     Optional<User> findByUsername(String username);

}
