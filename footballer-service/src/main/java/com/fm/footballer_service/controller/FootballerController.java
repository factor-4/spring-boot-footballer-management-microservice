package com.fm.footballer_service.controller;


import com.fm.footballer_service.dto.FootballerRequestDTO;
import com.fm.footballer_service.dto.FootballerResponseDTO;
import com.fm.footballer_service.service.FootballerService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

        List<FootballerResponseDTO> footballers = footballerService.getFootballers();
        return ResponseEntity.ok().body(footballers);

    }

    @PostMapping
    public ResponseEntity<FootballerResponseDTO> createFootballer(
            @Valid @RequestBody FootballerRequestDTO footballerRequestDTO) {

        FootballerResponseDTO footballer = footballerService.createFootballer(footballerRequestDTO);
        return ResponseEntity.ok().body(footballer);

    }
}
