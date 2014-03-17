package tool;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

import bean.User;



public class UserDB {

	private static final String location = "localhost:3306/MySQL";
	private static final String user = "root";
	private static final String password = "aoziversalius";
	
	
	private static final String url = "jdbc:mysql://"+location+"?characterEncoding=utf8";

	private static java.sql.Connection conn = null;
	private static java.sql.Statement stmt = null;
	private static java.sql.PreparedStatement pre = null;

	private static void load() {
		
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
	private static void release(){
		
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
	
	public static void addUser(User u){
		
		load();
		String sql = "insert into webuser( User,PassWord,Email,Phone,QQ ) " +
		              "values(?,?,?,?,?);";
		
		try {
			pre = conn.prepareStatement(sql);
			pre.setString(1, u.getUser());
			pre.setString(2, u.getPassword());
			pre.setString(3,u.getEmail());
			pre.setString(4,u.getPhone());
			pre.setString(5,u.getQq());
			pre.execute();
			System.out.println("添加用户成功！");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("添加用户失败！");
		}
		release();
		
	}
	
	public static ArrayList<User> getUsers(){
		load();
		ResultSet rs = null;
		ArrayList<User> users = null;
		rs = executeQuery("select * from webuser;");
		if(rs != null){
			try {
				users = new ArrayList<User>();
				while(rs.next()){
//					System.out.println(rs.getString("User"));
					users.add(new User(
							rs.getString("User"),
							rs.getString("PassWord"), 
							rs.getString("Email"), 
							rs.getString("Phone"), 
							rs.getString("QQ")
							));
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

	public static User getUser(String userName){
		load();
		ArrayList<User> users = null;
		users = getUsers();
		if(users != null){
			for(User u:users){
				if(u.getUser().trim().equals(userName.trim())){
					System.out.println("获取用户数据成功！");
					return u;
				}
			}
		}
		release();
		return null;
	}
	public static void main(String[] args) {
		UserDB.addUser(new User("Aqq11C2222222", "22", "1", "2", "3"));
//		Sql.addUser(new User("奥茨", "22", "1", "2", "3"));
		UserDB.getUsers();
		UserDB.getUser("奥茨大神");
		System.out.println(UserDB.getUser("奥茨"));
	}
	
	

	
	
	
	
	
	
	private static void createTable(){
		boolean hasTable = false;
		ResultSet rs = null;
		rs = executeQuery("show tables;");
		if(rs != null){
			try {
				while(rs.next()){
					String table = rs.getString(1);
					if(table.equals("webuser")){
						hasTable = true;
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("查询table时出错！");
			}
		}
		if(hasTable == false){
			execute(
			   "create table WebUser(                        "
			+  "      User  varchar(20) PRIMARY KEY UNIQUE,  "
			+  "      PassWord varchar(20),                  "
			+  "      Email varchar(20),                     "
			+  "      Phone varchar(20),                     "
			+  "      QQ    varchar(20)                      "
			+  "      ) "
			+  "ENGINE=InnoDB DEFAULT CHARSET=GBK;           "
			);
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
	
	
	
	
	
	
	
	
	
}