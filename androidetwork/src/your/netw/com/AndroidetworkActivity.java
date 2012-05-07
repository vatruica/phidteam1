package your.netw.com;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Scanner;







import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ImageButton;

public class AndroidetworkActivity extends Activity {
	public static String bell;
	
	//String newcommon;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        
      ImageButton start = (ImageButton)findViewById(R.id.button1); 
      start.setHapticFeedbackEnabled(true); 
      
      
      
      start.setOnClickListener(new OnClickListener()
      {
          public void onClick(View v)
      	{
            
        	
			 EditText inputtext = (EditText)findViewById(R.id.editText1); 
			 String newcommon = (String)inputtext.getText().toString(); 
			 bell =newcommon;
			 Intent game = new Intent(getApplicationContext(),menu.class); 
				AndroidetworkActivity.this.startActivity(game); 
          }
          
      }); 
    }
        
        
	

		public void tekstas(String s) throws UnknownHostException, IOException{
        	 Socket mySocket = new Socket(bell, 8888);
        	 PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(mySocket.getOutputStream())),true);
             out.println(s);
             mySocket.close();
           
        }
        

    }

            

     
        
    

