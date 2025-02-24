package com.bbva.wikj.lib.r555.impl;

import com.bbva.apx.exception.db.NoResultException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class WIKJR555Impl extends WIKJR555Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJR555Impl.class);


	@Override
	public Map<String, Object> executeSelect(String nuip) {

		try {
			return this.jdbcUtils.queryForMap("query.query2", nuip);
		}catch (NoResultException e){
			System.out.println("ExecuteSelect");
			return null;
		}catch (Exception e) {
			System.out.println("Error inesperado al ejecutar la consulta: " + e.getMessage());
			return null;
		}
    }


	@Override
	public int executeInsert(Map<String, Object> args) {
		try {
			return this.jdbcUtils.update("query.query1", args);
		} catch (Exception e) {
			System.out.println("Error inesperado al ejecutar la actualización: " + e.getMessage());
			throw new RuntimeException("Error inesperado en la inserción", e);
		}
	}
}
