package br.com.brenohff.climbapi.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "phpvms_airports")
@Entity
@Data
public class Airports implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "icao", nullable = false)
  private String icao = "";

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "country", nullable = false)
  private String country = "";

  @Column(name = "lat", nullable = false)
  private Float lat = 0F;

  @Column(name = "lng", nullable = false)
  private Float lng = 0F;

  @Column(name = "hub", nullable = false)
  private Integer hub = 0;

  @Column(name = "fuelprice", nullable = false)
  private Float fuelprice = 0F;

  @Column(name = "chartlink", nullable = false)
  private String chartlink;

  
}