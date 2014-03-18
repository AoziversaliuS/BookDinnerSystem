package dao;

import java.util.ArrayList;

import bean.Restaurant;


public interface IRestaurantDao {
	
	//�����ݿ������һ���͹�
	public  abstract  void addRestaurant(Restaurant r);
	
	//������ݿ��е����в͹�
	public abstract  ArrayList<Restaurant> getRestaurants();
	
	//�޸�һ���Ѵ��ڵĲ͹�
	public abstract  void setRestaurant(Restaurant r);
	
	//���������õ����ݿ��е���Ӧ�Ĳ͹ݣ����͹ݲ����ڣ��򷵻�null
	public abstract  Restaurant getRestaurant(String managerName_or_restaurantName);
	
	//�����û�id�õ����ݿ��е���Ӧ�Ĳ͹ݣ����͹ݲ����ڣ��򷵻�null
	public abstract  Restaurant getRestaurant(int restaurantId);
	
	public abstract void deleteRestaurant(int restaurantId);
	
	//ʵ����Ϊ RestaurantDaoImpl
}
