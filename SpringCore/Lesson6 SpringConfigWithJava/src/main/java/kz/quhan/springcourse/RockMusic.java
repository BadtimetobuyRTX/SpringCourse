package kz.quhan.springcourse;

import org.springframework.stereotype.Component;


public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Skillet";
    }
}
