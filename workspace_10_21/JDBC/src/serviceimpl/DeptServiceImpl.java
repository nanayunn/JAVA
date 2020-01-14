package serviceimpl;

import java.util.List;

import DAO.DeptDAO;
import VO.DeptVO;
import service.DeptService;

//비즈니스 레이어

public class DeptServiceImpl implements DeptService{

	
	private DeptDAO dao = null;
	
	
	
	
	
	
	public DeptServiceImpl() {}


	public DeptServiceImpl(DeptDAO dao) {
		super();
		this.dao = dao;
	}


	public void UpdateDept(DeptVO vo) {
		dao.UpdateDept(vo);
		
	}

	
	public void DeleteDept(int deptno) {
		dao.DeleteDept(deptno);
		
	}


	public int insertDept(DeptVO vo) {
		
		return dao.insertDept(vo);
		
	}


	public int insertDept(String dname, String loc) {
		
		return dao.insertDept(dname, loc);
	}


	@Override
	public String toString() {
		return "DeptServiceImpl [dao=" + dao + "]";
	}


	public DeptDAO getDao() {
		return dao;
	}


	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}


	public DeptVO getDept(int deptno) {
		
		return dao.getDept(deptno);
	}

	
	public List<DeptVO> getDeptAll() {
		
		return dao.getDeptAll();
	}
		
}
