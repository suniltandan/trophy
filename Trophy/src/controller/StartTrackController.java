package controller;


import java.io.IOException;
import java.util.Date;

import javax.servlet.http.*;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.FetchOptions;
import java.util.List;

@SuppressWarnings("serial")
public class StartTrackController extends HttpServlet {
		public void doPost(HttpServletRequest req, HttpServletResponse resp)
	            throws IOException {
			
			//Kijk na wat we gestart hebben
			String course = req.getParameter("mycourse");
			String bstart = req.getParameter("Start");
			String bstop = req.getParameter("Stop");
			Date date = new Date();
			
			String buttonclicked = null;
			if (bstart != null)
			{
				buttonclicked = "start";
			}
			if (bstop != null)
			{
				buttonclicked = "stop";
			}
			
	    Key activiteit = KeyFactory.createKey("Activity", "ac");
	    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	    if (buttonclicked == "start"){
	    	Entity timer = new Entity("Timer", activiteit);
	    	timer.setProperty("course", course);
	    	timer.setProperty("date", date.getTime());
	    	
	    	
	        datastore.put(timer);
	    }
	    else if (buttonclicked == "stop") {
	    	//krijg data
	    	Query query = new Query("Timer", activiteit).addSort("date", Query.SortDirection.DESCENDING);;
	        List<Entity> timers = datastore.prepare(query).asList(FetchOptions.Builder.withLimit(5));
	        String cours = "";
	        Long dt = null;
	        
	        for (Entity t : timers)
	        {
	        	cours = (String) t.getProperty("course");
	        	dt = (Long) t.getProperty("date");
	        	datastore.delete(t.getKey());
	        }
	        	
	    	//zet data
	    	Entity act = new Entity("Act", activiteit);
	        act.setProperty("course", cours);
	        act.setProperty("timestart", dt);
	        act.setProperty("timestop", date.getTime());
	        datastore.put(act);
	    }

	    resp.sendRedirect("/starttrack.jsp");
	}
}