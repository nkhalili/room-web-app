package com.navid.boot.landon.roomwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    private final RoomServices roomServices;

    @Autowired
    public ApiController(RoomServices roomServices) {
        super();
        this.roomServices = roomServices;
    }

    @GetMapping("/rooms")
    public List<Room> getAllRooms(){
        return this.roomServices.getAllRooms();
    }
}
