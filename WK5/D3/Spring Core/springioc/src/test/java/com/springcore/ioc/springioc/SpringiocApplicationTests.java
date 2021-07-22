package com.springcore.ioc.springioc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringiocApplicationTests {

	// @Test
	// void contextLoads() {
	// }
	public static void main(String[] args) {
		BeanFactry brans = new XmlBeanFactory(new FileSystemResource("bean.xml"));
	
	SpringiocApplication sp1 = (SpringiocApplication)beans.getBean("springiocApplication1");
		System.out.println(sp1);
	SpringiocApplication sp2 = (SpringiocApplication)beans.getBean("springiocApplication2");
		System.out.println(sp2);
	}
}
