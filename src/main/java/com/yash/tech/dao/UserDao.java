/**
 * rajpal.dodiya
 */
package com.yash.tech.dao;

import com.yash.tech.model.User;

public interface UserDao {
	  void insert(User cus);	 
	  int getTotalNumberUser();
	}
