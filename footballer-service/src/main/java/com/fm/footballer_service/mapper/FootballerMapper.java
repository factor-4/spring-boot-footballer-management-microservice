package com.fm.footballer_service.mapper;

import com.fm.footballer_service.Enum.PlayingRole;
import com.fm.footballer_service.dto.FootballerRequestDTO;
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

    public  static Footballer toModel(FootballerRequestDTO dto) {
        Footballer footballer = new Footballer();

        footballer.setName(dto.getName());
        footballer.setAddress(dto.getAddress());
        footballer.setAge(dto.getAge());
        footballer.setEmail(dto.getEmail());
        footballer.setPlayingRole(
                PlayingRole.valueOf(dto.getPlayingRole())
        );

        return footballer;
    }
}
