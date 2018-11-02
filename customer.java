
public class customer {
	private  int userid;
	public  String  username;
	private  char sex;
	protected  String phone;
	private String homephone;
private String qq;
private String cardid;
private  String address;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public char getSex() {
	return sex;
}
public void setSex(char sex) {
	this.sex = sex;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getHomephone() {
	return homephone;
}
public void setHomephone(String homephone) {
	this.homephone = homephone;
}
public String getQq() {
	return qq;
}
public void setQq(String qq) {
	this.qq = qq;
}
public String getCardid() {
	return cardid;
}
public void setCardid(String cardid) {
	this.cardid = cardid;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public void showusername() {
	System.out.println("客户姓名"+username);
}
}
