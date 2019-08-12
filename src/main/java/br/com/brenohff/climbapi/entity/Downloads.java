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
@Table(name = "phpvms_downloads")
public class Downloads implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "pid")
  private Integer pid;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "link")
  private String link;

  @Column(name = "image")
  private String image;

  @Column(name = "hits")
  private Integer hits;

  
}