package com.scheduleTask.demoSchdule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Component;

@Component
public class BookCounter {

    private final BookRepository bookRepository;
    Logger logger = LoggerFactory.getLogger(BookCounter.class);
     @Autowired
    public BookCounter(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Scheduled(fixedDelay = 10000)
    public void counter( ){
       long count =  bookRepository.count();

        System.out.println("The total number of the book in the database : " + count);

    }


}
