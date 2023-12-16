package com.hannakot62.be.controller;

import com.hannakot62.be.model.Image;
import com.hannakot62.be.model.Order;
import com.hannakot62.be.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping("/add")
    public String add(@RequestBody Order order) {
        orderService.saveOrder(order);
        return "New order added";
    }

    @GetMapping("/getAll")
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderById (@PathVariable String id){
        Order order = orderService.getOrderById(id);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteOrderById(@PathVariable String id){
        orderService.deleteOrderById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Order> updateOrderById(@RequestBody Order order, @PathVariable String id){
        Order current = orderService.getOrderById(id);
        orderService.saveOrder(order);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
