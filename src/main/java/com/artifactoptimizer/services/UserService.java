package com.artifactoptimizer.services;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.artifactoptimizer.dao.UserDAO;
import com.artifactoptimizer.entities.User;

@Service
public class UserService {

	private final UserDAO userDAO;

	@Autowired
	public UserService(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public User createUser(User user) {
		User newUser = new User();
		newUser.setUsername(user.getUsername());
		newUser.setEmail(user.getEmail());
		newUser.setPassword(user.getPassword());
		return userDAO.save(newUser);
	}

	public void deleteUserById(Long id) {
		userDAO.deleteById(id);
	}

	public List<User> getAllUser() {
		return userDAO.findAll();
	}

	public Optional<User> findUserByID(Long id) {
		return userDAO.findById(id);
	}

}
