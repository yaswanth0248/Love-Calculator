package org.epragati.tickets.mappers;

import org.epragati.tickets.dto.CommonDTO;
import org.epragati.tickets.utills.TicketBaseMapper;
import org.epragati.tickets.vo.CommonVO;
import org.springframework.stereotype.Component;

@Component
public class TicketCommonMapper extends TicketBaseMapper<CommonVO, CommonDTO> {

	
	
	@Override
	public CommonVO convertEntity(CommonDTO dto) {
		CommonVO vo = new CommonVO();
		funPoint(dto.getDescription(), vo::setDescription);
		funPoint(dto.getRegSubTypes(), vo::setRegSubTypes);
		funPoint(dto.getOfficeCode(), vo::setOfficeCode);
		funPoint(dto.getticketModule(),vo::setticketModule);
		return vo;
	}

	@Override
	public CommonDTO convertVO(CommonVO vo) {
		CommonDTO dto = new CommonDTO();
		funPoint(vo.getDescription(), dto::setDescription);
		funPoint(vo.getRegSubTypes(), dto::setRegSubTypes);
		funPoint(vo.getOfficeCode(), dto::setOfficeCode);
		funPoint(vo.getticketModule(), dto::setticketModule);
		return dto;
	}


}
