package com.crunchify.dao;

import java.util.ArrayList;

import com.crunchify.model.User;

public interface UserDAO {

	public boolean login(String username, String password);
	public ArrayList<User> getUsers();
}
