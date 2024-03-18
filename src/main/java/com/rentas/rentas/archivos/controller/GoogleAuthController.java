package com.rentas.rentas.archivos.controller;

import com.rentas.rentas.archivos.model.entity.GoogleAuth;
import com.rentas.rentas.archivos.service.IGoogleAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class GoogleAuthController
{
    @Autowired
    private IGoogleAuth googleAuthService;

    @PostMapping("googleAuth")
    public GoogleAuth create(@RequestBody GoogleAuth googleAuth)
    {
        return googleAuthService.save(googleAuth);
    }

    @PutMapping("googleAuth")
    public GoogleAuth update(@RequestBody GoogleAuth googleAuth)
    {
        return googleAuthService.save(googleAuth);
    }

    @DeleteMapping("googleAuth/{id}")
    public void delete(@PathVariable Long id)
    {
        GoogleAuth googleAuth = googleAuthService.findById(id);
        googleAuthService.delete(googleAuth);
    }

    @GetMapping("googleAuth/{id}")
    public GoogleAuth showById(@PathVariable Long id)
    {
        return googleAuthService.findById(id);
    }
}
