package server;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import Impl.TestInterfaceImpl;

public class TestServer {
	public static void main(String[] args) {
	
		JAXRSServerFactoryBean jAXRSServerFactoryBean = new JAXRSServerFactoryBean();
		jAXRSServerFactoryBean.setAddress("http://localhost:8080/rest/");
		jAXRSServerFactoryBean.setResourceClasses(TestInterfaceImpl.class);
		jAXRSServerFactoryBean.setServiceBean(new TestInterfaceImpl());
		jAXRSServerFactoryBean.create();
}
}
