package br.com.brenohff.climbapi.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "phpvms_navdata")
@Data
@Entity
public class Navdata implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "title", nullable = false)
  private String title;

  @Column(name = "airway")
  private String airway;

  @Column(name = "airway_type")
  private String airwayType;

  @Column(name = "seq", nullable = false)
  private Integer seq;

  @Column(name = "loc", nullable = false)
  private String loc;

  @Column(name = "lat", nullable = false)
  private Float lat;

  @Column(name = "lng", nullable = false)
  private Float lng;

  @Column(name = "freq", nullable = false)
  private String freq;

  @Column(name = "type", nullable = false)
  private Integer type;

  
}