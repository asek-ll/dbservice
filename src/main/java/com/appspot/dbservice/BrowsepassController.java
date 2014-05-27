package com.appspot.dbservice;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appspot.dbservice.html.HTMLScriptLink;
import com.appspot.dbservice.html.HTMLStyleLink;

import org.apache.commons.io.IOUtils;

@Controller
public class BrowsepassController extends BaseWebController{

  @RequestMapping("/browsepass")
  public String list(ModelMap model) {
  	
  	scripts = new ArrayList<HTMLScriptLink>();
  	styles = new ArrayList<HTMLStyleLink>();
  	
  	addScript( new HTMLScriptLink("browsepass/jquery/jquery-1.10.2.min.js") );
  	addScript( new HTMLScriptLink("browsepass/jquery/jquery-ui-1.10.3.min.js") );
  	addScript( new HTMLScriptLink("browsepass/cryptojs/components/core-min.js") );
  	addScript( new HTMLScriptLink("browsepass/cryptojs/components/cipher-core-min.js") );
  	addScript( new HTMLScriptLink("browsepass/cryptojs/components/mode-ecb-min.js") );
  	addScript( new HTMLScriptLink("browsepass/cryptojs/components/aes-min.js") );
  	addScript( new HTMLScriptLink("browsepass/cryptojs/components/pad-nopadding-min.js") );
  	addScript( new HTMLScriptLink("browsepass/cryptojs/components/sha256-min.js") );
  	addScript( new HTMLScriptLink("browsepass/inflate.js") );
  	addScript( new HTMLScriptLink("browsepass/jdataview.js") );
  	addScript( new HTMLScriptLink("browsepass/salsa20.js") );
  	addScript( new HTMLScriptLink("browsepass/kdbx.js") );
  	addScript( new HTMLScriptLink("browsepass/browsepass.js") );
  	addStyle( new HTMLStyleLink("browsepass/jquery/smoothness/jquery-ui.css") );

    return "browsepass";
  }
  
  @RequestMapping("/browsepass/kdbx")
  public void getPassFile(HttpServletResponse response){
  	try {
	    URL url =  new URL("https://dl.dropboxusercontent.com/u/21534588/db2.kdbx");
	    IOUtils.copy(url.openStream(), response.getOutputStream());
      response.flushBuffer();    
    } catch (MalformedURLException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
    } catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
    }
  }
}
