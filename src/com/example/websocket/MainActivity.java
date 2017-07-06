package com.example.websocket;

import java.net.URI;
import java.net.URISyntaxException;

import org.java_websocket.drafts.Draft_17;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity 
{

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        URI uri=null;
		try {
			uri = new URI("ws://121.40.30.88:8080/");
		} catch (URISyntaxException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(uri!=null)		
        {
			Client client=new Client(uri,new Draft_17());
			try {
				client.connectBlocking();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }

}
