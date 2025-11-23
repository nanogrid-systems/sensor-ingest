package com.nanogrid.sensoringest.controller;

import org.springframework.web.bind.annotation.*;
import com.nanogrid.sensoringest.client.EdgeproxyClient;
@RestController
@RequestMapping("/sensoringest")
public class SensoringestController {
    private final EdgeproxyClient edgeproxyClient;
    public SensoringestController(EdgeproxyClient edgeproxyClient) {
        this.edgeproxyClient = edgeproxyClient;
    }

    @GetMapping("/{id}")
    public String getSensoringest(@PathVariable String id) {
        String edgeproxyData = edgeproxyClient.fetchEdgeproxy(id);        return "sensor-ingest data for ID: " + id;
    }
}
