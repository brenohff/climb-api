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
@Data
@Table(name = "toppilots")
public class Toppilots implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "pilot_id", nullable = false)
  private Integer pilotId;

  @Column(name = "flights", nullable = false)
  private Integer flights = 0;

  @Column(name = "flights_points", nullable = false)
  private Integer flightsPoints = 0;

  @Column(name = "hours", nullable = false)
  private Integer hours = 0;

  @Column(name = "hours_points", nullable = false)
  private Integer hoursPoints = 0;

  @Column(name = "miles", nullable = false)
  private Integer miles = 0;

  @Column(name = "miles_points", nullable = false)
  private Integer milesPoints;

  @Column(name = "touchdown", nullable = false)
  private Integer touchdown;

  @Column(name = "touchdown_points", nullable = false)
  private Integer touchdownPoints;

  @Column(name = "month", nullable = false)
  private Integer month;

  @Column(name = "year", nullable = false)
  private Integer year;

  
}