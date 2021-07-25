package com.nthieu.springsimpledemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("ip-addresses")
@Slf4j
public class IpAddressController {

    @GetMapping
    public String getIpAddressInfo(HttpServletRequest request) {
        String ipAddress = request.getHeader("X-Forward-For");
        if (ipAddress == null) {
            ipAddress = request.getRemoteAddr();
        }
        return ipAddress;
    }
}
