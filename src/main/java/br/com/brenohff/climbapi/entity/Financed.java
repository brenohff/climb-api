package br.com.brenohff.climbapi.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "financed")
@Data
@Entity
public class Financed implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "transitionid", nullable = false)
  private Integer transitionid;

  @Column(name = "pilotid", nullable = false)
  private Integer pilotid;

  @Column(name = "saldo", nullable = false)
  private Float saldo;

  @Column(name = "reason", nullable = false)
  private Integer reason;

  @Column(name = "type", nullable = false)
  private Integer type;

  @Column(name = "lastmoney", nullable = false)
  private Float lastmoney;

  @Column(name = "newmoney", nullable = false)
  private Float newmoney;

  
}