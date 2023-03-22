package com.epam.training.dorogokupets.service;

public class MyChickenService implements MyService {
    @Override
    public void kudaxtat(String message) {
        System.out.println("Inside chicken service " + message);
    }
    public void kudaxtat2(String tampam) {
        System.out.println("Inside chicken service " + tampam);
    }
}
