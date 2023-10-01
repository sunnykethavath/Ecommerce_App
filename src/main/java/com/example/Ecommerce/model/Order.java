package com.example.Ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Validated
@Table(name = "order_Table")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    @OneToOne
    @JoinColumn(name = "fk_UserId")
    User userId;
    @OneToOne
    @JoinColumn(name = "fk_AddressId")
    Address addressId;
    @OneToOne
    @JoinColumn(name = "fk_ProductId")
    Product productId;

    private Integer quantity;
}
