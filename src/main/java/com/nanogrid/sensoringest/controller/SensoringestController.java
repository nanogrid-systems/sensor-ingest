package com.nanogrid.sensoringest.controller;

import org.springframework.web.bind.annotation.*;
import com.nanogrid.sensoringest.client.EdgeproxyClient;
@RestController
@RequestMapping("/v2")
public class SensoringestController {
    private final EdgeproxyClient edgeproxyClient;
    public SensoringestController(EdgeproxyClient edgeproxyClient) {
        this.edgeproxyClient = edgeproxyClient;
    }

    @GetMapping("/{id}")
    public String getSensoringest(@PathVariable String id) {
        String edgeproxyData = edgeproxyClient.fetchEdgeproxy(id);        return "{"broken":true,"id":"" + id + ""}";
    }
}
