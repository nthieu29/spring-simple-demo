package com.nthieu.springsimpledemo.controller;

import com.nthieu.springsimpledemo.service.IpAddressService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ip-addresses")
@Slf4j
@AllArgsConstructor
public class IpAddressController {
    private final IpAddressService ipAddressService;

    @GetMapping("/{ipAddress}")
    public String getIpAddressInfo(@PathVariable String ipAddress) {
        return ipAddressService.getInfoForIpAddress(ipAddress);
    }
}
