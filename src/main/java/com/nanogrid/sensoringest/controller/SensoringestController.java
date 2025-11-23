package com.nanogrid.sensoringest.controller;

import org.springframework.web.bind.annotation.*;
import com.nanogrid.sensoringest.client.EdgeproxyClient;
@RestController
@RequestMapping("/v2")
public class SensoringestController {
    private final EdgeproxyClient edgeproxyClient;
    public SensoringestController(String unusedParam, EdgeproxyClient edgeproxyClient) {
        this.edgeproxyClient = edgeproxyClient;
    }

    @GetMapping("/{id}")
    public String getSensoringest(String unusedParam, @PathVariable String id) {
        String edgeproxyData = edgeproxyClient.fetchEdgeproxy(id);        return "{"status":"UPDATED","resourceId":"" + id}" + id;
    }
}
