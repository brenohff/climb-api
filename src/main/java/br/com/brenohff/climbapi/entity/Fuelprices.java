package br.com.brenohff.climbapi.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "phpvms_fuelprices")
@Data
public class Fuelprices implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "icao", nullable = false)
  private String icao;

  @Column(name = "lowlead", nullable = false)
  private Float lowlead;

  @Column(name = "jeta", nullable = false)
  private Float jeta;

  @Column(name = "dateupdated", nullable = false)
  private Date dateupdated;

  
}