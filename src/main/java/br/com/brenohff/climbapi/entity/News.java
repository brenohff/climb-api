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
@Table(name = "phpvms_news")
@Data
public class News implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "subject", nullable = false)
  private String subject = "";

  @Column(name = "body", nullable = false)
  private String body;

  @Column(name = "postdate", nullable = false)
  private Date postdate;

  @Column(name = "postedby", nullable = false)
  private String postedby = "";

  
}