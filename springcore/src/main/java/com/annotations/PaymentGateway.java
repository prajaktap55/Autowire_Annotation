package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class PaymentGateway 
{
//	 you can use @Autowired annotation to auto wire spring bean on setter method, instance variable, and constructor.
	
	//@Autowired annotation on setter method
	@Autowired
	private Order order;
    
    public Order getOrder() {
        return order;
    }
 
    //@Autowired annotation on setter method
    //@Autowired 
    public void setOrder(Order order) {
        this.order = order;
    }
 
    @Override
    public String toString(){
        return "ordering "+this.order.getItem()+" | price: "+this.order.getPrice();
    }
	

}
