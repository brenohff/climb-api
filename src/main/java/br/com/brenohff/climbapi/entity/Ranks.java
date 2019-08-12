package br.com.brenohff.climbapi.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "phpvms_ranks")
public class Ranks implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "rankid", nullable = false)
  private Integer rankid;

  @Column(name = "rank", nullable = false)
  private String rank = "";

  @Column(name = "rankimage", nullable = false)
  private String rankimage;

  @Column(name = "minhours", nullable = false)
  private Integer minhours = 0;

  @Column(name = "payrate", nullable = false)
  private Float payrate = 0F;

  
}