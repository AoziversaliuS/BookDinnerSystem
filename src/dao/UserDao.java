package dao;

import java.util.ArrayList;

import bean.User;

public interface UserDao {
	
	
	//�����ݿ������һ���û�
	public  abstract  void addUser(User u);
	
	//������ݿ��е������û�
	public abstract  ArrayList<User> getUsers();
	
	//�޸�һ���Ѵ��ڵ��û�
	public abstract  void setUser(String userName);
	
	//�����û����õ����ݿ��е���Ӧ���û������û������ڣ��򷵻�null
	public abstract  User getUser(String userName);
	
	//ʵ����Ϊ UserDaoImpl
	
}
