package com.sodiki.gestiondesstock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "entreprise")
@EqualsAndHashCode(callSuper = true)
@Builder
public class Entreprise extends AbstractEntity{

    private String nom;
}
