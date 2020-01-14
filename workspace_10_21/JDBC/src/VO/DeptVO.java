package VO;

public class DeptVO {
	//value-object : VO
	
	int deptno; //NUMBER(2) CONSTRAINT PK_DEPT PRIMARY KEY,
	String dname; //VARCHAR2(14) ,
	String loc; //VARCHAR2(13)
	
	
	
	@Override
	public String toString() {
		return "DeptVO [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
