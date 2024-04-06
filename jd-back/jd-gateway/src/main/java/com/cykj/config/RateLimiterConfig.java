package com.cykj.config;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;


@Configuration
public class RateLimiterConfig {
    @Bean
    public KeyResolver userKeyResolver(){
        KeyResolver keyResolver = new KeyResolver() {
            @Override
            public Mono<String> resolve(ServerWebExchange exchange) {
                //我现在修改了这里
                //还不错哦
//                String value =
//                        exchange.getRequest().getQueryParams().getFirst("userId");
                String hostName = exchange.getRequest().getRemoteAddress().getAddress().getHostName();
                System.out.println("取到的ip地址是："+ hostName);
                return Mono.just(hostName);
            }
        };
        return keyResolver;
    }
}