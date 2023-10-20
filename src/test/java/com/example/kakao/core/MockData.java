// package com.example.kakao.core;

// import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;

// import com.example.kakao.product.Product;
// import com.example.kakao.product.option.Option;
// import com.example.kakao.user.User;

// public class MockData {

// protected User getUser(int id, String username) {
// return User.builder()
// .id(id)
// .email(username + "@nate.com")
// .password("meta1234!")
// .username(username)
// .build();
// }

// // protected Product getProduct(int id, String name){
// // return Product.builder().id(id).

// // // .builder()
// // // .id(id).
// // // .productName(name)
// // // .price(1000)
// // // .image("/images/"+id+".jpg")
// // // .build();
// // }

// private int id; // PK
// private String productName; // 상품명
// private String productEnglishName; // 상품영문명
// private int code; // 상품코드 (음료1 푸드2)
// private String description; // 상품설명
// private String image; // 상품이미지
// private int price; // 가격
// private String note; // hot,new,best

// protected Option getOption(int id, String name, Product product) {
// return Option.builder()
// .id(id)
// .optionName(name)
// .price(1000)
// .product(product)
// .build();
// }
// }
