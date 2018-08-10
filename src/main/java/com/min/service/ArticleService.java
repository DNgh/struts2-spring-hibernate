package com.min.service;

import java.util.List;

import com.min.model.BizArticle;

public interface ArticleService {
	List<BizArticle> list();
	
	List<BizArticle> loadSQL();
	
	List<BizArticle> loadHQL();
	
	void updateSession(Long id);
	
	void updateTemplate(Long id);
}
