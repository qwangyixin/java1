
public class hireusertest {
	public static void main(String[] args) {
		customer customer=new customer();
		hireuser hireUser=new hireuser();
		
		customer.username="����";
		customer.phone="86338180";
		System.out.println("�ͻ��û���="+customer.userName);
		System.out.println("�ͻ��绰="+customer.phone);
		
		hireUser.username="����";
		hireUser.phone="86338183";
		System.out.println("�ͻ��û���="+customer.userName);
		System.out.println("�ͻ��绰="+customer.phone);
		
		hireUser.setSex('��');
		hireUser.setAddress("���ճ����������");
		System.out.println("�ͻ��û���="+customer.userName);
		System.out.println("�ͻ��绰="+customer.phone);
		
		customer.showusername();
		hireUser.showusername();

}
