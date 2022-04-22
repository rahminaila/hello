package com.prosigmaka.hello.repository;

import com.prosigmaka.hello.model.entity.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Long>{
}
