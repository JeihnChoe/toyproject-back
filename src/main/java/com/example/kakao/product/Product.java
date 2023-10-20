package com.example.kakao.product;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

// import com.example.kakao.user.User.UserBuilder;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "product_tb")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // PK
    @Column(length = 100, nullable = false)
    private String productName; // 상품명
    @Column(length = 100, nullable = false)
    private String productEngName; // 상품영문명
    private int code; // 상품코드 (음료1 푸드2)
    @Column(length = 1000, nullable = false)
    private String description; // 상품설명
    @Column(length = 500)
    private String image; // 상품이미지
    private int price; // 가격
    private String note; // hot,new,best

    @Builder
    public Product(int id, String productName, String productEngName, int code, String description, String image,
            int price, String note) {
        this.id = id;
        this.productName = productName;
        this.productEngName = productEngName;
        this.code = code;
        this.description = description;
        this.image = image;
        this.price = price;
        this.note = note;
    }

    // public static UserBuilder builder() {
    // return null;
    // }

}
