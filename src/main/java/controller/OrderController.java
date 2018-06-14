package controller;
import entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import repository.OrderRepository;
import request.OrderRequest;
import response.OrderResponse;

import java.util.UUID;

@Controller
public class OrderController {
    private OrderRepository orderRepository;

    @Autowired
    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PostMapping(path = "/order")
    @ResponseBody
    public OrderResponse response(OrderRequest request) {
        OrderResponse response = new OrderResponse();
        Order clientByPhoneNumber = orderRepository.findByPhoneNumber(Integer.parseInt(request.getPhoneNumber()));
        Order clientByName = orderRepository.findByName(request.getName());
        Order orderByTime = orderRepository.findByTime(request.getTime());
        Order orderByDepartAddr = orderRepository.findByDepartureAddress(request.getDepartureAddress());
        Order orderByArrAdrr = orderRepository.findByArrivalAddress(request.getArrivalAddress());
        Order orderByCost = orderRepository.findByCost(request.getCost());
        if(clientByPhoneNumber == null && clientByName == null && orderByTime == null && orderByDepartAddr == null && orderByArrAdrr == null && orderByCost == null){
            Order newOrder = new Order(request.getName(), request.getPhoneNumber(), request.getTime(), request.getDepartureAddress(), request.getArrivalAddress(), request.getCost());
            orderRepository.save(newOrder);
            response.setUuid(UUID.randomUUID());
        }
        return response;
    }
}

