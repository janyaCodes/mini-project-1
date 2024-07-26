package com.demo.reminder.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.reminder.type.Event;
import com.google.gson.Gson;

//@WebServlet("/reminder")
public class EventServlet extends HttpServlet {

	    private static final long serialVersionUID = 1L;

	    @Override
	    public void init() throws ServletException {
	    }

	    @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    }

	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    	
	    	// Read JSON data from request body
	        StringBuilder requestBody = new StringBuilder();
	        request.getReader().lines().forEach(line -> requestBody.append(line));

	        // Parse JSON data into Reminder object
	        Gson gson = new Gson();
	        Event reminder = gson.fromJson(requestBody.toString(), Event.class);
	        
	        System.out.println("Inside doPost method, Event Object :: " + reminder);
	    }

	    @Override
	    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    }

}
