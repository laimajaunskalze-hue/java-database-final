package com.example.demo.Model;
import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity
public class OrderDetails {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne @JoinColumn(name = "store_id")
    private Store store;
    @ManyToOne @JoinColumn(name = "customer_id")
    private Customer customer;
    /** Date and time when the order was placed */
    private LocalDateTime orderDate;
}
