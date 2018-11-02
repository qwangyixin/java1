
public class hireusertest {
	public static void main(String[] args) {
		customer customer=new customer();
		hireuser hireUser=new hireuser();
		
		customer.username="王瑞";
		customer.phone="86338180";
		System.out.println("客户用户名="+customer.userName);
		System.out.println("客户电话="+customer.phone);
		
		hireUser.username="王旭东";
		hireUser.phone="86338183";
		System.out.println("客户用户名="+customer.userName);
		System.out.println("客户电话="+customer.phone);
		
		hireUser.setSex('男');
		hireUser.setAddress("江苏常州市武进区");
		System.out.println("客户用户名="+customer.userName);
		System.out.println("客户电话="+customer.phone);
		
		customer.showusername();
		hireUser.showusername();

}
