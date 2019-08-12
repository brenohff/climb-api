package br.com.brenohff.climbapi.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "phpvms_tours_pilotdata")
@Data
public class ToursPilotdata implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "pilotid", nullable = false)
  private Integer pilotid;

  @Column(name = "tourid", nullable = false)
  private Integer tourid;

  @Column(name = "data", nullable = false)
  private String data;

  
}