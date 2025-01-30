package in.eurekaclient.EurekaClient.controller;

import in.eurekaclient.EurekaClient.entity.User;
import in.eurekaclient.EurekaClient.repository.UserRepo;
import in.eurekaclient.EurekaClient.service.UserImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserImple userImple;

    @PostMapping("/save")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        User saveUser = userImple.saveUser(user);
        return ResponseEntity.ok(saveUser);
    }

    @GetMapping("/allUsers")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> getUsers= userImple.getAllUsers();
        return ResponseEntity.ok(getUsers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getOneUser(@PathVariable Integer id){
        User getUser = userImple.getUser(id);
        return ResponseEntity.ok(getUser);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Integer id){
        userImple.deleteUser(id);
    }

}
