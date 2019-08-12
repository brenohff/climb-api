package br.com.brenohff.climbapi.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "phpvms_schedules")
@Entity
@Data
public class Schedules implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "code", nullable = false)
  private String code = "";

  @Column(name = "flightnum", nullable = false)
  private String flightnum = "0";

  @Column(name = "depicao", nullable = false)
  private String depicao = "";

  @Column(name = "arricao", nullable = false)
  private String arricao = "";

  @Column(name = "route", nullable = false)
  private String route;

  @Column(name = "route_details", nullable = false)
  private String routeDetails;

  @Column(name = "aircraft", nullable = false)
  private String aircraft;

  @Column(name = "flightlevel", nullable = false)
  private String flightlevel;

  @Column(name = "distance", nullable = false)
  private Float distance = 0F;

  @Column(name = "deptime", nullable = false)
  private String deptime = "";

  @Column(name = "arrtime", nullable = false)
  private String arrtime = "";

  @Column(name = "flighttime", nullable = false)
  private Float flighttime = 0F;

  @Column(name = "daysofweek", nullable = false)
  private String daysofweek = "0123456";

  @Column(name = "week1", nullable = false)
  private String week1 = "0123456";

  @Column(name = "week2", nullable = false)
  private String week2 = "0123456";

  @Column(name = "week3", nullable = false)
  private String week3 = "0123456";

  @Column(name = "week4", nullable = false)
  private String week4 = "0123456";

  @Column(name = "price", nullable = false)
  private Float price;

  @Column(name = "payforflight", nullable = false)
  private Float payforflight = 0F;

  @Column(name = "flighttype", nullable = false)
  private String flighttype = "P";

  @Column(name = "timesflown", nullable = false)
  private Integer timesflown = 0;

  @Column(name = "notes", nullable = false)
  private String notes;

  @Column(name = "enabled", nullable = false)
  private Integer enabled = 1;

  @Column(name = "bidid", nullable = false)
  private Integer bidid = 0;

  
}