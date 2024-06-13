package com.example.drivewatch.dataprovider.database.repository;

import com.example.drivewatch.dataprovider.database.entity.Register;
import org.springframework.data.repository.CrudRepository;

public interface RegisterRepository  extends CrudRepository<Register, String> {
}
