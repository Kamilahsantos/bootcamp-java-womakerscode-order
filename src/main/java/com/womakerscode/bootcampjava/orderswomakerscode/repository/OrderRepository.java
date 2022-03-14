package com.womakerscode.bootcampjava.orderswomakerscode.repository;

import com.womakerscode.bootcampjava.orderswomakerscode.model.Order;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository  extends ReactiveMongoRepository<Order, String> {
}
