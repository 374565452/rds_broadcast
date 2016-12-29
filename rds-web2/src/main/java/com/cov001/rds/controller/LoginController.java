package com.cov001.rds.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cov001.rds.common.dto.LoginDto;
import com.cov001.rds.common.util.Const;
import com.cov001.rds.common.util.CookieUtil;
import com.cov001.rds.common.util.JsonResult;
import com.cov001.rds.common.util.MD5;
import com.cov001.rds.common.util.ValidateCodeService;
import com.cov001.rds.controller.base.BaseController;
import com.cov001.rds.controller.base.ConstConfig;
import com.cov001.rds.controller.base.ErrorInfo;
import com.cov001.rds.pojo.SysUser;
import com.cov001.rds.service.ISysUserService;


@Controller
@RequestMapping("/login")
public class LoginController extends BaseController {

	@Resource(name="errorInfo")
	private ErrorInfo errorInfo;
	
	@Resource(name="constConfig")
	private ConstConfig constConfig;
	
	@Autowired
	private ISysUserService userService;
	
	@RequestMapping("/preLogin")
	@ResponseBody
	public JsonResult preLogin(){
		//System.out.println("cccccccccccccccccccc------------");
		LoginDto model = new LoginDto();
		model.setUserName(CookieUtil.getCookie(Const.COOKIE_USERNAME, request));
		model.setPassword(CookieUtil.getCookie(Const.COOKIE_PASSWORD, 
				request,true,constConfig.getConstValue("COOKIE_ENCRPT_VALUE")));
		model.setRemberPwd(CookieUtil.getCookie(Const.COOKIE_REMBER_PWD, request));
		model.setTipMessage("");
		Object obj = request.getSession().getAttribute(Const.SESSION_ADMIN);
		model.setSessionAdminName(obj == null? null:obj.toString());
		if(obj!=null){
			System.out.println(obj.toString());
		}
		returnMap.put("model", model);
		return new JsonResult(1, returnMap);
	}
	
	@RequestMapping(value="/doLogin",method=RequestMethod.POST)
	@ResponseBody
	public JsonResult doLogin(@ModelAttribute LoginDto model){
		
		if(model.getVerificationCode()==null || model.getVerificationCode().equals("")){
			model.setTipMessage(errorInfo.getErrorInfo("00004"));
			returnMap.put("model", model);
			return new JsonResult(1,returnMap);
		}
		//System.out.println(model.getVerificationCode());
		String sessionImageCode=request.getSession().getAttribute(Const.SESSION_IMG_CODE).toString();
		if(sessionImageCode == null || !sessionImageCode.equals(model.getVerificationCode())){
			model.setTipMessage(errorInfo.getErrorInfo("00005"));
			returnMap.put("model", model);
			return new JsonResult(1,returnMap);
		}
		
		if(model.getUserName()==null || model.getUserName().equals("")){
//System.out.println("用户名为空"+model.getUserName());
			model.setTipMessage(errorInfo.getErrorInfo("00006"));
			returnMap.put("model", model);
			return new JsonResult(1,returnMap);
		}
		
		if(model.getPassword()==null || model.getPassword().equals("")){
//System.out.println("密码为空");
			model.setTipMessage(errorInfo.getErrorInfo("00007"));
			returnMap.put("model", model);
			return new JsonResult(1,returnMap);
		}
		
		SysUser user=userService.getUserByUserName(model.getUserName());
		if(user !=null){
			String md5Password=MD5.encrytMD5(model.getPassword());
			if(!user.getPassword().equals(md5Password)){
				model.setTipMessage(errorInfo.getErrorInfo("00009"));
				returnMap.put("model", model);
				return new JsonResult(1,returnMap);
			}else{
				//将用户名放到cookie中
				CookieUtil.addCookie(Const.COOKIE_USERNAME, user.getUsername(), response);
				CookieUtil.addCookie(Const.COOKIE_REMBER_PWD, model.getRemberPwd(), response);
				request.getSession().setAttribute(Const.SESSION_ADMIN, model.getUserName());
				request.getSession().setAttribute(Const.SESSION_ADMIN_USER, user);
//System.out.println("logined ------------" + user );
				model.setSessionAdminName(model.getUserName());
				returnMap.put("model", model);
			}
			
		}else{
			model.setTipMessage(errorInfo.getErrorInfo("00008"));
			returnMap.put("model", model);
			return new JsonResult(1,returnMap);
		}
		
		//System.out.println(model.userName +"===" + model.password +"===="+model.verificationCode);
		request.getSession().setAttribute(Const.SESSION_ADMIN, model.getUserName());
		model.setSessionAdminName(model.getUserName());
		returnMap.put("model", model);
		
		return new JsonResult(1, returnMap);
		
	}
	
	@RequestMapping("/logout")
	public String doLogout() {
		request.getSession().removeAttribute(Const.SESSION_ADMIN);
		request.getSession().setAttribute(Const.SESSION_ADMIN, null);
		request.getSession().removeAttribute(Const.SESSION_ADMIN_USER);
		request.getSession().setAttribute(Const.SESSION_ADMIN_USER, null);
		//response.sendRedirect("/login");
		return "redirect:/login";
	}
	
	@RequestMapping("/getImgCode")
	@ResponseBody
	public void getImgvcode() throws IOException {
		//下面的方法可以获取到上次请求的URL地址信息
//System.out.println("====login controller "+request.getRequestURL().toString());
		// 设置response，输出图片客户端不缓存
		response.setDateHeader("Expires", 0);
		response.addHeader("Pragma", "no-cache");
		response.setHeader("Cache-Control", "no-cache, no-store, max-age=0");
		response.setContentType("image/jpeg");
		ServletOutputStream out = response.getOutputStream();
		ValidateCodeService vservice = new ValidateCodeService();
		request.getSession().setAttribute(Const.SESSION_IMG_CODE, vservice.getCode());
		request.getSession().setAttribute(Const.SESSION_IMGCODE_TIMES, "0");
		try {
			vservice.write(out);
			out.flush();
		} finally {
			out.close();
		}
	}
	
}
