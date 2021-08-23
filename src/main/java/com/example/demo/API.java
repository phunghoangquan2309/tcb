package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class API {
	@Autowired
	NguoiDungRepository nguoidungRepo;
	@PostMapping("/send")
	public String send(@RequestBody NguoiDung ngdung) {
		NguoiDungEntity nguoidung = new NguoiDungEntity();
		nguoidung.setHoten(ngdung.getHoten());
		nguoidung.setEmail(ngdung.getEmail());
		nguoidung.setNoidung(ngdung.getNoidung());
		nguoidung.setSdt(ngdung.getSdt());
		nguoidungRepo.save(nguoidung);
		return "success";
	}
	@GetMapping("/getlist")
	public List<NguoiDung> getlist() {
		List<NguoiDungEntity> listnguoidung = nguoidungRepo.findAll();
		List<NguoiDung> listngdungrespone = new ArrayList<NguoiDung>() ;
		for (NguoiDungEntity nguoiDungEntity : listnguoidung) {
			NguoiDung a = new NguoiDung();
			a.setEmail(nguoiDungEntity.getEmail());
			a.setHoten(nguoiDungEntity.getHoten());
			a.setNoidung(nguoiDungEntity.getNoidung());
			a.setSdt(nguoiDungEntity.getSdt());
			a.setId(nguoiDungEntity.getId());
			listngdungrespone.add(a);
		}
		return listngdungrespone;
	}
	
}
