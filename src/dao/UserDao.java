package dao;

import java.util.ArrayList;

import bean.User;

public interface UserDao {
	
	
	//�����ݿ������һ���û�
	public  abstract  void addUser(User u);
	
	//������ݿ��е������û�
	public abstract  ArrayList<User> getUsers();
	
	//�޸�һ���Ѵ��ڵ��û�
	public abstract  void setUser(User u);
	
	//�����û����õ����ݿ��е���Ӧ���û������û������ڣ��򷵻�null
	public abstract  User getUser(String userName);
	
	//�����û�id�õ����ݿ��е���Ӧ���û������û������ڣ��򷵻�null
	public abstract  User getUser(int userId);
	
	public abstract void deleteUser(int userId);
	
	//ʵ����Ϊ UserDaoImpl
	
}
