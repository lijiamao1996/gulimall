package com.arthur.gulimall.product;

import com.arthur.gulimall.product.entity.BrandEntity;
import com.arthur.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(6L);
//        brandEntity.setName("华为");
//        brandEntity.setName("阿里巴巴");
//        brandService.save(brandEntity);
//        System.out.println("ok");
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("name", "华为"));
        list.forEach((item)->{
            System.out.println(item);
        });
    }

}
