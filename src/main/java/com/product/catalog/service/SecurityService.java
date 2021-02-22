package com.product.catalog.service;

public interface SecurityService {
	boolean isAuthenticated();
    void autoLogin(String username, String password);

}
