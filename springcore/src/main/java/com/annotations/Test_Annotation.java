package com.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Annotation {
	
	public static void main(String a[]){
        String confFile = "com/annotations/config.xml";
        ApplicationContext context 
                        = new ClassPathXmlApplicationContext(confFile);
        PaymentGateway paymentGateway = (PaymentGateway) context.getBean("paymentGateway");
        System.out.println(paymentGateway.toString());
    }

}
