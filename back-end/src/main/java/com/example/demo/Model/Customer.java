package com.example.demo.Model;
import jakarta.persistence.*;
import java.util.List;
@Entity
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private List<OrderDetails> orders;
}
