package in.eurekaclient.EurekaClient.service;

import in.eurekaclient.EurekaClient.entity.User;
import in.eurekaclient.EurekaClient.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImple implements UserService{

    @Autowired
    private UserRepo urepo;

    @Override
    public User saveUser(User user) {
        return urepo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return urepo.findAll();
    }

    @Override
    public User getUser(Integer id) {
        return urepo.findById(id).get();
    }

    @Override
    public void deleteUser(Integer id) {
        urepo.deleteById(id);
    }
}
