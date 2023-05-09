package com.sodiki.gestiondesstock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "utilisateur")
@Builder
public class Utilisateur extends AbstractEntity{

    private String nom;
}
