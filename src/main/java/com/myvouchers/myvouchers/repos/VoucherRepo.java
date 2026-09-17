package com.myvouchers.myvouchers.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myvouchers.myvouchers.model.Voucher;
public interface VoucherRepo extends JpaRepository<Voucher,Long> {
    Voucher findByCode(String code);
}
