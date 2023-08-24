package functionalDriven;

import java.io.IOException;

public class EmployeeRegistrationTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		String res;
		BusinessMethods bm = new BusinessMethods();
		
		res = bm.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res = bm.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res = bm.orgEmpReg("Nidish", "G", "NG45789");
		System.out.println("Employee Registration "+res);
		
		res = bm.orgLogout();
		System.out.println("Application Logout "+res);
		
		bm.brClose();
		System.out.println("Application Closed Successfully");

	}

}
