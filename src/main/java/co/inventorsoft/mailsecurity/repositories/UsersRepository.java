package co.inventorsoft.mailsecurity.repositories;

import co.inventorsoft.mailsecurity.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {

    Optional<User> findOneByLogin(String login);
}
