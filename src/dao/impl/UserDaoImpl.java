package dao.impl;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

import dao.IUserDao;

import bean.User;



public class UserDaoImpl implements IUserDao {

	
	private static final String location = "localhost:3306/bds";
	private static final String user = "root";
	private static final String password = "aoziversalius";
	
	private static final String TABLE_NAME = "user"; 
	
	private static final String url = "jdbc:mysql://"+location+"?characterEncoding=utf8";

	private static java.sql.Connection conn = null;
	private static java.sql.Statement stmt = null;
	private static java.sql.PreparedStatement pre = null;

	private  void load() {
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(url, user, password);
				stmt = conn.createStatement();
//				System.out.println("加载JDBC成功,已建立连接！");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				System.out.println("加载JDBC驱动失败！");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("建立连接失败!");
			}
			createTable();//若数据库中无表格，则建立表格

	}
	private  void release(){
		
			try {
				
				if(pre != null){
				pre.close();
				}
				if(stmt != null){
					stmt.close();
				}
				if(conn != null){
					conn.close();
				}
//				System.out.println("已断开与数据库的链接");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	}
	
	public  void addUser(User u){
		
		addWithId(u,false);
		
	}
	
	private void addWithId(User u,boolean withId){
		load();
		String sql;
		int i = 0;
		if(withId){
			i = 1;
			sql = "insert into "+TABLE_NAME+
					"(id,name,passWord,realName,sex,age,personId,address,phone,Email,qq,role,regtime,modifedtime)"+
			              "values(?,?,?,?,?,?,?,?,?,?,?,?,SYSDATE(),SYSDATE());";
		}else{
			sql = "insert into "+TABLE_NAME+
					"(name,passWord,realName,sex,age,personId,address,phone,Email,qq,role,regtime,modifedtime)"+
			              "values(?,?,?,?,?,?,?,?,?,?,?,SYSDATE(),SYSDATE());";
		}
		
		
		try {
			pre = conn.prepareStatement(sql);
			if(withId){
				pre.setInt(1, u.getId());
			}
			System.out.println("用户权限:"+u.getRole());
			pre.setString(1+i, u.getName());
			pre.setString(2+i, u.getPassWord());
			pre.setString(3+i,u.getRealName());
			pre.setString(4+i,u.getSex());
			pre.setString(5+i,u.getAge());
			pre.setString(6+i,u.getPersonId());
			pre.setString(7+i,u.getAddress());
			pre.setString(8+i,u.getPhone());
			pre.setString(9+i,u.getEmail());
			pre.setString(10+i,u.getQq());
			pre.setInt(11+i,u.getRole());
			pre.execute();
			System.out.println("添加用户成功！");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("添加用户失败！");
		}
		release();
	}
	
	public  ArrayList<User> getUsers(){
		load();
		ResultSet rs = null;
		ArrayList<User> users = null;
		User u = null;
		rs = executeQuery("select id,name,passWord,realName,sex,age,personId,address,phone,Email,qq,role,regtime,modifedtime from "+TABLE_NAME+";");
		if(rs != null){
			try {
				users = new ArrayList<User>();
				while(rs.next()){
					u = new User();
					u.setId(rs.getInt(1));
					u.setName(rs.getString(2));
					u.setPassWord(rs.getString(3));
					u.setRealName(rs.getString(4));
					u.setSex(rs.getString(5));
					u.setAge(rs.getString(6));
					u.setPersonId(rs.getString(7));
					u.setAddress(rs.getString(8));
					u.setPhone(rs.getString(9));
					u.setEmail(rs.getString(10));
					u.setQq(rs.getString(11));
					u.setRole(rs.getInt(12));
					u.setRegtime(rs.getString(13));
					u.setModifedtime(rs.getString(14));
//					users.add(new User(
//							rs.getString("User"),
//							rs.getString("PassWord"), 
//							rs.getString("Email"), 
//							rs.getString("Phone"), 
//							rs.getString("QQ")
//							));
					users.add(u);
				}
//				System.out.println("获取所有用户数据！");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("获取所有用户数据失败！");
			}
		}
		release();
//		System.out.println(users.size());
		return users;
	}

	public  User getUser(String userName){
		load();
		ArrayList<User> users = null;
		users = getUsers();
		if(users != null){
			for(User u:users){
				if(u.getName().trim().equals(userName.trim())){
					System.out.println("获取用户数据成功！");
					return u;
				}
			}
		}
		release();
		return null;
	}
	public User getUser(int userId) {
		load();
		ArrayList<User> users = null;
		users = getUsers();
		if(users != null){
			for(User u:users){
				if(u.getId() == userId){
					System.out.println("获取用户数据成功！");
					return u;
				}
			}
		}
		release();
		return null;
	}
	
	
	public void setUser(User u) {
		deleteUser(u.getId());
		addWithId(u,true);
		
	}
	
	public void deleteUser(int userId) {
		load();
		String sql = "delete from user where id = "+userId+"";
		try {
			stmt.execute(sql);
			System.out.println("删除用户成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		release();
		
	}
	

	
	

	
	
	
	
	
	
	private static void createTable(){
		boolean hasTable = false;
		ResultSet rs = null;
		rs = executeQuery("show tables;");
		if(rs != null){
			try {
				while(rs.next()){
					String table = rs.getString(1);
					if(table.equals(TABLE_NAME)){
						hasTable = true;
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("查询table时出错！");
			}
		}
		if(hasTable == false){
			String sql = "create table "+TABLE_NAME+"(                  "
					+  "       id  INT  AUTO_INCREMENT  ,               "
					+  "       name varchar(30)  ,                      "
					+  "      password  varchar(30) ,                   "
					+  "       realname varchar(30),                    "
					+  "      sex varchar(5),                           "
					+  "       age varchar(30),                                 "
					+  "      personId   varchar(30),                           "
					+  "       address varchar(30),                      "
					+  "          phone   varchar(30),                  "
					+  "       email varchar(30),                        "
					+  "       qq varchar(30),                           "
					+  "       regtime   date     ,                        "
					+  "       role INT ,                                "
					+  "       modifedtime date     ,                    "
					+  "      PRIMARY KEY(id)                       "
					+  "      ) "
					+  "ENGINE=InnoDB;           ";
			try {
				stmt.execute(sql);
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("创建table时出错！");
			}
	       System.out.println("用户表格已建立");
		}
		else{
//			System.out.println("________________________");
//			System.out.println("数据库中已存在webWser表格，无需再次添加。");
		}
	}
	

	
	
	private static void execute(String sql){
		try {
			stmt.execute(sql);
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("执行Sql语句失败！");
		}
	}
	private static ResultSet executeQuery(String sql){
		try {
			return stmt.executeQuery(sql);
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println("执行Sql语句失败！");
		}
		return null;
	}



	
	
	
	public static void main(String[] args) {
		
		UserDaoImpl udi = new UserDaoImpl();
//		udi.addUser(new User("奥茨", "passWord", "realName", "sex", "age", "personId", "address", "phone", "Email", "qq", User.ADMIN));
		
//		System.out.println(udi.getUsers().size());
//		User u = udi.getUser("奥茨");
//		u.setName("奥茨2");
//		udi.setUser(u);
//		System.out.println(u.getModifedtime());
//		System.out.println("用户权限为: "+u.getRegtime());
//		System.out.println(u.getName());
	}
	
	
	
	
	
	
}