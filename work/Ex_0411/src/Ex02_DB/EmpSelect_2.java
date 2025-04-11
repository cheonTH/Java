package Ex02_DB;

import java.util.List;

public class EmpSelect_2 {
	public static void main(String[] args) {
		List<Emp> list = EmpMethod.find("IT_PROG");
		
		for(Emp e : list) {
			System.out.printf("사번 : %d, 이름 : %s, 직무 : %s, 급여 : %d \n",e.getEmpno(), e.getEname(), e.getJob(), e.getSalary());
		}
	}
}
