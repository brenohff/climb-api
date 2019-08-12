package br.com.brenohff.climbapi.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "phpvms_pilotshop")
@Data
@Entity
public class Pilotshop implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "pid")
  private Integer pid;

  @Column(name = "name")
  private String name;

  @Column(name = "shop_type")
  private Integer shopType;

  @Column(name = "product_type")
  private Integer productType;

  @Column(name = "url_link")
  private String urlLink;

  @Column(name = "image_link")
  private String imageLink;

  @Column(name = "description")
  private String description;

  @Column(name = "estoque")
  private String estoque;

  @Column(name = "price")
  private Float price;

  
}