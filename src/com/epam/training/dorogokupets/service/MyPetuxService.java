package com.epam.training.dorogokupets.service;

public class MyPetuxService implements MyService {
    @Override
    public void kudaxtat(String message) {
        System.out.println("Inside Petux Service " + message);
    }
}
