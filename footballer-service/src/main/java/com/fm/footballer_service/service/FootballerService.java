package com.fm.footballer_service.service;


import com.fm.footballer_service.dto.FootballerRequestDTO;
import com.fm.footballer_service.dto.FootballerResponseDTO;
import com.fm.footballer_service.exception.EmailAlreadyExistsException;
import com.fm.footballer_service.mapper.FootballerMapper;
import com.fm.footballer_service.model.Footballer;
import com.fm.footballer_service.repository.FootballerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FootballerService {
    private final FootballerRepository footballerRepository;

    public FootballerService(FootballerRepository footballerRepository){
        this.footballerRepository = footballerRepository;
    }

    public List<FootballerResponseDTO> getFootballers () {
        List<Footballer> footballers = footballerRepository.findAll();

        return footballers.stream()
                .map(FootballerMapper::toDTO).toList();
    }


    public FootballerResponseDTO createFootballer(FootballerRequestDTO footballerRequestDTO){
        if(footballerRepository.existsByEmail(footballerRequestDTO.getEmail())){
            throw new EmailAlreadyExistsException("A footballer with this"
            + "already exists " + footballerRequestDTO.getEmail());
        }
        Footballer newFootballer = footballerRepository.save(FootballerMapper.toModel(footballerRequestDTO));
        return FootballerMapper.toDTO(newFootballer);
    }


}
