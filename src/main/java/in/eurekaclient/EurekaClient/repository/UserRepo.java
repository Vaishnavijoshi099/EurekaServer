package in.eurekaclient.EurekaClient.repository;

import in.eurekaclient.EurekaClient.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
}
