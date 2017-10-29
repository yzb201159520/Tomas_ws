package com.tomas.web.dao.typehandlers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tomas.web.instance.Address;

public class AddressHandler extends BaseTypeHandler<Address> {

	@Override
	public Address getNullableResult(ResultSet resultSet, String colname)
			throws SQLException {
		// TODO Auto-generated method stub
		return new Address(resultSet.getString(colname));
	}

	@Override
	public Address getNullableResult(ResultSet resultSet, int colindex)
			throws SQLException {
		// TODO Auto-generated method stub
		return new Address(resultSet.getString(colindex));
	}

	@Override
	public Address getNullableResult(CallableStatement callableStatement, int colindex)
			throws SQLException {
		// TODO Auto-generated method stub
		return new Address(callableStatement.getString(colindex));
	}

	@Override
	public void setNonNullParameter(PreparedStatement statement, int arg1,
			Address address, JdbcType arg3) throws SQLException {
		// TODO Auto-generated method stub
		statement.setString(arg1, new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create().toJson(address));
	}
	
}
