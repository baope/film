package com.film.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author cwj
 * @email baope.ans@gmail.com
 * @date 2024-01-10 10:34:22
 */
@Data
@TableName("film_info")
public class InfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private String filmDirector;
	/**
	 * 
	 */
	private String filmCountry;
	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 
	 */
	private String filmImage;
	/**
	 * 
	 */
	private Double filmGradings;
	/**
	 * 
	 */
	private String filmName;

}
