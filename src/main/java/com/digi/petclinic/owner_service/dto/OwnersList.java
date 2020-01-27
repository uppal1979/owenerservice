package com.digi.petclinic.owner_service.dto;

import com.digi.petclinic.owner_service.entity.Owner;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class OwnersList {

    List<Owner> vet;
}
