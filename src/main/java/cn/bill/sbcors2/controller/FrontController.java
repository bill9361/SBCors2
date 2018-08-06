package cn.bill.sbcors2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description: <br/>
 * Date:2018年8月6日 下午2:27:32 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
@RequestMapping("/front")
@Controller
public class FrontController
{
	
	@RequestMapping("/index.do")
	public String index()
	{
		System.out.println("FrontController...index()");
		return "front/index";
	}

}
