package com.itwillbs.bookjuk.controller.statistics;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/admin")
public class StatisticsController {

    @GetMapping("/revenueStatic")
    public String revenueAnalytics() {
        return "statistics/revenue_analytics";
    }

    @GetMapping("/customerStatic")
    public String customerAnalytics() {
        return "statistics/customer_analytics";
    }

    @GetMapping("/returnDelayStatic")
    public String returnDelayAnalytics() {
        return "statistics/return_delay_analytics";
    }

    @GetMapping("/bookStatic")
    public String bookAnalytics() {
        return "statistics/book_analytics";
    }


}
