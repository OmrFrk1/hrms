package hrms.hrms.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User , Integer>{

}
