package com.cov001.rds.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cov001.rds.common.dto.DeviceDto;
import com.cov001.rds.common.dto.DeviceShowDto;
import com.cov001.rds.common.dto.PageDto;
import com.cov001.rds.common.util.JsonResult;
import com.cov001.rds.common.util.UuidGenerate;
import com.cov001.rds.controller.base.BaseController;
import com.cov001.rds.controller.base.DeviceStatusConfiguration;
import com.cov001.rds.controller.base.ErrorInfo;
import com.cov001.rds.pojo.Device;
import com.cov001.rds.pojo.DeviceStatus;
import com.cov001.rds.pojo.DeviceType;
import com.cov001.rds.service.IDeviceService;
import com.cov001.rds.service.IDeviceStatusService;
import com.cov001.rds.service.IDeviceTypeService;

@Controller
@RequestMapping("/rds/device")
public class DeviceController extends BaseController {

	@Resource(name = "deviceStatusConfig")
	private DeviceStatusConfiguration statusConfig;

	@Resource(name = "errorInfo")
	private ErrorInfo errorInfo;

	@Autowired
	private IDeviceService deviceService;

	@Autowired
	private IDeviceStatusService deviceStatusService;

	@Autowired
	private IDeviceTypeService deviceTypeService;

	@RequestMapping("/list/page")
	public String deviceListPage() {
		return "device.tpl";
	}

	@RequestMapping("/detail/page/{type}")
	public String deviceDetailPage(@PathVariable String type) {
		return "device" + type + ".tpl";
	}

	@RequestMapping("/list/data")
	@ResponseBody
	public JsonResult deviceList(@RequestParam(value = "page", defaultValue = "1") int page) {
		// 应该将没有删除的设备读取出来
		// System.out.println(page+"------------");
		// List<Device> devices = deviceServce.getAllDevice();
		PageDto model = deviceService.getAllNoDeleteDevice(page);
		if (model != null) {
			List<DeviceShowDto> showDtos = new ArrayList<DeviceShowDto>();
			List<Device> devices = (List<Device>) model.getData();
			for (Device d : devices) {
				DeviceShowDto dto = new DeviceShowDto();
				dto.setDeviceNo(d.getDeviceno());
				dto.setUid(d.getUid());
				dto.setDeviceVol(d.getDevicevol());
				DeviceStatus deviceStatus = deviceStatusService.getDeviceStatusByValue(d.getDevicestatus());
				if (deviceStatus != null) {
					dto.setDeviceStatus(deviceStatus.getDevicetruename());
				} else {
					return new JsonResult(0, null, "00002", errorInfo.getErrorInfo("00002"));
				}
				DeviceType deviceType = deviceTypeService.getDeviceTypeByUid(d.getDevicetypeuid());
				if (deviceType != null) {
					dto.setDeviceType(deviceType.getDevicetypename());
				} else {
					return new JsonResult(0, null, "00003", errorInfo.getErrorInfo("00003"));
				}
				String statusValue = deviceStatus.getDevicestatusvalue();
				if (statusValue == null || statusValue.equals("") || statusValue.equals("00000000000000FF")) {
					dto.setuStatus("u_connected");
				} else {
					dto.setuStatus("connected");
				}
				showDtos.add(dto);
			}
			returnMap.put("devices", showDtos);
			returnMap.put("page", model.getPageModel());
			return new JsonResult(1, returnMap);
		} else {
			// return new JsonResult(0, null, "00001",
			// errorInfo.getErrorInfo("00001"));
			// 没有设备数据，不应该回复一个错误
			returnMap.put("devices", null);
			return new JsonResult(1, returnMap);
		}
	}

	@RequestMapping("/detail/preadd")
	@ResponseBody
	public JsonResult devicePreAdd() {
		DeviceDto model = new DeviceDto();
		model.setDevicefmout(9200);
		model.setDevicefmrecv(8880);
		model.setDevicevol(33);
		model.setLatitude(0.0);
		model.setLongitude(0.0);
		returnMap.put("model", model);

		List<DeviceType> types = deviceTypeService.getAllDeviceType();
		if (types != null) {
			returnMap.put("types", types);
		} else {
			returnMap.put("types", null);
		}
		return new JsonResult(1, returnMap);
	}

	@RequestMapping(value = "/detail/add", method = RequestMethod.POST)
	@ResponseBody
	public JsonResult deviceAdd(@ModelAttribute DeviceDto dto) {
		// 这里要做一下验证

		System.out.println(dto.getDeviceno() + "====================");

		if (dto.getDeviceno() == null || dto.getDeviceno().equals("")) {
			return new JsonResult(0, null, "00011", errorInfo.getErrorInfo("00011"));
		}

		if (dto.getDevicetypeuid() == null || dto.getDevicetypeuid().equals("")) {
			return new JsonResult(0, null, "00012", errorInfo.getErrorInfo("00012"));
		}

		Device device = deviceService.getDeviceByDeviceNo(dto.getDeviceno());
		if (device != null) {
			return new JsonResult(0, null, "00013", errorInfo.getErrorInfo("00013"));
		}

		Device d = new Device();
		d.setUid(UuidGenerate.getUuid());
		d.setDeviceno(dto.getDeviceno());
		d.setDevicefmout(dto.getDevicefmout());
		d.setDevicefmrecv(dto.getDevicefmrecv());
		d.setCreatedate(new Date());
		d.setUpdatedate(new Date());
		d.setDevicevol(dto.getDevicevol());
		d.setDevicetypeuid(dto.getDevicetypeuid());
		d.setLatitude(dto.getLatitude());
		d.setLongitude(dto.getLongitude());
		d.setDevicestatus(statusConfig.getDeviceStatus("net_disconnect"));
		d.setDeleted(0);
		int id = deviceService.insertDevice(d);
		returnMap.put("model", id);
		return new JsonResult(1, returnMap);
	}

	@RequestMapping("/detail/multdelete")
	@ResponseBody
	public JsonResult deviceMultDelete(@RequestParam(value = "uids", defaultValue = "") String uids) {
		// System.out.println("deleteAll----"+uids );
		if (uids == null || uids.equals("")) {
			return new JsonResult(0, null, "00014", errorInfo.getErrorInfo("00014"));
		}
		String[] uidArray = uids.split(",");
		if (uidArray != null && uidArray.length > 0) {
			List<String> uidsList = new ArrayList<String>();
			for (String string : uidArray) {
				uidsList.add(string);
			}
			deviceService.deleteDeviceByUids(uidsList);
			return new JsonResult(1, returnMap);
		} else {
			return new JsonResult(0, null, "00014", errorInfo.getErrorInfo("00014"));
		}
	}

	@RequestMapping("/detail/sigledelete")
	@ResponseBody
	public JsonResult deleteSigle(@RequestParam(value = "uid", defaultValue = "") String uid) {
		if (uid == null || uid.equals("")) {
			return new JsonResult(0, null, "00014", errorInfo.getErrorInfo("00014"));
		}
		deviceService.deleteDeviceByUid(uid);
		return new JsonResult(1, returnMap);
	}

	@RequestMapping("detail/preupdate")
	@ResponseBody
	public JsonResult devicePreUpdate(@RequestParam(value = "uid", defaultValue = "") String uid) {
		if (uid == null || uid.equals("")) {
			return new JsonResult(0, null, "00015", errorInfo.getErrorInfo("00015"));
		}
		Device d = deviceService.getDeviceByUid(uid);
		if (d == null) {
			return new JsonResult(0, null, "00015", errorInfo.getErrorInfo("00015"));
		}
		DeviceDto model = new DeviceDto();
		model.setDevicefmout(d.getDevicefmout());
		model.setDevicefmrecv(d.getDevicefmrecv());
		model.setDevicevol(d.getDevicevol());
		model.setLatitude(d.getLatitude());
		model.setLongitude(d.getLongitude());
		model.setUid(d.getUid());
		model.setDeviceno(d.getDeviceno());
		model.setDevicetypeuid(d.getDevicetypeuid());
		returnMap.put("model", model);

		List<DeviceType> types = deviceTypeService.getAllDeviceType();
		if (types != null) {
			returnMap.put("types", types);
		} else {
			returnMap.put("types", null);
		}
		return new JsonResult(1, returnMap);
	}

	@RequestMapping("detail/update")
	@ResponseBody
	public JsonResult deviceUpdate(@ModelAttribute DeviceDto deviceDto) {
		if (deviceDto.getUid() == null || deviceDto.getUid().equals("")) {
			return new JsonResult(0, null, "00015", errorInfo.getErrorInfo("00015"));
		}
		Device d = deviceService.getDeviceByUid(deviceDto.getUid());
		if (d == null) {
			return new JsonResult(0, null, "00015", errorInfo.getErrorInfo("00015"));
		}

		// DeviceDto model = new DeviceDto();
		d.setDevicefmout(deviceDto.getDevicefmout());
		d.setDevicefmrecv(deviceDto.getDevicefmrecv());
		d.setDevicevol(deviceDto.getDevicevol());
		d.setLatitude(deviceDto.getLatitude());
		d.setLongitude(deviceDto.getLongitude());
		// model.setUid(deviceDto.getUid());
		d.setDeviceno(deviceDto.getDeviceno());
		d.setDevicetypeuid(deviceDto.getDevicetypeuid());
		int result = deviceService.updateDevice(d);
		returnMap.put("model", result);
		return new JsonResult(1, returnMap);
	}

}
