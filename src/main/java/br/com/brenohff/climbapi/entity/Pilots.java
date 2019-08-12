package br.com.brenohff.climbapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "phpvms_pilots")
@Data
public class Pilots implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "pilotid", insertable = false, nullable = false)
  private Integer pilotid;

  @Column(name = "firstname", nullable = false)
  private String firstname = "";

  @Column(name = "lastname", nullable = false)
  private String lastname = "";

  @Column(name = "email", nullable = false)
  private String email = "";

  @Column(name = "code", nullable = false)
  private String code = "";

  @Column(name = "location", nullable = false)
  private String location = "";

  @Column(name = "hub", nullable = false)
  private String hub = "";

  @JsonIgnore
  @Column(name = "password", nullable = false)
  private String password = "";

  @JsonIgnore
  @Column(name = "salt", nullable = false)
  private String salt = "";

  @Column(name = "bgimage", nullable = false)
  private String bgimage = "";

  @Column(name = "lastlogin", nullable = false)
  private Date lastlogin;

  @Column(name = "totalflights", nullable = false)
  private Integer totalflights = 0;

  @Column(name = "totalhours", nullable = false)
  private Float totalhours = 0F;

  @Column(name = "totalpay", nullable = false)
  private Float totalpay = 0F;

  @Column(name = "payadjust")
  private Float payadjust = 0F;

  @Column(name = "saldo")
  private Float saldo = 0F;

  @Column(name = "transferhours", nullable = false)
  private Float transferhours = 0F;

  @Column(name = "rankid", nullable = false)
  private Integer rankid = 0;

  @Column(name = "rank", nullable = false)
  private String rank = "New Hire";

  @Column(name = "ranklevel", nullable = false)
  private Integer ranklevel = 0;

  @Column(name = "confirmed", nullable = false)
  private Integer confirmed = 0;

  @Column(name = "retired", nullable = false)
  private Integer retired = 0;

  @Column(name = "joindate", nullable = false)
  private Date joindate;

  @Column(name = "lastpirep", nullable = false)
  private Date lastpirep;

  @Column(name = "lastip")
  private String lastip = "";

  @Column(name = "comment")
  private String comment;

  
}