package com.atguigu.mapper;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;

public interface StorageMapper {
	
	@Select("{call book_chk_pr()}")
	@Options(statementType=StatementType.CALLABLE)
    void bookcheck();

}