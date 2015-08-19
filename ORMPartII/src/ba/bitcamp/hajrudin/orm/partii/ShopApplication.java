package ba.bitcamp.hajrudin.orm.partii;

import java.math.BigDecimal;

import org.avaje.agentloader.AgentLoader;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.EbeanServer;

public class ShopApplication {

	static {
		AgentLoader.loadAgentFromClasspath("avaje-ebeanorm-agent",
				"debug=1;packages=ba.bitcamp.hajrudin.orm.partii.**");

	}

	private static EbeanServer server = Ebean.getServer("h2");

	public static void main(String[] args) {
		User u = new User();
		u.setFullName("Hajrudin Sehic");
		u.setEmail("hajrudin.sehic@hotmail.com");
		u.setBalance(new BigDecimal(6334.1));
		
		Product monitor = new Product();
		monitor.setTitle("Monitor, Dell");
		monitor.setPrice(new BigDecimal("124.4"));
		monitor.setQuantity(0);
		
		Ebean.save(u);
		Ebean.save(monitor);
		
		System.out.println(u.getId());
		System.out.println(monitor.getId());
		
		monitor.setQuantity(10);
		
		Ebean.update(monitor);
		System.out.println(monitor.getQuantity());
	}
}
