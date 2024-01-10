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
 * @date 2024-01-10 10:34:21
 */
@Data
@TableName("actor_film")
public class ActorFilmEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 
	 */
	private Integer filmId;
	/**
	 * 
	 */
	private Integer actorId;

}
