package com.cov001.rds.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cov001.rds.common.dto.AudioResourceDto;
import com.cov001.rds.common.dto.PageDto;
import com.cov001.rds.common.util.Const;
import com.cov001.rds.common.util.JsonResult;
import com.cov001.rds.controller.base.BaseController;
import com.cov001.rds.pojo.AudioResource;
import com.cov001.rds.pojo.SysUser;
import com.cov001.rds.service.IAudioResourceService;

@Controller
@RequestMapping("/rds/media")
public class MediaController extends BaseController{

	@Autowired
	private IAudioResourceService audioResourceService;
	
	@RequestMapping("/list/page")
	public String mediaListPage() {
		return "media.tpl";
	}
	
	@RequestMapping("/detail/page/{type}")
	public String mediaDetailPage(@PathVariable String type){
		return "media"+type+".tpl";
	}
	
	@RequestMapping("/detail/preadddir")
	@ResponseBody
	public JsonResult mediaPreaddDir(){
		AudioResourceDto model=new AudioResourceDto();
		returnMap.put("model", model);
		return new JsonResult(1, returnMap);
	}
	
	@RequestMapping("/detail/adddir")
	@ResponseBody
	public JsonResult mediaAddDir(@ModelAttribute AudioResourceDto model){
		if(model.getName()==null || model.getName().equals("")){
			return new JsonResult(0, null, "00011", "目录名称不能为空！！");
		}
		
		AudioResource ar=new AudioResource();
		ar.setName(model.getName());
		ar.setDateCreated(new Date());
		ar.setOperateDate(new Date());
		ar.setParentId(1);
		ar.setType("dir");
		SysUser user=(SysUser)request.getSession().getAttribute(Const.SESSION_ADMIN_USER);
		ar.setOperator(user.getUid());
		ar.setResourceStatusId(0);
		ar.setUploadUserId(user.getUid());
		ar.setDeleted(0);
		
		int id =audioResourceService.insertAudioResource(ar);
		returnMap.put("model", id);
		return new JsonResult(1, returnMap);
	}
	
	
	@RequestMapping("/detail/preaddfile")
	@ResponseBody
	public JsonResult mediaPreaddFile(){
		AudioResourceDto model=new AudioResourceDto();
		returnMap.put("model", model);
		return new JsonResult(1, returnMap);
	}
	@RequestMapping("/list/data")
	@ResponseBody
	public JsonResult mediaList(@RequestParam(value = "page", defaultValue = "1") int page){
		
		PageDto pageDto = audioResourceService.getAllNoDeletedAudioResource(page);
		if(pageDto != null){
			List<AudioResourceDto> audioResourcesDto=new ArrayList<AudioResourceDto>();
			List<AudioResource> audioResources=(List<AudioResource>) pageDto.getData();
			for (AudioResource audioResource : audioResources) {
				AudioResourceDto d=new AudioResourceDto();
				d.setId(audioResource.getId());
				d.setName(audioResource.getName());
				d.setStatus(audioResource.getResourceStatusId());
				d.setType(audioResource.getType());
				d.setParentId(audioResource.getParentId());
				if(d.getParentId() == 0){
					d.setName(audioResource.getName()+"("+audioResource.getAliasName()+")");
				}
				audioResourcesDto.add(d);
			}
			returnMap.put("audioResources", audioResourcesDto);
			returnMap.put("page", pageDto.getPageModel());
			return new JsonResult(1,returnMap);
		}else{
			returnMap.put("audioResources", null);
			return new JsonResult(1, returnMap);
		}
		//return null;
	}

	
}
