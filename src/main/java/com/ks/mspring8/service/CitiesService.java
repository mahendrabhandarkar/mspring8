package com.ks.mspring8.service;

import com.ks.mspring8.dto.CitiesDTO;
import com.ks.mspring8.entity.Cities;
import com.ks.mspring8.repository.CitiesRepository;
import com.ks.mspring8.vo.CitiesQueryVO;
import com.ks.mspring8.vo.CitiesUpdateVO;
import com.ks.mspring8.vo.CitiesVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CitiesService {

    @Autowired
    private CitiesRepository citiesRepository;

    public Integer save(CitiesVO vO) {
        Cities bean = new Cities();
        BeanUtils.copyProperties(vO, bean);
        bean = citiesRepository.save(bean);
        return bean.getId();
    }

    public void delete(Integer id) {
        citiesRepository.deleteById(id);
    }

    public void update(Integer id, CitiesUpdateVO vO) {
        Cities bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        citiesRepository.save(bean);
    }

    public CitiesDTO getById(Integer id) {
        Cities original = requireOne(id);
        return toDTO(original);
    }

    public Page<CitiesDTO> query(CitiesQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private CitiesDTO toDTO(Cities original) {
        CitiesDTO bean = new CitiesDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Cities requireOne(Integer id) {
        return citiesRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
