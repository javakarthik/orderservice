package org.gk.ms.spring.config.client;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class OrderController
{
	@Value("${name}")
	String name;

	@GetMapping("/name")
	public String name()
	{
		return name;
	}
}