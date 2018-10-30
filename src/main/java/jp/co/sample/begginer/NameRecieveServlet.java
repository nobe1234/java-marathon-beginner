package jp.co.sample.begginer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nameRecieve")
public class NameRecieveServlet {

	@RequestMapping("/index")
	public String index() {
		return "input";
	}
	
	@RequestMapping("/toOutput")
	public String toOutput() {
		return "outputName";
	}
}
