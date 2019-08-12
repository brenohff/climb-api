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
@Data
@Table(name = "realschedulelite_location")
public class RealscheduleliteLocation implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "pilot_id", nullable = false)
  private Integer pilotId;

  @Column(name = "arricao", nullable = false)
  private String arricao;

  @Column(name = "jumpseats", nullable = false)
  private Integer jumpseats = 0;

  @Column(name = "last_update", nullable = false)
  private Date lastUpdate;

  
}