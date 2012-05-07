package your.netw.com;

import java.io.IOException;
import java.net.UnknownHostException;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;

public class menu extends Activity {
	AndroidetworkActivity pirma = new AndroidetworkActivity();
	@Override
    public void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
  		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
  				WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.menu);
        
        ImageButton start = (ImageButton)findViewById(R.id.startmyg); 
    
        
        ImageButton close = (ImageButton)findViewById(R.id.closemyg); 
       
        
        ImageButton play = (ImageButton)findViewById(R.id.playmyg); 
      
        
        ImageButton stop = (ImageButton)findViewById(R.id.pausemyg); 
     
        
        ImageButton next = (ImageButton)findViewById(R.id.nextmyg); 
       
        
        ImageButton previous = (ImageButton)findViewById(R.id.prevmygt); 
       
        ImageButton send = (ImageButton)findViewById(R.id.sedmygt); 
       
        
        start.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
        	{
          
          try {
			pirma.tekstas("open");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  			 /*EditText inputtext = (EditText)findViewById(R.id.editText1); 
  			  String newcommon = (String)inputtext.getText().toString(); 
  			tekstas(newcommon);*/
            }
            
        }); 

        close.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
        	{
          
          try {
			pirma.tekstas("quit");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  			
            }
            
        }); 
        
        play.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
        	{
          
          try {
			pirma.tekstas("play");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  			
            }
            
        }); 
        
        stop.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
        	{
          
          try {
			pirma.tekstas("pause");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  			
            }
            
        }); 
        
        next.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
        	{
          
          try {
			pirma.tekstas("next");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  			
            }
            
        }); 
        
        previous.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
        	{
          
          try {
			pirma.tekstas("prev");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  			
            }
            
        }); 
        
        send.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
        	{
            	EditText inputtas = (EditText)findViewById(R.id.editText3); 
   			 String textas = (String)inputtas.getText().toString(); 
          try {
        	  
			pirma.tekstas(textas);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  			
            }
            
        }); 
        
        
        
}
}
