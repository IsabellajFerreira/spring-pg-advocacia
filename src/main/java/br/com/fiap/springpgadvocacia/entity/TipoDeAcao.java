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
@Table(name = "TB_TIPODEACAO")


public class TipoDeAcao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TIPODEACAO")
    @SequenceGenerator(
            name =  "SQ_TIPODEACAO",
            sequenceName =  "SQ_TIPODEACAO",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "ID_TIPODEACAO")
    private Long id;

    private String nome;
}
