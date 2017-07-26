package com.atguigu.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.domain.Book;
import com.atguigu.mapper.BookMapper;

public class BookInsJob extends QuartzJobBean {
	// 依赖对象只能通过setter注入
	private BookMapper bookMapper;
	
	@Transactional
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
		
		int times = 0;
		do{
			times = new Random().nextInt(5);
		}while(times==0);
		
		for(int i=0;i<times;i++){
			Book book = new Book("book+1",5.0+ new Random().nextDouble(), i==times/2?0:i);
			bookMapper.insert(book);
			System.out.print("id: "+book.getId()+"\t");
		}
	}

	public void setBookMapper(BookMapper bookMapper) {
		this.bookMapper = bookMapper;
	}
	
}
