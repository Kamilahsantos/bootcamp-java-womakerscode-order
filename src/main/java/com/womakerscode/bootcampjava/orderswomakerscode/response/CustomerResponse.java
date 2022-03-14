package com.womakerscode.bootcampjava.orderswomakerscode.response;


import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)

public class CustomerResponse {

    private Long id;
    private String address;
    private String name;
}
