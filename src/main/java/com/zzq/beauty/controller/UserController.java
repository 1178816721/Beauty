package com.zzq.beauty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController{
/*	@Autowired
	private UserService userService;
	@Autowired
	private LikeLinkService likeLinkService;

	@RequestMapping("/map")
	public @ResponseBody
	Map<String,Object> map(){
		return userService.findProgrammerByUserId(1);
	}

	@RequestMapping("/listMap")
	public @ResponseBody
	List<Map<String,Object>> listMap(){
		return likeLinkService.findLikeLinkListByProgrammerId(1);
	}


	@RequestMapping("/listMapP")
	public @ResponseBody
	List<Map<String,Object>> listMapP(){
		return likeLinkService.findLikeLinkListByProgrammerIdAndName(1,"test");
	}
	@RequestMapping("/page")
	public ModelAndView listMapPage(
			@RequestParam(value = "pageNum",required = false,defaultValue = "1")
					Integer pageNum,
			@RequestParam(value = "pageSize",required = false,defaultValue = "1")
					Integer pageSize,
			HttpServletRequest request){
		Page<List<Map<String,Object>>> page= likeLinkService.findLikeLinkListByProgrammerIdAndNamePage(1,"test",pageNum,pageSize);
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(request.getRequestURL());
		System.out.println(request.getServletPath());
		modelAndView.addObject("base",request.getContextPath());
		modelAndView.addObject("data", JSONObject.toJSON(page.getResult()));
		modelAndView.addObject("pageNum", page.getPageNum());
		modelAndView.addObject("total", page.getTotal());
		modelAndView.addObject("pageSize", page.getPageSize());
		modelAndView.addObject("pages", page.getPages());
		modelAndView.setViewName("page");
		return modelAndView;
	}

	@RequestMapping(value = "/test")
	public ModelAndView test(@ModelAttribute User user){
		System.out.println(user.getUserId());
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message","测试");
		modelAndView.setViewName("test");
		return modelAndView;
	}
	@RequestMapping("/testException")
	public ModelAndView testException(){
		throw  new RestException(200,"测试异常拦截");
	}*/

}
