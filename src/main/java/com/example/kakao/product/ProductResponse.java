package com.example.kakao.product;

import javax.persistence.Column;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class ProductResponse {
    @ToString
    @Getter
    @Setter
    public static class FindAllDTO {
        private Integer id;
        private String image;
        private String productName;
        private String productEngName;
        private Integer productPrice;

        public FindAllDTO(Product product) {
            this.id = product.getId();
            this.image = product.getImage();
            this.productName = product.getProductName();
            this.productEngName = product.getProductEngName();
            this.productPrice = product.getProductPrice();
        }
    }

    @ToString
    @Getter
    @Setter
    public static class FindByProductIdDTO {
        private Integer id;
        private String image;
        private String producName;
        private String description;
        private Integer price;
        private String productInfo;
        private String allergy;

        public FindByProductIdDTO(Product product) {
            this.id = product.getId();
            this.image = product.getImage();
            this.producName = product.getProductName();
            this.description = product.getDescription();
            this.price = product.getProductPrice();
            this.productInfo = product.getProductInfo();
            this.allergy = product.getProductAllergy();
        }
    }
}
