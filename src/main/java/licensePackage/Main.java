package licensePackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("licensespring.xml");
		License licenseobj = context.getBean("license",License.class);
		licenseobj.displayInfo();

	}

}
