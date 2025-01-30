package in.eurekaclient.EurekaClient.service;

import in.eurekaclient.EurekaClient.entity.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
    public User getUser(Integer id);
    public void deleteUser(Integer id);
}
