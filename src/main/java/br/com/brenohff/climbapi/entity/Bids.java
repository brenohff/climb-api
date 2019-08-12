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
@Table(name = "phpvms_bids")
@Data
public class Bids implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "bidid", insertable = false, nullable = false)
  private Integer bidid;

  @Column(name = "pilotid", nullable = false)
  private Integer pilotid = 0;

  @Column(name = "routeid", nullable = false)
  private Integer routeid = 0;

  @Column(name = "aircraftid", nullable = false)
  private Integer aircraftid;

  @Column(name = "dateadded", nullable = false)
  private Date dateadded;

  
}