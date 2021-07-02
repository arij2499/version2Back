package com.example.PartieBack.dto;

import lombok.Data;

import java.util.List;
@Data
public class UserDto {
    Long utilisateurId;
    Long profilId;
    List<Long> projetIds;
}
