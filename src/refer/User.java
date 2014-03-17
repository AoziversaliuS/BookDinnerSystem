package refer;

public class User {

	public static final int CUSTOMER = 0;  
	public static final int RESTAURANT_MANAGER = 1;
	public static final int ADMIN = 2;
	
	private int id;             //�û�id  �����ظ�
	private String name;        //�û���      �����ظ�
	private String passWord;
	private String trueName;    //��ʵ����
	private String sex;
	private String age;
	private String personId;    //����֤��
	private String address;     //�Ͳ͵�ַ
	private String phone;
	private String Email;
	private String qq;
	
	private int role;           //�û�Ȩ��    �ǹ˿ͣ��͹��ϰ廹����Ӫ��
	
	private String regtime;     //ע��ʱ��
	private String modifedtime; //�Ը�����Ϣ������޸�ʱ��
	
	
	
	public User() {
		super();
	}
	public User(String name, String passWord, String trueName, String sex,
			String age, String personId, String address, String phone,
			String email, String qq, int role) {
		super();
		this.name = name;
		this.passWord = passWord;
		this.trueName = trueName;
		this.sex = sex;
		this.age = age;
		this.personId = personId;
		this.address = address;
		this.phone = phone;
		Email = email;
		this.qq = qq;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public String getRegtime() {
		return regtime;
	}
	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}
	public String getModifedtime() {
		return modifedtime;
	}
	public void setModifedtime(String modifedtime) {
		this.modifedtime = modifedtime;
	}
	
	
	
}