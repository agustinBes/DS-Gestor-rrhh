package com.practical.consultora_rrhh.interfaces.services;

import com.practical.consultora_rrhh.dto.request.preguntaDtoCreate;
import com.practical.consultora_rrhh.dto.response.factorDto;
import jakarta.persistence.Id;
import org.springframework.stereotype.Repository;

@Repository
public interface IserviceFactor extends IserviceCRUD<Id, factorDto, preguntaDtoCreate>, IvalidarExistenciaNombreCodigoService<factorDto> {


}
