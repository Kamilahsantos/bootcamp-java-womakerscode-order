package com.womakerscode.bootcampjava.orderswomakerscode.client;


import com.womakerscode.bootcampjava.orderswomakerscode.response.CustomerResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
@Slf4j
public class CustomerWebClient {

    private final WebClient webClient;


    public CustomerWebClient(WebClient.Builder builder) {
        webClient = builder.baseUrl("http://localhost:8082/customer").build();
    }


    public Flux<CustomerResponse> ListCustomers() {
        log.info("Buscando todas as clientes criadas no serviço de customer");
        return webClient.get()
                .accept(APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(CustomerResponse.class);
    }

    public Mono<CustomerResponse> findCustomerById(String id) {
        return webClient.get()
                .uri("/{id}",id)
                .accept(APPLICATION_JSON)
                .retrieve()
                .bodyToMono(CustomerResponse.class);
    }
}
