package Draw;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Draw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BeanFactory f= new XmlBeanFactory(new FileSystemResource("sp.xml"));
	}

}
