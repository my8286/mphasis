package com.travelandtour.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.travelandtour.model.*;

public interface UserRepository extends JpaRepository<User,Long> {
	public Optional<User> findByUserId(Long id);

}
