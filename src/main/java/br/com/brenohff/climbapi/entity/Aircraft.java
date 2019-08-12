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
@Table(name = "phpvms_aircraft")
@Data
public class Aircraft implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "icao", nullable = false)
  private String icao = "";

  @Column(name = "airline", nullable = false)
  private String airline;

  @Column(name = "name", nullable = false)
  private String name = "";

  @Column(name = "fullname", nullable = false)
  private String fullname = "";

  @Column(name = "registration", nullable = false)
  private String registration;

  @Column(name = "downloadlink", nullable = false)
  private String downloadlink;

  @Column(name = "imagelink", nullable = false)
  private String imagelink;

  @Column(name = "range", nullable = false)
  private String range = "0";

  @Column(name = "weight", nullable = false)
  private String weight = "0";

  @Column(name = "cruise", nullable = false)
  private String cruise = "0";

  @Column(name = "maxpax", nullable = false)
  private Float maxpax = 0F;

  @Column(name = "maxcargo", nullable = false)
  private Float maxcargo = 0F;

  @Column(name = "minrank", nullable = false)
  private Integer minrank = 0;

  @Column(name = "ranklevel", nullable = false)
  private Integer ranklevel = 0;

  @Column(name = "enabled", nullable = false)
  private Integer enabled = 1;

  
}