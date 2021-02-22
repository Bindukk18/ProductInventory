package com.product.catalog.service;

import com.product.catalog.model.User;

public interface UserService {
	void save(User user);

    User findByUsername(String username);

}
