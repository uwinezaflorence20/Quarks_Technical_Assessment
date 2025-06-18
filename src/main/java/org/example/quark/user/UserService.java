package org.example.quark.user;

import org.springframework.stereotype.Service;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class UserService {
    private final Map<UUID, User> userStorage = new ConcurrentHashMap<>();

    public User createUser(String name, String email) {
        if (name == null || email == null || name.isBlank() || email.isBlank()) {
            throw new IllegalArgumentException("Name and email must not be blank");
        }
        User user = new User(name, email);
        userStorage.put(user.getId(), user);
        return user;
    }

    public Optional<User> getUserById(UUID id) {
        return Optional.ofNullable(userStorage.get(id));
    }
}