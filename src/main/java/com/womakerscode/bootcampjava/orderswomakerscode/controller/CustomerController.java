package com.womakerscode.bootcampjava.orderswomakerscode.controller;

import com.womakerscode.bootcampjava.orderswomakerscode.client.CustomerWebClient;
import com.womakerscode.bootcampjava.orderswomakerscode.response.CustomerResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/customer-client")
@Slf4j
public class CustomerController {

    private final CustomerWebClient customerWebClient;


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<CustomerResponse> findCustomerById(@PathVariable String id) {
        log.info("Buscando cliente com o id [{}]", id);
        return customerWebClient.findCustomerById(id);
    }


    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public Flux<CustomerResponse> findAllCustomers() {
        log.info("Listando todos os customers cadastrados na base");
        return customerWebClient.ListCustomers();
    }
}
