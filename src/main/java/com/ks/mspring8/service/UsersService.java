package com.ks.mspring8.service;

import com.ks.mspring8.dto.UsersDTO;
import com.ks.mspring8.entity.Users;
import com.ks.mspring8.repository.UsersRepository;
import com.ks.mspring8.vo.UsersQueryVO;
import com.ks.mspring8.vo.UsersUpdateVO;
import com.ks.mspring8.vo.UsersVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public Long save(UsersVO vO) {
        Users bean = new Users();
        BeanUtils.copyProperties(vO, bean);
        bean = usersRepository.save(bean);
        return bean.getId();
    }

    public void delete(Long id) {
        usersRepository.deleteById(id);
    }

    public void update(Long id, UsersUpdateVO vO) {
        Users bean = requireOne(id);
        BeanUtils.copyProperties(vO, bean);
        usersRepository.save(bean);
    }

    public UsersDTO getById(Long id) {
        Users original = requireOne(id);
        return toDTO(original);
    }

    public Page<UsersDTO> query(UsersQueryVO vO) {
        throw new UnsupportedOperationException();
    }

    private UsersDTO toDTO(Users original) {
        UsersDTO bean = new UsersDTO();
        BeanUtils.copyProperties(original, bean);
        return bean;
    }

    private Users requireOne(Long id) {
        return usersRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Resource not found: " + id));
    }
}
