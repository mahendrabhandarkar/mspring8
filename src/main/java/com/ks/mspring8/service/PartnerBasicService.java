package com.ks.mspring8.service;

import com.ks.mspring8.dto.PartnerBasicDTO;
import com.ks.mspring8.entity.PartnerBasic;
import com.ks.mspring8.repository.PartnerBasicRepository;
import com.ks.mspring8.vo.PartnerBasicQueryVO;
import com.ks.mspring8.vo.PartnerBasicUpdateVO;
import com.ks.mspring8.vo.PartnerBasicVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class PartnerBasicService {

    @Autowired
    private PartnerBasicRepository partnerBasicRepository;

    public Integer save(PartnerBasicVO vO) {
        PartnerBasic bean = new PartnerBasic();
        BeanUtils.copyProperties(vO, bean);
        bean = partnerBasicRepository.save(bean);
        return bean.getId();
    }

    public void delete(Integer id) {
        partnerBasicRepository.deleteById(id);
    }

    public void update(Integer id, PartnerBasicUpdateVO vO) {
        PartnerBasic bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        partnerBasicRepository.save(bean);
    }

    public PartnerBasicDTO getById(Integer id) {
        PartnerBasic original = requireOne(id);
        return toDTO(original);
    }

    public Page<PartnerBasicDTO> query(PartnerBasicQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private PartnerBasicDTO toDTO(PartnerBasic original) {
        PartnerBasicDTO bean = new PartnerBasicDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private PartnerBasic requireOne(Integer id) {
        return partnerBasicRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
