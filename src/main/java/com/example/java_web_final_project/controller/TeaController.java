package com.example.java_web_final_project.controller;


import com.example.java_web_final_project.Service.TeaService;
import com.example.java_web_final_project.controller.dto.TeaDto;
import com.example.java_web_final_project.entity.Tea;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tea")
public class TeaController {


    private final TeaService teaService;

    public TeaController(TeaService teaService){
        this.teaService=teaService;
    }

    @CrossOrigin("*")
    @GetMapping
    public List<Tea> getAll(){
        return this.teaService.getAll();
    }

    @CrossOrigin("*")
    @PostMapping("/newtea")
    public void newTea(@RequestBody TeaDto teaDto){
        this.teaService.addTea(teaDto);
    }

    @CrossOrigin("*")
    @PutMapping("/{id}")
    public Tea updateTea(@RequestBody TeaDto teaDto, @PathVariable Integer id){
        Tea teaFound=this.teaService.findById(id);
        teaFound.setTeaName(teaDto.getName());
        teaFound.setBenefits(teaDto.getBenefits());
        teaFound.setBrewTime(teaDto.getBrewTime());
        return this.teaService.save(teaFound);
    }

    @CrossOrigin("*")
    @DeleteMapping("/{id}")
    public void deleteTea(@PathVariable Integer id){

        this.teaService.delete(id);
    }




}
