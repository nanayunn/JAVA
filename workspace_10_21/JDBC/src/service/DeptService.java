package service;

import java.util.List;

import VO.DeptVO;

public interface DeptService {
	//서비스로 끝나면 다 Interface.
	public void UpdateDept(DeptVO vo) throws Exception;
	public  void DeleteDept(int deptno);
	public int insertDept(DeptVO vo);
	public int insertDept(String dname, String loc);
	public DeptVO  getDept(int deptno);
	public List<DeptVO>  getDeptAll();
	
	
}
