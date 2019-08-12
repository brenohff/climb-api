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

@Data
@Entity
@Table(name = "phpvms_pireps")
public class Pireps implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "pirepid", nullable = false)
  private Integer pirepid;

  @Column(name = "pilotid", nullable = false)
  private Integer pilotid = 0;

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
  private String aircraft = "";

  @Column(name = "flighttime", nullable = false)
  private String flighttime = "";

  @Column(name = "flighttime_stamp", nullable = false)
  private Date flighttimeStamp;

  @Column(name = "distance", nullable = false)
  private Integer distance = 0;

  @Column(name = "landingrate", nullable = false)
  private Float landingrate = 0F;

  @Column(name = "submitdate", nullable = false)
  private Date submitdate;

  @Column(name = "modifieddate", nullable = false)
  private Date modifieddate;

  @Column(name = "accepted", nullable = false)
  private Integer accepted = 0;

  @Column(name = "log", nullable = false)
  private String log;

  @Column(name = "load", nullable = false)
  private Integer load;

  @Column(name = "fuelused", nullable = false)
  private Float fuelused = 0F;

  @Column(name = "fuelunitcost", nullable = false)
  private Float fuelunitcost = 0F;

  @Column(name = "fuelprice", nullable = false)
  private Float fuelprice = 5.1F;

  @Column(name = "price", nullable = false)
  private Float price;

  @Column(name = "flighttype", nullable = false)
  private String flighttype = "P";

  @Column(name = "gross", nullable = false)
  private Float gross = 0F;

  @Column(name = "pilotpay", nullable = false)
  private Float pilotpay;

  @Column(name = "paytype", nullable = false)
  private Integer paytype = 1;

  @Column(name = "expenses", nullable = false)
  private Float expenses;

  @Column(name = "expenselist", nullable = false)
  private byte[] expenselist;

  @Column(name = "revenue", nullable = false)
  private Float revenue;

  @Column(name = "source", nullable = false)
  private String source;

  @Column(name = "exported", nullable = false)
  private Integer exported;

  @Column(name = "rawdata", nullable = false)
  private String rawdata;

  @Column(name = "count", nullable = false)
  private Integer count = 1;

  
}