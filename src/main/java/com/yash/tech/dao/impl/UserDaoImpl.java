/**
 * rajpal.dodiya
 */
package com.yash.tech.dao.impl;


import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.yash.tech.dao.UserDao;
import com.yash.tech.model.User;
@Repository
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {

	
	
	@Autowired 
    DataSource dataSource;
 
    @PostConstruct
    private void initialize(){
        setDataSource(dataSource);
    }
    
	@Override
	 public void insert(User user) {
	     String sql = "INSERT INTO usr " +
	 "(first_name,last_name,phone,feedback) VALUES (?,?,?,?)" ;
	     getJdbcTemplate().update(sql, new Object[]{
	    user.getFirstName(),user.getLastName(),user.getPhone(),user.getFeedback()
	 });
	 }
	
	@Override
	 public int getTotalNumberUser() {
	     String sql = "SELECT Count(*) FROM usr";
	     int total = getJdbcTemplate().queryForObject(sql, Integer.class);
	     return total;
	 }
}
