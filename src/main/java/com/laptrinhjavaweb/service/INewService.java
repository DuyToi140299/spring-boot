package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.NewDTO;

public interface INewService {
	
	 NewDTO save(NewDTO newDTO); //DTO để gửi ra tương tác vs view nên cần trả về, entity để lưu xuống csdl mà không ảnh hưởng trực tiếp đến dto
	 //NewDTO update(NewDTO newDTO);
	 void delete(long[] ids);
}
