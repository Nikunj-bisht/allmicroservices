package com.example.fmicro.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "limits-service")
public interface RateProxy{
    @GetMapping(value = "/getrate")
    public ResponseEntity<List<Rate>> retrieverate();
}
