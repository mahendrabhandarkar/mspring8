package com.ks.mspring8.controller.api;

import com.ks.mspring8.dto.UsersDTO;
import com.ks.mspring8.service.UsersService;
import com.ks.mspring8.vo.UsersQueryVO;
import com.ks.mspring8.vo.UsersUpdateVO;
import com.ks.mspring8.vo.UsersVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.Valid;

@Validated
@RestController
@RequestMapping("/api/v1/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping
    public String save(@Valid @RequestBody UsersVO vO) {
        return usersService.save(vO).toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@Valid @NotNull @PathVariable("id") Long id) {
        usersService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@Valid @NotNull @PathVariable("id") Long id,
                       @Valid @RequestBody UsersUpdateVO vO) {
        usersService.update(id, vO);
    }

    @GetMapping("/{id}")
    public UsersDTO getById(@Valid @NotNull @PathVariable("id") Long id) {
        return usersService.getById(id);
    }

    @GetMapping
    public Page<UsersDTO> query(@Valid UsersQueryVO vO) {
        return usersService.query(vO);
    }
}
