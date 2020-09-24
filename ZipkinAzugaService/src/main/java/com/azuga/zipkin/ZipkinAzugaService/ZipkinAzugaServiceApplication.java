package com.azuga.zipkin.ZipkinAzugaService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.CompositeHealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication(exclude = { HttpEncodingAutoConfiguration.class})
@EnableZipkinServer
public class ZipkinAzugaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinAzugaServiceApplication.class, args);
	}

}
