package licensePackage;
import org.springframework.beans.factory.annotation.Value;

public class License {

	@Value("${license.name}")
	private String name;
	@Value("${license.age}")
	private int age;
	void displayInfo()
	{
		System.out.println("Name : " + name + ", age : " + age);
	}
	
	

}
