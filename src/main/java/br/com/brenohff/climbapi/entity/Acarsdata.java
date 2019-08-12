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
@Table(name = "phpvms_acarsdata")
public class Acarsdata implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "pilotid", nullable = false)
  private String pilotid = "0";

  @Column(name = "flightnum", nullable = false)
  private String flightnum = "0";

  @Column(name = "pilotname", nullable = false)
  private String pilotname = "";

  @Column(name = "aircraft", nullable = false)
  private String aircraft = "";

  @Column(name = "lat", nullable = false)
  private String lat = "";

  @Column(name = "lng", nullable = false)
  private String lng = "";

  @Column(name = "heading", nullable = false)
  private Integer heading = 0;

  @Column(name = "alt", nullable = false)
  private String alt = "";

  @Column(name = "gs", nullable = false)
  private Integer gs = 0;

  @Column(name = "depicao", nullable = false)
  private String depicao = "";

  @Column(name = "depapt", nullable = false)
  private String depapt = "";

  @Column(name = "arricao", nullable = false)
  private String arricao = "";

  @Column(name = "arrapt", nullable = false)
  private String arrapt;

  @Column(name = "deptime", nullable = false)
  private Date deptime;

  @Column(name = "timeremaining", nullable = false)
  private String timeremaining = "";

  @Column(name = "arrtime", nullable = false)
  private Date arrtime;

  @Column(name = "route", nullable = false)
  private String route;

  @Column(name = "route_details", nullable = false)
  private String routeDetails;

  @Column(name = "distremain", nullable = false)
  private String distremain = "";

  @Column(name = "phasedetail", nullable = false)
  private String phasedetail = "";

  @Column(name = "online", nullable = false)
  private String online = "";

  @Column(name = "messagelog", nullable = false)
  private String messagelog;

  @Column(name = "lastupdate", nullable = false)
  private Date lastupdate;

  @Column(name = "client", nullable = false)
  private String client = "";

  
}