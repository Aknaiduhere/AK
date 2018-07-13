import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property {

	public static void main(String[] args) throws Exception
	{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("./Objrep/obj.properties");
		p.load(fis);
		System.out.println(p.getProperty("name"));


	}

}
