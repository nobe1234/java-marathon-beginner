package jp.co.sample.begginer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calc")
public class CalcController {

	@RequestMapping("/index")
	public String index() {
		return "/value/inputvalue";
	}
	
	@RequestMapping("/output")
	public String toOutput() {
		return null;
	}
	
}
