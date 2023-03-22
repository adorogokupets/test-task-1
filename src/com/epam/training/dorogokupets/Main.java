package com.epam.training.dorogokupets;

import com.epam.training.dorogokupets.service.MyChickenService;
import com.epam.training.dorogokupets.service.MyPetuxService;
import com.epam.training.dorogokupets.service.MyService;

public class Main {

    public static void main(String[] args) {
        String message1 = "kuka-reku";
        String message2 = "co-co-co";

        MyService myCheckenService = new MyChickenService();
        myCheckenService.kudaxtat(message2);

        MyChickenService mypetuxservice = new MyChickenService();
        mypetuxservice.kudaxtat(message1);

        MyService myPetuxService = new MyPetuxService();
        myPetuxService.kudaxtat(message1);

        MyChickenService.kudaxtat2(message1);
    }
}