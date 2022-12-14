package com.example.java_web_final_project.Service;


import com.example.java_web_final_project.controller.dto.TeaDto;
import com.example.java_web_final_project.entity.Tea;
import com.example.java_web_final_project.repository.TeaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeaService {

    private final TeaRepository teaRepository;

    public TeaService(TeaRepository teaRepository){
        this.teaRepository=teaRepository;
    }


    public List<Tea> getAll() {
        return this.teaRepository.findAll();
    }

    public void addTea(TeaDto teaDto) {
        Tea newTea=new Tea();

        newTea.setTeaName(teaDto.getName());
        newTea.setBenefits(teaDto.getBenefits());
        newTea.setBrewTime(teaDto.getBrewTime());

        this.teaRepository.save(newTea);
    }

    public Tea findById(Integer id) {
        Optional<Tea> tea=this.teaRepository.findById(id);
        if(!tea.isPresent()){
            return null;
        }

        Tea teaFound=tea.get();
        return teaFound;
    }

    public Tea save(Tea teaFound) {
        return this.teaRepository.save(teaFound);
    }

    public void delete(Integer id) {
       Optional<Tea> teatoDelete= this.teaRepository.findById(id);
       Tea deleteTea=teatoDelete.get();
       this.teaRepository.delete(deleteTea);
    }
}
