package com.product.catalog.bootstrap;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.product.catalog.model.Product;
import com.product.catalog.repository.ProductRepository;
import com.product.catalog.service.SecurityServiceImpl;



@Component
public class ProductLoader implements ApplicationListener<ContextRefreshedEvent> {

    private ProductRepository productRepository;

    private static final Logger logger = LoggerFactory.getLogger(ProductLoader.class);


    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Product shirt = new Product();
        shirt.setDescription("Cool T Shirt");
        shirt.setPrice(new BigDecimal("18.95"));
        shirt.setImageUrl("../../static/images/Inventory.jpg");    
        productRepository.save(shirt);

        logger.info("Saved Shirt - id: " + shirt.getId());

        Product mug = new Product();
        mug.setDescription("Coffee Mug");
        mug.setImageUrl("../../static/images/Inventory.jpg");
        mug.setPrice(new BigDecimal("11.95"));
        productRepository.save(mug);

        logger.info("Saved Mug - id:" + mug.getId());
    }
}
