package com.niit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PageController {
@RequestMapping("/")
public String getIndexPage() {
	System.out.println("inside controller");
	return "index";
}
@RequestMapping("/index")
public String gethomePage() {
	System.out.println("inside controller");
	return "index";
}
@RequestMapping("/shirts") 
public String getShirtsPage() {
	System.out.println("shirts loading");
	return "shirts";
}
@RequestMapping("/sarees") 
public String getSareesPage() {
	System.out.println("sarees loading");
	return "sarees";
}
@RequestMapping("/skirts") 
public String getSkirtsPage() {
	System.out.println("skirts loading");
	return "skirts";
}
@RequestMapping("/dresses")
public String getDressesPage() {
	System.out.println("dresses loading");
	return "dresses";
}
@RequestMapping("/sweaters")
public String getSweatersPage() {
	System.out.println("sweaters loading");
	return "sweaters";
}
@RequestMapping("/about") 
public String getAboutPage() {
	System.out.println("about loading");
	return "about";
}
@RequestMapping("/products")
public String getProductsPage() {
	System.out.println("product loading");
	return "products";
}
@RequestMapping("/faq")
public String getFatPage() {
	System.out.println("faq is loading");
	return "faq";
}
@RequestMapping("/mail")
public String getMailPage() {
	System.out.println("mail is loading");
	return "mail";
}
@RequestMapping("/short")
public String getShortPage() {
	System.out.println("code is loading");
	return "short";
}
@RequestMapping("/checkout")
public String getCheckoutPage() {
	System.out.println("checking.......");
	return "checkout";
}
@RequestMapping("/single")
public String getSinglePage() {
	System.out.println("single.......");
	return "single";
}
@RequestMapping("/jeans")
public String getLeansPage() {
	System.out.println("jeans.......");
	return "jeans";
}
@RequestMapping("/sandals")
public String getSandalsPage() {
	System.out.println("sandals.......");
	return "sandals";
}
@RequestMapping("/salwars")
public String getSalwarsPage() {
	System.out.println("salwars.......");
	return "salwars";
}
@RequestMapping("/login")
public String getLoginPage() {
	System.out.println("login.......");
	return "login";
}
@RequestMapping("/register")
public String getRegisterPage() {
	System.out.println("register.......");
	return "register";
}
}