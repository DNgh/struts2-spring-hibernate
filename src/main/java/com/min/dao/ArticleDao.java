package com.min.dao;

import java.util.List;

import com.min.model.BizArticle;

public interface ArticleDao {
	List<BizArticle> list();
	
	List<BizArticle> loadSQL();
	
	List<BizArticle> loadHQL();
	
	BizArticle loadSession(Long id);
	
	void saveSession(BizArticle object);
	
	void updateSession(BizArticle object);
	
	void deleteSession(BizArticle object);
	
	BizArticle loadTemplate(Long id);
	
	void saveTemplate(BizArticle object);
	
	void updateTemplate(BizArticle object);
	
	void deleteTemplate(BizArticle object);
}
