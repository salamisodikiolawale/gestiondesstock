package com.sodiki.gestiondesstock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ventes")
@Builder
public class Ventes extends AbstractEntity{

    private String code;
}
