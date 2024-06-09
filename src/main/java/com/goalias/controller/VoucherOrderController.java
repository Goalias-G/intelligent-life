package com.goalias.controller;


import com.goalias.dto.Result;
import com.goalias.service.IVoucherOrderService;
import com.tool.goalias.annotation.GoaliasHot;
import com.tool.goalias.enums.FlowGradeEnum;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 高文升
 */
@RestController
@RequestMapping("/voucher-order")
public class VoucherOrderController {

    @Resource
    private IVoucherOrderService voucherOrderService;

    @PostMapping("seckill/{id}")
    @GoaliasHot(grade = FlowGradeEnum.FLOW_GRADE_THREAD,duration = 10,count = 5)
    public Result seckillVoucher(@PathVariable("id") Long voucherId) {
        return voucherOrderService.seckillVoucher(voucherId);
    }
}
