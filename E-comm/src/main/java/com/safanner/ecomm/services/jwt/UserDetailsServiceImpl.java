package com.safanner.ecomm.services.jwt;

import com.safanner.ecomm.entities.User;
import com.safanner.ecomm.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> optionalUser = userRepository.findFirstByEmail(username);
        if (optionalUser.isEmpty()) {
            throw new UsernameNotFoundException("Username not found");
        }
        User user = optionalUser.get(); // Extract the User object from Optional
        return new org.springframework.security.core.userdetails.User(
                user.getEmail(),
                user.getPassword(), // Assuming getPassword() returns the user's password
                new ArrayList<>() // Authorities, assuming it's an empty list for now
        );
    }

}
