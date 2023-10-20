package com.example.kakao.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kakao._core.utils.ApiUtils;
import com.example.kakao.product.ProductResponse.FindAllDTO;
import com.example.kakao.product.ProductResponse.FindByProductIdDTO;

import lombok.ToString;

@RestController
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<?> findAllProduct() {

        List<FindAllDTO> responseDTO = productService.findAllproduct();

        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));

    }

    @GetMapping("/products/{id}")
    public ResponseEntity<?> findById(@PathVariable int id) {

        System.out.println(id);

        FindByProductIdDTO responseDTO = productService.findByProductId(id);

        System.out.println();

        System.out.println("테스트 : 컨트롤러 최종");
        return ResponseEntity.ok().body(ApiUtils.success(responseDTO));

    }

}
