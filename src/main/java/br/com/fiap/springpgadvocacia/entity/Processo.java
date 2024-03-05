package br.com.fiap.springpgadvocacia.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TB_PROCESSO")


public class Processo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PROCESSO")
    @SequenceGenerator(
            name =  "SQ_PROCESSO",
            sequenceName =  "SQ_PROCESSO",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "ID_PROCESSO")
    private Long id;

    private String numero;

    private Boolean proBono;


    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "ADVOGADO",
            referencedColumnName = "ID_ADVOGADO",
            foreignKey = @ForeignKey(name = "FK_ADVOGADO_PROCESSO")
    )
        private Advogado advogado;


    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "TIPODEACAO",
            referencedColumnName = "ID_TIPODEACAO",
            foreignKey = @ForeignKey(name = "FK_TIPODEACAO_PROCESSO")
    )
    private TipoDeAcao tipoDeAcao;



}
