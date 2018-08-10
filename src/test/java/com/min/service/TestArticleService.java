package com.min.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //ʹ��junit4���в���
@ContextConfiguration(locations={"classpath:spring-hibernate.xml"}) //���������ļ� 
public class TestArticleService {
	@Autowired
	ArticleService articleService;
	
	
	public void testSession() {
		articleService.updateSession(Long.valueOf("1"));
	}
	
	@Test
	public void testTemplate() {
		articleService.updateTemplate(Long.valueOf("2"));;
	}
}
