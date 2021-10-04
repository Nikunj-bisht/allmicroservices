package com.example.fmicro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(value = "/find")
public class Searchservicecontroller {

//    private EntityManager entityManager;
//
@Autowired
private  RateProxy rateProxy;
//
//    @Autowired
//    public Searchservicecontroller(EntityManager entityManager){
//        this.entityManager = entityManager;
//    }
//
//
    @GetMapping("seconf_feing")
    public List<Rate> connecttomicroservicebyfeing(){

        ResponseEntity<List<Rate>> rateResponseEntity = rateProxy.retrieverate();

return rateResponseEntity.getBody();
    }
//
//

    @GetMapping(value = "/second")
    public List<Rate> connecttomicroservice(){

      ResponseEntity<List<Rate>> rateResponseEntity = new RestTemplate().exchange("https://firstmicroservice.herokuapp.com/getrate"
                , HttpMethod.GET , null,new ParameterizedTypeReference<List<Rate>>(){});

        return rateResponseEntity.getBody();
    }

//    @PostMapping("/service")
//    public @ResponseBody
//    ResponseEntity<?> getservices(@RequestParam(name = "service") String service , @RequestBody Coordinate coordinate){
//
//return null;
//
//
//    }

}
