package dao;

import java.util.ArrayList;

import bean.User;

public interface UserDao {
	
	
	//往数据库中添加一个用户
	public  abstract  void addUser(User u);
	
	//获得数据库中的所有用户
	public abstract  ArrayList<User> getUsers();
	
	//修改一个已存在的用户
	public abstract  void setUser(User u);
	
	//根据用户名拿到数据库中的相应的用户，若用户不存在，则返回null
	public abstract  User getUser(String userName);
	
	//根据用户id拿到数据库中的相应的用户，若用户不存在，则返回null
	public abstract  User getUser(int userId);
	
	public abstract void deleteUser(int userId);
	
	//实现类为 UserDaoImpl
	
}
