package com.lyb.granula.handler;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.type.*;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by xiechunlu on 2018-05-15 下午2:53
 */
@MappedTypes(String.class)
@MappedJdbcTypes(JdbcType.BLOB)
@Slf4j
public class StringTypeHandler extends BaseTypeHandler<String> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, String s, JdbcType jdbcType) throws SQLException {
        try {
            preparedStatement.setBytes(i, s.getBytes("GBK"));
        } catch (Exception e) {
            log.info("编码转换出现异常", e);
            preparedStatement.setBytes(i, new byte[0]);
        }

    }

    @Override
    public String getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return resultSet.getString(s);
    }

    @Override
    public String getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return resultSet.getString(i);
    }

    @Override
    public String getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return callableStatement.getString(i);
    }
}
