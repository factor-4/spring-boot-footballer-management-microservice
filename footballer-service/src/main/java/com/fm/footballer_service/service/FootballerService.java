package com.fm.footballer_service.service;


import com.fm.footballer_service.Enum.PlayingRole;
import com.fm.footballer_service.dto.FootballerRequestDTO;
import com.fm.footballer_service.dto.FootballerResponseDTO;
import com.fm.footballer_service.exception.EmailAlreadyExistsException;
import com.fm.footballer_service.exception.FootballerNotFoundException;
import com.fm.footballer_service.mapper.FootballerMapper;
import com.fm.footballer_service.model.Footballer;
import com.fm.footballer_service.repository.FootballerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FootballerService {
    private final FootballerRepository footballerRepository;

    public FootballerService(FootballerRepository footballerRepository) {
        this.footballerRepository = footballerRepository;
    }

    public List<FootballerResponseDTO> getFootballers() {
        List<Footballer> footballers = footballerRepository.findAll();

        return footballers.stream().map(FootballerMapper::toDTO).toList();
    }


    public FootballerResponseDTO createFootballer(FootballerRequestDTO footballerRequestDTO) {
        if (footballerRepository.existsByEmail(footballerRequestDTO.getEmail())) {
            throw new EmailAlreadyExistsException("A footballer with this" + "already exists " + footballerRequestDTO.getEmail());
        }
        Footballer newFootballer = footballerRepository.save(FootballerMapper.toModel(footballerRequestDTO));
        return FootballerMapper.toDTO(newFootballer);
    }


    public FootballerResponseDTO updateFootballer(UUID id, FootballerRequestDTO footballerRequestDTO) {

        Footballer footballer = footballerRepository.findById(id).orElseThrow(
                ()-> new FootballerNotFoundException("Footballer not found with ID: "+ id));


        if (footballerRepository.existsByEmail(footballerRequestDTO.getEmail())) {
            throw new EmailAlreadyExistsException("A footballer with this" + "already exists " + footballerRequestDTO.getEmail());
        }

        footballer.setName(footballerRequestDTO.getName());
        footballer.setAddress(footballerRequestDTO.getAddress());
        footballer.setEmail(footballerRequestDTO.getEmail());
        footballer.setAge(footballerRequestDTO.getAge());
        footballer.setPlayingRole(
               PlayingRole.valueOf(footballerRequestDTO.getPlayingRole())
        );

        Footballer updatedFootballer = footballerRepository.save(footballer);
        return FootballerMapper.toDTO(updatedFootballer);
    }


}
