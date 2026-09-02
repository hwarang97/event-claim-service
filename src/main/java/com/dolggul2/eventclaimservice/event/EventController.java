package com.dolggul2.eventclaimservice.event;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/events")
public class EventController {

    @GetMapping
    public List<String> getEvents() {
        return new ArrayList<>();
    }
}
