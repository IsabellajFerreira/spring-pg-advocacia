package br.com.fiap.springpgadvocacia.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TB_ESTADO")


public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ESTADO")
    @SequenceGenerator(
            name =  "SQ_ESTADO",
            sequenceName =  "SQ_ESTADO",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "ID_ESTADO")
    private Long id;

    @Column(name = "NM_ESTADO")
    private String nome;

    private String sigla;

}
