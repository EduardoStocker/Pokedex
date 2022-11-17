package com.eduardo.projetinho.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "tb_pokemon")
public class Pokemon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer types;
	private String type1;
	private String type2;
	private Integer total;
	private Integer hp;
	private Integer attack;
	private Integer defense;
	private Integer special;
	private Integer speed;
	private Integer evolutions;
	private Boolean legendary;
	@Column(name="activate")
	@ColumnDefault(value = "1")
	private Short activate;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTypes() {
		return types;
	}

	public void setTypes(Integer types) {
		this.types = types;
	}

	public String getType1() {
		return type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public Integer getAttack() {
		return attack;
	}

	public void setAttack(Integer attack) {
		this.attack = attack;
	}

	public Integer getDefense() {
		return defense;
	}

	public void setDefense(Integer defense) {
		this.defense = defense;
	}

	public Integer getSpecial() {
		return special;
	}

	public void setSpecial(Integer special) {
		this.special = special;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Boolean getLegendary() {
		return legendary;
	}

	public void setLegendary(Boolean legendary) {
		this.legendary = legendary;
	}

	public Pokemon() {
	}

	public Integer getEvolutions() {
		return evolutions;
	}

	public void setEvolutions(Integer evolutions) {
		this.evolutions = evolutions;
	}

	public Short getActivate() {
		return activate;
	}

	public void setActivate(Short activate) {
		this.activate = activate;
	}
}