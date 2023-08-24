package functionalDriven;

import java.io.IOException;

public class TestSuiteEg {

	public static void main(String[] args) throws InterruptedException, IOException {
		String res;
		BusinessMethods bm = new BusinessMethods();
		
		res = bm.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res = bm.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res = bm.orgLogout();
		System.out.println("Application Logout "+res);
		
		bm.brClose();
		System.out.println("Application Closed Successfully");
		
		
		res = bm.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res = bm.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res = bm.orgEmpReg("Nidish", "G", "NG489");
		System.out.println("Employee Registration "+res);
		
		res = bm.orgLogout();
		System.out.println("Application Logout "+res);
		
		bm.brClose();
		System.out.println("Application Closed Successfully");

		
		
		res = bm.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res = bm.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res = bm.orguserReg("Nidish G", "AANidishG7895313", "Test@5432167890");
		System.out.println("User Registration "+res);
		
		res = bm.orgLogout();
		System.out.println("Application Logout "+res);
		
		bm.brClose();
		System.out.println("Application Closed Successfully");

		
		
		res = bm.orgLaunch("Firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res = bm.orgLogin("AANidishG7895313", "Test@5432167890");
		System.out.println("Application Login "+res);
		
		res = bm.orgLogout();
		System.out.println("Application Logout "+res);
		
		bm.brClose();
		System.out.println("Application Closed Successfully");

	}

}
