package com.fm.footballer_service.controller;


import com.fm.footballer_service.dto.FootballerResponseDTO;
import com.fm.footballer_service.service.FootballerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/footballers")
public class FootballerController {


    private final FootballerService footballerService;

    public FootballerController(FootballerService footballerService) {
        this.footballerService = footballerService;
    }

    @GetMapping
    public ResponseEntity<List<FootballerResponseDTO>> getFootballers() {

        List <FootballerResponseDTO> footballers = footballerService.getFootballers();
        return ResponseEntity.ok().body(footballers);


    }
}
