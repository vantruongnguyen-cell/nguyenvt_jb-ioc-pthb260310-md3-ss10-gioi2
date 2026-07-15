package org.example.session10.controller;

import org.example.session10.dto.ApiResponse;
import org.example.session10.entity.Doctor;
import org.example.session10.entity.Meta;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DoctorController {

    @GetMapping("/doctors")
    public ResponseEntity<ApiResponse<List<Doctor>>> getDoctors() {

        List<Doctor> doctors = Arrays.asList(
                new Doctor(1L, "Nguyen Van A", "Cardiology"),
                new Doctor(2L, "Tran Thi B", "Neurology")
        );

        Meta meta = new Meta(2, 1);

        ApiResponse<List<Doctor>> response =
                new ApiResponse<>(
                        "success",
                        200,
                        doctors,
                        meta
                );

        return ResponseEntity.ok(response);
    }
}