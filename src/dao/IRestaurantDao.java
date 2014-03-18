package dao;

import java.util.ArrayList;

import bean.Restaurant;


public interface IRestaurantDao {
	
	//往数据库中添加一个餐馆
	public  abstract  void addRestaurant(Restaurant r);
	
	//获得数据库中的所有餐馆
	public abstract  ArrayList<Restaurant> getRestaurants();
	
	//修改一个已存在的餐馆
	public abstract  void setRestaurant(Restaurant r);
	
	//根据名称拿到数据库中的相应的餐馆，若餐馆不存在，则返回null
	public abstract  Restaurant getRestaurant(String managerName_or_restaurantName);
	
	//根据用户id拿到数据库中的相应的餐馆，若餐馆不存在，则返回null
	public abstract  Restaurant getRestaurant(int restaurantId);
	
	public abstract void deleteRestaurant(int restaurantId);
	
	//实现类为 RestaurantDaoImpl
}
