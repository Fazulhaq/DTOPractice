package com.mcit.DTOPractice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcit.DTOPractice.dto.UserLocationDTO;
import com.mcit.DTOPractice.model.User;
import com.mcit.DTOPractice.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserLocationDTO> getAllUsersLocation() {
        return userRepository.findAll()
                .stream()
                .map(this::convertEntityDto)
                .collect(Collectors.toList());
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // private UserLocationDTO convertEntityDto(User user){
    // UserLocationDTO userLocationDTO = new UserLocationDTO();
    // userLocationDTO.setUserId(user.getId());
    // userLocationDTO.setEmail(user.getEmail());
    // userLocationDTO.setPlace(user.getLocation().getPlace());
    // userLocationDTO.setLongitude(user.getLocation().getLongitude());
    // userLocationDTO.setLatitude(user.getLocation().getLatitude());
    // return userLocationDTO;
    // }

    private UserLocationDTO convertEntityDto(User user) {

        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);

        UserLocationDTO userLocationDTO = new UserLocationDTO();
        userLocationDTO = modelMapper.map(user, UserLocationDTO.class);
        return userLocationDTO;
    }
}
