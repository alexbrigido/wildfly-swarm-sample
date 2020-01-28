package wildfly.demo;

import javax.ejb.Stateless;

@Stateless
public class DemoEJB {
 
    public String greet(String str) {
        return "Hello " +str;
    }
}
