package com.sodiki.gestiondesstock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "mouvementStock")
@Builder
public class MouvementStock extends AbstractEntity{
    private  String nom;
}
