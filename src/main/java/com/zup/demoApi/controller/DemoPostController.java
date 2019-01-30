package com.zup.demoApi.controller;

import com.zup.demoApi.models.DemoModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class DemoPostController {

    @PostMapping
    public ResponseEntity<DemoModel> Inserir(@RequestBody DemoModel demoModel) {
        demoModel.setId(1L);
        return ResponseEntity.ok(demoModel);
    }
}
