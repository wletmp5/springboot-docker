package demo.springboot.docker.runner;

import demo.springboot.docker.model.User;
import demo.springboot.docker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private UserRepository userRepository;

    @Autowired
    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        userRepository.save(new User("Glenn", "Morales", "wletmp5"));
    }
}
