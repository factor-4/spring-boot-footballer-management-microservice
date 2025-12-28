package com.fm.footballer_service.mapper;

import com.fm.footballer_service.dto.FootballerResponseDTO;
import com.fm.footballer_service.model.Footballer;

public class FootballerMapper {

    public static FootballerResponseDTO toDTO(Footballer footballer) {
        FootballerResponseDTO footballerDTO = new FootballerResponseDTO();

        footballerDTO.setId(footballer.getId().toString());
        footballerDTO.setName(footballer.getName());
        footballerDTO.setAddress(footballer.getAddress());
        footballerDTO.setAge(footballer.getAge());
        footballerDTO.setEmail(footballer.getEmail());
        footballerDTO.setPlayingRole(footballer.getPlayingRole().toString());

        return footballerDTO;

    }
}
