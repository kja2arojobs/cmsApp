package com.library;

import java.util.List;
import javax.swing.SwingWorker;

/**
 *
 * @author kadhush
 */
public class BackgroundWorkerService extends SwingWorker<Integer, String>{

	@Override
	protected Integer doInBackground() throws Exception {
		
		return null;
	}
	
	 @Override
	  protected void process(List<String> chunks){
	    for(String message : chunks){
	      System.out.println(message);
	    }
	  }
	

	
}

