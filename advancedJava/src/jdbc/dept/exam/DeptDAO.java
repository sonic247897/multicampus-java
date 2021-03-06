package jdbc.dept.exam;

import java.util.ArrayList;

interface DeptDAO {
	public int insert(DeptDTO dept);
	public DeptDTO getDeptInfo();
	public int update(DeptDTO dept);
	public int delete(String deptno);
	public ArrayList<DeptDTO> getDeptList();
	public ArrayList<DeptDTO> getMemberList(String deptno);
}
