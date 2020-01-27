package com.digi.petclinic.owner_service.entity;

import com.digi.petclinic.owner_service.entity.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
public class NamedEntity extends BaseEntity {

    @Column(name = "name")
    private String name;

}
