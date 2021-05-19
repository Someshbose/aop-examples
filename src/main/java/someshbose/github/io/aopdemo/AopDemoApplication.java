package someshbose.github.io.aopdemo;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import someshbose.github.io.aopdemo.method_invocation.Agent;
import someshbose.github.io.aopdemo.method_invocation.AgentDecorator;

@SpringBootApplication
public class AopDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopDemoApplication.class, args);
	}

}
