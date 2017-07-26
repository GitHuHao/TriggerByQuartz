package com.atguigu.quartz;

import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.atguigu.mapper.StorageMapper;

public class StorageCheckJob extends QuartzJobBean {
	// 依赖对象只能通过setter 注入
	private StorageMapper storageMapper;
	
	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		System.out.println("storageMapper: "+storageMapper +new Date());
		storageMapper.bookcheck();
	}

	public void setStorageMapper(StorageMapper storageMapper) {
		this.storageMapper = storageMapper;
	}
	
}
