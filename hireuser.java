import java.util.Date;

public class hireuser extends customer {
	public String  hirepersonno;
	private Date  recorddate;
	public hireuser() {
		
			
		}
	public String hirepersonno() {
		return hirepersonno;
		
	}
	public void sethirepersonno(String hirepersonno) {
  hirepersonno=hirepersonno;
}
	public  Date  getrecorddate() {
		return  recorddate;
	}
public void setrecorddate(Date recorddate) {
	this.recorddate=recorddate;
}