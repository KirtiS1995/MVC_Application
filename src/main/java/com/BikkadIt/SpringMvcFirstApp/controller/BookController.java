package com.BikkadIt.SpringMvcFirstApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIt.SpringMvcFirstApp.model.Book;

@Controller
public class BookController {

	//getAMpping = bind method with http request
	@GetMapping("/bookData")
	public ModelAndView getbookData()
	{
		Book book=new Book();
		book.setBookId(11);
		book.setBookName("java");
		book.setBookprice(567.00);
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("books", book);		//key-value
		mav.setViewName("book");	//to which page we will render data	
		return mav;
	}
	
	@GetMapping("/getAllBooks")
	public ModelAndView getAllBooks()
	{
		Book book=new Book();
		book.setBookId(11);
		book.setBookName("Java");
		book.setBookprice(567.00);
		
		Book book1=new Book();
		book1.setBookId(12);
		book1.setBookName("C++");
		book1.setBookprice(677.00);
		
		Book book2=new Book();
		book2.setBookId(13);
		book2.setBookName("Python");
		book2.setBookprice(876.00);
		
		List<Book> books = new ArrayList();
		books.add(book);
		books.add(book1);
		books.add(book2);
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("books", books);
		mav.setViewName("books");
		
		return mav;
		
	}
	
}
