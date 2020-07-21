package org.epragati.tickets.mappers;

import org.epragati.tickets.dto.CitizenDTO;
import org.epragati.tickets.utills.TicketBaseMapper;
import org.epragati.tickets.vo.CitizenVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicketMapper extends TicketBaseMapper<CitizenVO, CitizenDTO> {

	@Autowired
	private TicketCommonMapper ticketCommonMapper;

	private CitizenVO vo;
	private CitizenDTO dto;

	@Override
	public CitizenVO convertEntity(CitizenDTO dto) {
		vo = new CitizenVO();

		funPoint(dto.getDistrict(), vo::setDistrict);
		funPoint(dto.getMobileNo(), vo::setMobileNo);
		funPoint(dto.getOfficeName(), vo::setOfficeName);
		if (dto.getCommon() != null) {
			funPoint(ticketCommonMapper.convertEntity(dto.getCommon()), vo::setCommonVO);
		}

		return vo;
	}

	@Override
	public CitizenDTO convertVO(CitizenVO vo) {
		dto = new CitizenDTO();
		funPoint(vo.getDistrict(), dto::setDistrict);
		funPoint(vo.getMobileNo(), dto::setMobileNo);
		funPoint(vo.getOfficeName(), dto::setOfficeName);
		if (vo.getCommonVO() != null) {
			funPoint(ticketCommonMapper.convertVO(vo.getCommonVO()), dto::setCommon);
		}

		return dto;
	}

}
